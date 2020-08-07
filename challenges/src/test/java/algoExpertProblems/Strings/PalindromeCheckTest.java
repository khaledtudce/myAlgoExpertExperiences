package algoExpertProblems.Strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class PalindromeCheckTest {

	@Test
	public void test() {
		PalindromeCheck obj = new PalindromeCheck();
		assertThat(obj.isPalindrome("abcdcba")).isEqualTo(true);
		assertThat(obj.isPalindrome("abba")).isEqualTo(true);
		assertThat(obj.isPalindrome("ab")).isEqualTo(false);
	}

}
