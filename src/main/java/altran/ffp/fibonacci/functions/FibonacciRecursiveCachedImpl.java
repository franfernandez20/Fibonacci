package altran.ffp.fibonacci.functions;

import java.math.BigInteger;
import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component("recursiveCached")
public class FibonacciRecursiveCachedImpl implements Fibonacci {

	// Used as a simple cache to increase the performance of cachedRecursiveFibonacci in execution an between executions 
	static HashMap<Integer,BigInteger> cache = new HashMap<Integer,BigInteger>();
	
	@Override
	public BigInteger calculate(int num) {
		if (num < 0) return BigInteger.valueOf(-1);
    	if (num == 1 || num == 0) return BigInteger.valueOf(num);
    	
    	if(cache.get(num) == null) {
    		cache.put(num, calculate(num - 1).add(calculate(num - 2)));
    	}
    	return cache.get(num);
	}

}
