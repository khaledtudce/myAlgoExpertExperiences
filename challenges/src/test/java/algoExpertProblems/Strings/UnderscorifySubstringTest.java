package algoExpertProblems.Strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class UnderscorifySubstringTest {

	@Test
	public void test() {
		UnderscorifySubstring obj = new UnderscorifySubstring();
		assertThat(obj.underscorifySubstring(
				"testthis is a testtest to see if testestest it works", "test"))
		.isEqualTo("_test_this is a _testtest_ to see if _testestest_ it works");	
	}

	@Test
	public void test1() {
		UnderscorifySubstring obj = new UnderscorifySubstring();
		assertThat(obj.underscorifySubstring(
				"this is a test to see if it works and test", "test"))
		.isEqualTo("this is a _test_ to see if it works and _test_");	
	}
	
	@Test
	public void test2() {
		UnderscorifySubstring obj = new UnderscorifySubstring();
		assertThat(obj.underscorifySubstring(
				"abcabcabcabcabcabcabcabcabcabcabcabcabcabc", "abc"))
		.isEqualTo("_abcabcabcabcabcabcabcabcabcabcabcabcabcabc_");	
	}
	
	@Test
	public void test3() {
		UnderscorifySubstring obj = new UnderscorifySubstring();
		assertThat(obj.underscorifySubstring(
				"tzttztttz", "ttt"))
		.isEqualTo("tzttz_ttt_z");	
	}
	
	@Test
	public void test4() {
		UnderscorifySubstring obj = new UnderscorifySubstring();
		assertThat(obj.underscorifySubstring(
				"abababababababababababababaababaaabbababaa", "a"))
		.isEqualTo("_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_aa_b_a_b_aaa_bb_a_b_a_b_aa_");	
	}
	
	@Test
	public void test5() {
		UnderscorifySubstring obj = new UnderscorifySubstring();
		assertThat(obj.underscorifySubstring(
				"ttttttttttttttbtttttctatawtatttttastvb", "ttt"))
		.isEqualTo("_tttttttttttttt_b_ttttt_ctatawta_ttttt_astvb");	
	}
	
	@Test
	public void test6() {
		UnderscorifySubstring obj = new UnderscorifySubstring();
		assertThat(obj.underscorifySubstring(
				"this is a test to see if it works and test", "bfjawkfja"))
		.isEqualTo("this is a test to see if it works and test");	
	}
}








