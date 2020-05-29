package de.stl.saar.internetentw1.uebungen;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import de.stl.saar.internetentw1.uebungen.MyMath;
import org.junit.jupiter.api.Assertions;

public class MyMathTest
{
	
	@Test
	public void addMyMath()
	{
		assertEquals(MyMath.add(2,3), 5);
	}
	
	@Test
	public void failMyMath()
	{
		Assertions.assertThrows(Exception.class, () -> {MyMath.add(Integer.MAX_VALUE,1);});
	}


	@org.junit.jupiter.api.BeforeEach
	void setUp() {
	}

	@org.junit.jupiter.api.AfterEach
	void tearDown() {
	}

}