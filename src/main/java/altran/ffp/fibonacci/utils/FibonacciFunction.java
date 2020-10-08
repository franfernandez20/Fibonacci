package altran.ffp.fibonacci.utils;

import java.math.BigInteger;
import java.util.stream.Stream;

public class FibonacciFunction {	
    
    public static BigInteger generate(int series) {
    	return Stream.iterate(new BigInteger[]{BigInteger.valueOf(0), BigInteger.valueOf(1)}, s -> new BigInteger[]{s[1], s[0].add(s[1])})
    			// Iterates over a tuple applying a sum function between the elements. The output will be the input of the next iteration until limit
    			// Conversion to BigInteger to be able to calculate more than Fibonacci of 92. The max value supported for a Long type.
    			.limit(series + 1)
	    .reduce((a, b) -> b) // Getting only the final value (Fibonacci number), discarding the full Fibonacci sequence
	    .get()[0]; // Extracted the Stream's result value
     }

}
