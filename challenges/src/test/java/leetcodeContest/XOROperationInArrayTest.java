package leetcodeContest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class XOROperationInArrayTest {

	@Test
	public void test() {
		XOROperationInArray obj = new XOROperationInArray();
		assertThat(obj.xorOperation(5,0))
		.isEqualTo(8);
	}
	
	@Test
	public void test1() {
		XOROperationInArray obj = new XOROperationInArray();
		assertThat(obj.xorOperation(4,3))
		.isEqualTo(8);
	}
	
	@Test
	public void test2() {
		XOROperationInArray obj = new XOROperationInArray();
		assertThat(obj.xorOperation(1,7))
		.isEqualTo(7);
	}
	@Test
	public void test3() {
		XOROperationInArray obj = new XOROperationInArray();
		assertThat(obj.xorOperation(10,5))
		.isEqualTo(2);
	}

}
