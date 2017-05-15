package com.octoosmo.monitoring.disks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class DiskInfoApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception{
//        System.out.println("Running");
        SpringApplication.run(DiskInfoApplication.class, args);
//        String output = com.octoosmo.monitoring.disks.CommandExecutor.getMockDiskFreeResult();
//        Map<String, com.octoosmo.monitoring.disks.DiskInfo> diskInfoMap = com.octoosmo.monitoring.disks.OutputParser.parseDiskFreeOutput(output);
//        for (String key : diskInfoMap.keySet()) {
//            System.out.println(diskInfoMap.get(key));
//        }



//        System.out.println(diskInfoMap.get("/"));
//        System.out.println(diskInfoMap.get("/media/Видео"));
//        System.out.println(diskInfoMap.get("/media/Загрузки"));
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DiskInfoApplication.class);
    }
}
