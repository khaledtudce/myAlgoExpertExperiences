package algoExpertProblems.Stacks;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class ShortenPathTest {

	@Test
	public void test() {
		ShortenPath obj = new ShortenPath();
		assertThat(obj.shortenPath("/foo/../test/../test/../foo//bar/./baz"))
		.isEqualTo("/foo/bar/baz");	
	}

	@Test
	public void test1() {
		ShortenPath obj = new ShortenPath();
		assertThat(obj.shortenPath("../../foo/bar/baz"))
		.isEqualTo("../../foo/bar/baz");	
	}
	
	@Test
	public void test2() {
		ShortenPath obj = new ShortenPath();
		assertThat(obj.shortenPath("../../foo/../../bar/baz"))
		.isEqualTo("../../../bar/baz");	
	}
	
	@Test
	public void test3() {
		ShortenPath obj = new ShortenPath();
		assertThat(obj.shortenPath(
		"../../../this////one/./../../is/../../going/../../to/be/./././../../../just/eight/double/dots/../../../../../.."))
		.isEqualTo("../../../../../../../..");	
	}
	
	@Test
	public void test4() {
		ShortenPath obj = new ShortenPath();
		assertThat(obj.shortenPath(
		"../../../this////one/./../../is/../../going/../../to/be/./././../../../just/eight/double/dots/../../../../../../foo"))
		.isEqualTo("../../../../../../../../foo");	
	}
	
	@Test
	public void test5() {
		ShortenPath obj = new ShortenPath();
		assertThat(obj.shortenPath("./foo/bar"))
		.isEqualTo("foo/bar");	
	}
	
	@Test
	public void test6() {
		ShortenPath obj = new ShortenPath();
		assertThat(obj.shortenPath("foo/../.."))
		.isEqualTo("..");	
	}
	
	@Test
	public void test7() {
		ShortenPath obj = new ShortenPath();
		assertThat(obj.shortenPath("/"))
		.isEqualTo("/");	
	}
	
	@Test
	public void test8() {
		ShortenPath obj = new ShortenPath();
		assertThat(obj.shortenPath("./.."))
		.isEqualTo("..");	
	}

	@Test
	public void test9() {
		ShortenPath obj = new ShortenPath();
		assertThat(obj.shortenPath("/../../foo/../../bar/baz"))
		.isEqualTo("/bar/baz");	
	}
}









