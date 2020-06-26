package mypackage.LambdaStreams;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;


public class PalinCheckTest 
{
	@Test
	public void test() {
		Assert.assertArrayEquals(new String[]{"aba","aca"}, PalinCheck.palindrome(Arrays.asList("aba","aca","abab")).toArray());
		Assert.assertArrayEquals(new String[]{"abcdcba","sravannavars"}, PalinCheck.palindrome(Arrays.asList("abcdcba","afga","sravannavars")).toArray());
	}
}
