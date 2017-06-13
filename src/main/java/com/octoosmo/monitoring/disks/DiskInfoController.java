package com.octoosmo.monitoring.disks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
//@RequestMapping("disk")
public class DiskInfoController {

    private static final Logger LOG = LogManager.getLogger(DiskInfoController.class);

    @RequestMapping(value = "/disk/{mount_point}", method = RequestMethod.GET)
    public DiskInfo getDiskInfo(@PathVariable("mount_point") String mount_point){
        LOG.debug("sending info about mount_point = {}", mount_point);
        String output = null;
        try {
            output = CommandExecutor.getDiskFreeResult();
        } catch (IOException|InterruptedException e) {
            LOG.error(e.getMessage());
            return new DiskInfo().setName("ERROR");
        }
        Map<String, DiskInfo> diskInfoMap = OutputParser.parseDiskFreeOutput(output);
        return diskInfoMap.get(mount_point);
    }

    @RequestMapping(value = "/disk_list", method = RequestMethod.GET)
    public Map<String, DiskInfo> getDisksMap(){
        String output = null;
        try {
            output = CommandExecutor.getDiskFreeResult();
        } catch (IOException |InterruptedException e) {
            LOG.error(e.getMessage());
        }
        return OutputParser.parseDiskFreeOutput(output);
    }
}
