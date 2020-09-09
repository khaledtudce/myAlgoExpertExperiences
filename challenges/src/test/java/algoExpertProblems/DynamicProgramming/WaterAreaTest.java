package algoExpertProblems.DynamicProgramming;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

import algoExpertProblems.DynamicProgramming.WaterArea;

public class WaterAreaTest {

	@Test
	public void test() {
		WaterArea obj = new WaterArea();
		assertThat(obj.waterArea(new int [] 
		{0,8,0,0,5,0,0,10,0,0,1,1,0,3})).isEqualTo(48);	
	}
	
	@Test
	public void test1() {
		WaterArea obj = new WaterArea();
		assertThat(obj.waterArea(new int [] 
		{0,1,0,1,0})).isEqualTo(1);	
	}
	
	@Test
	public void test2() {
		WaterArea obj = new WaterArea();
		assertThat(obj.waterArea(new int [] 
		{0,8,0,0,10,0,0,10,0,0,1,1,0,3})).isEqualTo(49);	
	}
	
	@Test
	public void test3() {
		WaterArea obj = new WaterArea();
		assertThat(obj.waterArea(new int [] 
		{0,100,0,0,10,1,1,10,1,0,1,1,0,100})).isEqualTo(1075);	
	}
	
	@Test
	public void test4() {
		WaterArea obj = new WaterArea();
		assertThat(obj.waterArea(new int [] 
		{0,100,0,0,10,1,1,10,1,0,1,1,0,0})).isEqualTo(39);	
	}
}
