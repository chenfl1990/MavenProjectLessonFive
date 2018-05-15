package com.cfl.Lesson5MavenDemo;

import org.testng.annotations.Test;

public class TestClassMyself1 {
	@Test
	public void sum() {
		int sum = 0;
		for(int i=0;i<=100;i++) {
			sum = sum +i;
		}
		System.out.println(sum);
	}

}
