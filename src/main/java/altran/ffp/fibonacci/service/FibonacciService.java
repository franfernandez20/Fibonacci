package altran.ffp.fibonacci.service;

import java.math.BigInteger;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import altran.ffp.fibonacci.utils.FibonacciFunction;


@Service
public class FibonacciService {
	
	// Used as a simple cache to increase the performance of cachedRecursiveFibonacci in execution an between executions 
	static HashMap<Integer,BigInteger> cache = new HashMap<Integer,BigInteger>();
    
    public BigInteger recursiveFibonacci(int num) {
    	if (num == 1 || num == 0) return BigInteger.valueOf(num);
    	if (num > 1) return recursiveFibonacci(num - 1).add(recursiveFibonacci(num - 2));
    	//error not valid input
    	return BigInteger.valueOf(-1); 
    }
    
    public BigInteger cachedRecursiveFibonacci(int num) {
    	if (num < 0) return BigInteger.valueOf(-1);
    	if (num == 1 || num == 0) return BigInteger.valueOf(num);
    	
    	if(cache.get(num) == null) {
    		cache.put(num, cachedRecursiveFibonacci(num - 1).add(cachedRecursiveFibonacci(num - 2)));
    	}
    	return cache.get(num);
    }
    
    public BigInteger lambdaFibonacci(int num) {
    	if (num < 0) return BigInteger.valueOf(-1);
    	return FibonacciFunction.generate(num);
    }

}
