package com.octoosmo.monitoring.disks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by al on 15.05.2017.
 */
public class CommandExecutor {

    public static String getMockDiskFreeResult() throws IOException, InterruptedException {
        return getCommandResult("df_mock.exe");
    }

    public static String getDiskFreeResult() throws IOException, InterruptedException {
        return getCommandResult("df -h");
    }

    private static String getCommandResult(String command) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec(command);

        p.waitFor();
        BufferedReader buf = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        String line = "";
        StringBuilder output = new StringBuilder();

        while ((line = buf.readLine()) != null) {
            output.append(line).append("\n");
        }
        return output.toString();
    }
}
