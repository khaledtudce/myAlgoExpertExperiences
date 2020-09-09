package algoExpertProblems.DynamicProgramming;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import algoExpertProblems.DynamicProgramming.LevenshteinDistance;

public class LevenshteinDistanceTest {

	@Test
	public void test() {
		LevenshteinDistance obj = new LevenshteinDistance();
		assertThat(obj.levenshteinDistance("abc","yabd"))
		.isEqualTo(2);
	}
	
	@Test
	public void test1() {
		LevenshteinDistance obj = new LevenshteinDistance();
		assertThat(obj.levenshteinDistance("","abc"))
		.isEqualTo(3);
	}
	
	@Test
	public void test2() {
		LevenshteinDistance obj = new LevenshteinDistance();
		assertThat(obj.levenshteinDistance("abcdefghij","1234567890"))
		.isEqualTo(10);
	}

	@Test
	public void test3() {
		LevenshteinDistance obj = new LevenshteinDistance();
		assertThat(obj.levenshteinDistance("biting","mitten"))
		.isEqualTo(4);
	}

	@Test
	public void test4() {
		LevenshteinDistance obj = new LevenshteinDistance();
		assertThat(obj.levenshteinDistance("cereal","saturday"))
		.isEqualTo(6);
	}
	
	@Test
	public void test5() {
		LevenshteinDistance obj = new LevenshteinDistance();
		assertThat(obj.levenshteinDistance("gumbo","gambol"))
		.isEqualTo(2);
	}
	
	@Test
	public void test6() {
		LevenshteinDistance obj = new LevenshteinDistance();
		assertThat(obj.levenshteinDistance("algoexpert","algozexpert"))
		.isEqualTo(1);
	}
	
	@Test
	public void test7() {
		LevenshteinDistance obj = new LevenshteinDistance();
		assertThat(obj.levenshteinDistance("xabc","abcx"))
		.isEqualTo(2);
	}
	
	@Test
	public void test8() {
		LevenshteinDistance obj = new LevenshteinDistance();
		assertThat(obj.levenshteinDistance("table","bal"))
		.isEqualTo(3);
	}
	
}
















