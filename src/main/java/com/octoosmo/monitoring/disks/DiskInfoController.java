package com.octoosmo.monitoring.disks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("disks")
public class DiskInfoController {

    @RequestMapping(value = "/{mount_point}", method = RequestMethod.GET)
    public DiskInfo getDiskInfo(){
        return new DiskInfo().setName("sample");
    }
}
