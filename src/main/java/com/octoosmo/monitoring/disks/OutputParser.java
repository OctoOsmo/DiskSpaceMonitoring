package com.octoosmo.monitoring.disks;

import java.util.*;

public class OutputParser {

    public static Map<String, DiskInfo> parseDiskFreeOutput(String output){
        Map<String, DiskInfo> diskInfoMap = new HashMap<String, DiskInfo>();
        String[] lines = output.split("\n");
        for (String line : Arrays.asList(lines)) {
            List<String> columns = Arrays.asList(line.split(" +"));
            Iterator<String> iterator = columns.iterator();
            DiskInfo diskInfo = new DiskInfo();
            diskInfo.setName(iterator.next())
                    .setSize(iterator.next())
                    .setUsedSpace(iterator.next())
                    .setAvailableSpace(iterator.next())
                    .setPercentOfUse(iterator.next())
                    .setMountPoint(iterator.next());
            diskInfoMap.put(diskInfo.getMountPoint(), diskInfo);
        }
        return diskInfoMap;
    }
}
