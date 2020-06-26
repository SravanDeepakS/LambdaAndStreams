package mypackage.LambdaStreams;

import java.util.*;
import java.util.function.Function;
public class Average {
	public static int average(List<Integer> a) 
	{
		Function<List<Integer>,Integer> sum = s ->{int u=0; for(Integer i:s) u+=i; return u;};
		Function<List<Integer>, Integer> function = b -> {int y=sum.apply(a); return y/b.size();};
		return function.apply(a);
	}
}
