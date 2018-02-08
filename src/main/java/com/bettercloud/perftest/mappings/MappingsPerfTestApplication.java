package com.bettercloud.perftest.mappings;

import java.util.Date;

public class MappingsPerfTestApplication {

	public static void main(String[] args) throws Exception {
	    args = new String[]{
	            "-rf", "json", "-rff", "benchmark-result/" + new Date() + ".json"
        };

		org.openjdk.jmh.Main.main(args);
	}
}
