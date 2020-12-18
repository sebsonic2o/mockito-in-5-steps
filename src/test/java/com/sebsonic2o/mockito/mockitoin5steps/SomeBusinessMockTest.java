package com.sebsonic2o.mockito.mockitoin5steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessMockTest {

	@Test
	void testFindGreatestData() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 6, 15});

		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(24, businessImpl.findGreatestData());
	}

	@Test
	void testFindGreatestDataForOneValue() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});

		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(15, businessImpl.findGreatestData());
	}
}
