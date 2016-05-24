package rocketBase;
import static org.junit.Assert.*;

import org.junit.Test;
import rocketBase.RateBLL;
public class rate_test {

	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test
	double InterestRate = 5;
	double Answer = getRate(600);
	void assertEquals("rate_test failed", InterestRate, Answer);
	@Test
	public void test() {
		assert(1==1);
	}

}
