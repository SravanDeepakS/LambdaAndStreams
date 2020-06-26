package mypackage.LambdaStreams;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class AverageTest 
{

	@Test
	public void test() {
		//fail("Not yet implemented");
		Assert.assertEquals(20,Average.average(Arrays.asList(10,20,30)),0);
		Assert.assertEquals(40,Average.average(Arrays.asList(30,50,40)),0);

	}

}
