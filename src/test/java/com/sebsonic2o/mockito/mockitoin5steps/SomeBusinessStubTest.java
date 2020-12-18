package com.sebsonic2o.mockito.mockitoin5steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {

	@Test
	void testFindGreatestData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		assertEquals(24, businessImpl.findGreatestData());
	}
}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {24, 6, 15};
	}
}
