package algoExpertProblems.Strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class LongsestSubstringWithoutDuplicationTest {

	@Test
	public void test() {
		LongsestSubstringWithoutDuplication obj = 
				new LongsestSubstringWithoutDuplication();
		
		assertThat(obj.longestSubstringWithoutDuplication2("clementisacap"))
		.isEqualTo("mentisac");
	}
	
	@Test
	public void test4() {
		LongsestSubstringWithoutDuplication obj = 
				new LongsestSubstringWithoutDuplication();
		
		assertThat(obj.longestSubstringWithoutDuplication2("abcdeabcdefc"))
		.isEqualTo("abcdef");
	}
	
	@Test
	public void test1() {
		LongsestSubstringWithoutDuplication obj = 
				new LongsestSubstringWithoutDuplication();
		
		assertThat(obj.longestSubstringWithoutDuplication("a"))
		.isEqualTo("a");
	}
	
	@Test
	public void test2() {
		LongsestSubstringWithoutDuplication obj = 
				new LongsestSubstringWithoutDuplication();
		
		assertThat(obj.longestSubstringWithoutDuplication("abc"))
		.isEqualTo("abc");
	}
	
	@Test
	public void test3() {
		LongsestSubstringWithoutDuplication obj = 
				new LongsestSubstringWithoutDuplication();
		
		assertThat(obj.longestSubstringWithoutDuplication("abcb"))
		.isEqualTo("abc");
	}
	

}
