package algoExpertProblems.Strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class CaesarCypherEncryptorTest {

	@Test
	public void test() {
		CaesarCypherEncryptor obj = new CaesarCypherEncryptor();
		assertThat(obj.caesarCypherEncryptor("xyz", 2)).isEqualTo("zab");
	}
	
	@Test
	public void test1() {
		CaesarCypherEncryptor obj = new CaesarCypherEncryptor();
		assertThat(obj.caesarCypherEncryptor("abc", 52)).isEqualTo("abc");
	}

}
