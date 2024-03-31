package com.tcs.com.jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;

public class JenkinsCalTest {


	//void test() {
	//	fail("Not yet implemented");
	//}
	@Test
	public void addTest() {
		JenkinsCalc myCalc=new JenkinsCalc();
		assertEquals(10,myCalc.addNumber(5, 5));
	}



	@Test	
	public void subtractTest() {
		JenkinsCalc myCalc=new JenkinsCalc();
		assertEquals(5,myCalc.subtractNumber(10, 5));
	}


	
}
