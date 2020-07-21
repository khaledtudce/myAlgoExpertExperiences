package leetcodeContest;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class AvoidFloodInTheCityTest {

//	@Test
//	public void test() {
//		AvoidFloodInTheCity obj = new AvoidFloodInTheCity();
//		assertThat(obj.avoidFlood(new int [] {1,2,3,4}))
//		.isEqualTo(new int [] {-1,-1,-1,-1});	
//	}
//
//	@Test
//	public void test1() {
//		AvoidFloodInTheCity obj = new AvoidFloodInTheCity();
//		assertThat(obj.avoidFlood(new int [] {1,2,0,0,2,1}))
//		.isEqualTo(new int [] {-1,-1,2,1,-1,-1});	
//	}
//	
//	@Test
//	public void test2() {
//		AvoidFloodInTheCity obj = new AvoidFloodInTheCity();
//		assertThat(obj.avoidFlood(new int [] {1,2,0,1,2}))
//		.isEqualTo(new int [] {});	
//	}
//	
//	@Test
//	public void test3() {
//		AvoidFloodInTheCity obj = new AvoidFloodInTheCity();
//		assertThat(obj.avoidFlood(new int [] {69,0,0,0,69}))
//		.isEqualTo(new int [] {-1,69,1,1,-1});	
//	}
//	
//	@Test
//	public void test4() {
//		AvoidFloodInTheCity obj = new AvoidFloodInTheCity();
//		assertThat(obj.avoidFlood(new int [] {10,20,20}))
//		.isEqualTo(new int [] {});	
//	}
//	
//	@Test
//	public void test5() {
//		AvoidFloodInTheCity obj = new AvoidFloodInTheCity();
//		assertThat(obj.avoidFlood(new int [] {1,2,0,0,2,1}))
//		.isEqualTo(new int [] {-1,-1,2,1,-1,-1});	
//	}
	
	@Test
	public void test6() {
		AvoidFloodInTheCity obj = new AvoidFloodInTheCity();
		assertThat(obj.avoidFlood(new int [] {1,2,0,2,3,0,1}))
		.isEqualTo(new int [] {-1,-1,2,-1,-1,1,-1});	
	}
}










































