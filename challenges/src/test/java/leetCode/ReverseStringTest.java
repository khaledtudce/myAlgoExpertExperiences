package leetCode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class ReverseStringTest {
	
	@Test
	public void test() {
		char[] input = new char[] {'H','a','n','n','a','h'};
		char[] output = new char[] {'h','a','n','n','a','H'};
		ReverseString reverseString = new ReverseString();
		assertThat(reverseString.reverseString(input)).isEqualTo(output);
	}
	
	@Test
	public void test1() {
		char[] input = new char[] {'h','e','l','l','o'};
		char[] output = new char[] {'o','l','l','e','h'};
		ReverseString reverseString = new ReverseString();
		assertThat(reverseString.reverseString(input)).isEqualTo(output);
	}
	
	@Test
	public void test2() {
		char[] input = new char[] {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
		char[] output = new char[] {'a','m','a','n','a','P',' ',':','l','a','n','a','c',' ','a',' ',',','n','a','l','p',' ','a',' ',',','n','a','m',' ','A'};
		ReverseString reverseString = new ReverseString();
		assertThat(reverseString.reverseString(input)).isEqualTo(output);
	}
}
