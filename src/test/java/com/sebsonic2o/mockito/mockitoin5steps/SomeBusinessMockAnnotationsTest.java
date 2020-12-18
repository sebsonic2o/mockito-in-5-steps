package com.sebsonic2o.mockito.mockitoin5steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockAnnotationsTest {

	@Mock
	DataService dataServiceMock;

	@InjectMocks
	SomeBusinessImpl businessImpl;

	@Test
	void testFindGreatestData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 6, 15});
		assertEquals(24, businessImpl.findGreatestData());
	}

	@Test
	void testFindGreatestDataForOneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		assertEquals(15, businessImpl.findGreatestData());
	}
}
