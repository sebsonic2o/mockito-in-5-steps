package com.sebsonic2o.mockito.mockitoin5steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListTest {

	@Test
	void testSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());
	}

	@Test
	void testSizeWithMultipleReturns() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
		assertEquals(20, listMock.size());
	}

	@Test
	void testGet() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("something");
		assertEquals("something", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}

	@Test
	void testGetWithGenericParam() {
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("something");
		assertEquals("something", listMock.get(0));
		assertEquals("something", listMock.get(1));
	}
}
