package algoExpertProblems.Strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class LongestPalindromeSubstringTest {

	@Test
	public void test() {
		LongestPalindromeSubstring obj = new LongestPalindromeSubstring();
		assertThat(obj.longestPalindromicSubstring("z234a5abbbba54a32z"))
		.isEqualTo("5abbbba5");
	}
	
	@Test
	public void test1() {
		LongestPalindromeSubstring obj = new LongestPalindromeSubstring();
		assertThat(obj.longestPalindromicSubstring("abaxyzzyxf"))
		.isEqualTo("xyzzyx");
	}

	@Test
	public void test2() {
		LongestPalindromeSubstring obj = new LongestPalindromeSubstring();
		assertThat(obj.longestPalindromicSubstring("it's highnoon"))
		.isEqualTo("noon");
	}
	
	@Test
	public void test4() {
		LongestPalindromeSubstring obj = new LongestPalindromeSubstring();
		assertThat(obj.longestPalindromicSubstring("abcdefgfedcbazzzzzzzzzzzzzzzzzzzz"))
		.isEqualTo("zzzzzzzzzzzzzzzzzzzz");
	}
	
	@Test
	public void test5() {
		LongestPalindromeSubstring obj = new LongestPalindromeSubstring();
		assertThat(obj.longestPalindromicSubstring("a"))
		.isEqualTo("a");
	}
	
	@Test
	public void test6() {
		LongestPalindromeSubstring obj = new LongestPalindromeSubstring();
		assertThat(obj.longestPalindromicSubstring("noon high it is"))
		.isEqualTo("noon");
	}
	
	@Test
	public void test7() {
		LongestPalindromeSubstring obj = new LongestPalindromeSubstring();
		assertThat(obj.longestPalindromicSubstring("abcd efghfedcbaa"))
		.isEqualTo("aa");
	}
}
