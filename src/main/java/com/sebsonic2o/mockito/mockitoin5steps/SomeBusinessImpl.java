package com.sebsonic2o.mockito.mockitoin5steps;

public class SomeBusinessImpl {
	private DataService dataService;

	int findGreatestData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;

		for(int value: data) {
			if(value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}
