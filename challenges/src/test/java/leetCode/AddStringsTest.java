package leetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddStringsTest {
	
	AddStrings addStrings = new AddStrings();
	
	@Test
	public void should_make_addition() {
		assertThat(addStrings.addStrings("5","5")).isEqualTo("10");
	}
	
	@Test
	public void should_deal_long() {
		assertThat(addStrings.addStrings("6913259244","71103343")).isEqualTo("6984362587");
	}
	
	@Test
	public void should_not_deal_with_bigger_than_long() {
		assertThat(addStrings.addStrings("3876620623801494171","6529364523802684779"))
		.isEqualTo("10405985147604178950");
	}
	
	@Test
	public void should_not_deal_with_bigger_than_long1() {
		assertThat(addStrings.addStrings("9333852702227987","85731737104263"))
		.isEqualTo("9419584439332250");
	}
}
