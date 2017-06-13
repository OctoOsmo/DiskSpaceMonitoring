package com.octoosmo.monitoring.disks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class DiskInfoApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(DiskInfoApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DiskInfoApplication.class);
    }
}
