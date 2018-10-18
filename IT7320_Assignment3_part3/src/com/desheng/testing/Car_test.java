package com.desheng.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.desheng.test.Car;
import com.desheng.test.Weapon;


public class Car_test {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void test_car() {
		
		Car car = new Car();
		car.setId(1);
		car.setName("desheng");
		assertEquals("desheng", car.getName());
	} 
	@Test
	public void test_weapon() {
		Weapon wp = new Weapon();
		List<String> lt = new ArrayList<String>();
		lt.add("desheng");
		lt.add("shengde");
		for(String value: lt)
		assertEquals(lt, wp.getweapon());
		
	}
}
