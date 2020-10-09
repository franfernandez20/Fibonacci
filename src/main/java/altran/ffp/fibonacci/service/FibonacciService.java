package altran.ffp.fibonacci.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import altran.ffp.fibonacci.functions.Fibonacci;

@Service
public class FibonacciService {
    
	@Autowired
    @Qualifier("recursive")
    private Fibonacci fibonacciRecursive;
	
	@Autowired
    @Qualifier("recursiveCached")
    private Fibonacci fibonacciRecursiveCached;
	
	@Autowired
    @Qualifier("iterative")
    private Fibonacci fibonacciIterative;
	
    public BigInteger recursiveFibonacci(int num) {
    	return fibonacciRecursive.calculate(num);
    }
    
    public BigInteger cachedRecursiveFibonacci(int num) {
    	return fibonacciRecursiveCached.calculate(num);
    }
    
    public BigInteger lambdaFibonacci(int num) {
    	return fibonacciIterative.calculate(num);
    }

}
