package algoExpertProblems.Tries;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import algoExpertProblems.Tries.MultiStringSearch;

public class MultiStringSearchTest {

	@Test
	public void test1() {
		MultiStringSearch obj = new MultiStringSearch();
		List<Boolean> result = new ArrayList<Boolean>();
		result.add(true);
		result.add(true);
		result.add(false);
		result.add(true);
		result.add(true);
		result.add(false);
		result.add(false);
		
		assertThat(obj.multiStringSearch("Mary goes to the shopping center every week.", 
				new String[] {"to","Mary","centers","shop","shopping","string","kappa"}))
		.isEqualTo(result);
	}
	
	@Test
	public void test() {
		MultiStringSearch obj = new MultiStringSearch();
		List<Boolean> result = new ArrayList<Boolean>();
		result.add(true);
		result.add(false);
		result.add(true);
		result.add(true);
		result.add(false);
		result.add(true);
		result.add(false);
		
		assertThat(obj.multiStringSearch("this is a big string", 
				new String[] {"this","yo","is","a","bigger","string","kappa"}))
		.isEqualTo(result);
	}
}
