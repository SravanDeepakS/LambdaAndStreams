package mypackage.LambdaStreams;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class StartsWithATest 
{
	@Test
	public void test() 
	{
		Assert.assertArrayEquals(new String[]{"abc","afg"}, StartsWithA.StartsaLen3(Arrays.asList("abc","afg","sravan")).toArray());
		Assert.assertArrayEquals(new String[] {"abc", "acs"}, StartsWithA.StartsaLen3(Arrays.asList("abc","bcfd","abcd","acs","sravan")).toArray());
	}
}
