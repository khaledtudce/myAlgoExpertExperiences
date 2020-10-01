package algoExpertProblems.Strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class PatternMatcherTest {

	@Test
	public void test() {
		PatternMatcher obj = new PatternMatcher();
		assertThat(obj.patternMatcher("xxyxxy","gogopowerrangergogopowerranger"))
		.isEqualTo(new String[] {"go", "powerranger"});	
	}

	@Test
	public void test1() {
		PatternMatcher obj = new PatternMatcher();
		assertThat(obj.patternMatcher("xyxy","abab"))
		.isEqualTo(new String[] {"a", "b"});	
	}
	
	@Test
	public void test2() {
		PatternMatcher obj = new PatternMatcher();
		assertThat(obj.patternMatcher("yxyx","abab"))
		.isEqualTo(new String[] {"b", "a"});	
	}
	
	@Test
	public void test3() {
		PatternMatcher obj = new PatternMatcher();
		assertThat(obj.patternMatcher("yyxyyx","gogopowerrangergogopowerranger"))
		.isEqualTo(new String[] {"powerranger", "go"});	
	}
	
	@Test
	public void test4() {
		PatternMatcher obj = new PatternMatcher();
		assertThat(obj.patternMatcher("xxxx","testtesttesttest"))
		.isEqualTo(new String[] {"test", ""});	
	}
	
	@Test
	public void test5() {
		PatternMatcher obj = new PatternMatcher();
		assertThat(obj.patternMatcher("yyyy","testtesttesttest"))
		.isEqualTo(new String[] {"", "test"});	
	}
}
