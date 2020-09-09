package algoExpertProblems.DynamicProgramming;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

import algoExpertProblems.DynamicProgramming.MaxProfitWithKTransaction;

public class MaxProfitWithKTransactionTest {

	@Test
	public void test() {
		MaxProfitWithKTransaction obj = new MaxProfitWithKTransaction();
		assertThat(obj.maxProfitWithKTransactions1(
				new int[] {5, 11, 3, 50, 60, 90}, 2)).isEqualTo(93);
	}

}
