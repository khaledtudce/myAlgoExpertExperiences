package leetCode;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AccountMergeTest {

	@Test
	public void test() {

		AccountMerge obj = new AccountMerge();
		List<List<String>> inputAccount = createInputAccount();
		List<List<String>> outputAccount = createOutputAccount();
		assertThat(obj.accountsMerge(inputAccount)).isEqualTo(outputAccount);
	}

	private List<List<String>> createInputAccount() {
		List<List<String>> inputAccount = new ArrayList<List<String>>();
		inputAccount.add(new ArrayList<String>(){{add("John");add("johnsmith@mail.com"); add("john_newyork@mail.com");}});
		inputAccount.add(new ArrayList<String>(){{add("John");add("johnsmith@mail.com");add("john00@mail.com");}});
		inputAccount.add(new ArrayList<String>(){{add("Mary");add("mary@mail.com");}});
		inputAccount.add(new ArrayList<String>(){{add("John");add("johnnybravo@mail.com");}});
		
		return inputAccount;
	}
	
	private List<List<String>> createOutputAccount() {				
		List<List<String>> outputAccount = new ArrayList<List<String>>();
		outputAccount.add(new ArrayList<String>(){{add("John");add("johnnybravo@mail.com");}});
		outputAccount.add(new ArrayList<String>(){{add("John");add("johnsmith@mail.com");add("john00@mail.com");add("john_newyork@mail.com");}});
		outputAccount.add(new ArrayList<String>(){{add("Mary");add("mary@mail.com");}});
		
		return outputAccount;
	}

}
