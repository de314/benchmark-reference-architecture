package com.bettercloud.perftest.streams;

import java.util.Date;

public class StreamsPerfTestApplication {

    public static void main(String[] args) throws Exception {
        args = new String[]{
                "stream.*", "-rf", "json", "-rff", "benchmark-result/streams/" + new Date() + ".json",
        };

        org.openjdk.jmh.Main.main(args);
    }
}
