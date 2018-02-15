package com.bettercloud.perftest.mappings;

import java.util.Date;

public class MappingsPerfTestApplication {

	public static void main(String[] args) throws Exception {
	    args = new String[]{
				"map.*", "-rf", "json", "-rff", "benchmark-result/mappers/" + new Date() + ".json",
//				"-o", "benchmark-result/mappers/" + new Date() + ".txt"
        };

		org.openjdk.jmh.Main.main(args);
	}
}
