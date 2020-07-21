package leetCode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class ArrangingCoinsTest {

	ArrangingCoins arrangeCoins = new ArrangingCoins();
	
	@Test
	public void should_make_addition() {
		assertThat(arrangeCoins.arrangeCoins(8)).isEqualTo(3);
		assertThat(arrangeCoins.arrangeCoins(1)).isEqualTo(1);
		assertThat(arrangeCoins.arrangeCoins(5)).isEqualTo(2);
		assertThat(arrangeCoins.arrangeCoins(1804289383)).isEqualTo(60070);
		assertThat(arrangeCoins.arrangeCoins(2147483600)).isEqualTo(65535);
		assertThat(arrangeCoins.arrangeCoins(2147483644)).isEqualTo(65535);
		assertThat(arrangeCoins.arrangeCoins(2147483647)).isEqualTo(65535);
	}
}
