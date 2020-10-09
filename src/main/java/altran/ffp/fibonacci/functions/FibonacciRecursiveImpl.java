package altran.ffp.fibonacci.functions;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

@Component("recursive")
public class FibonacciRecursiveImpl implements Fibonacci {

	@Override
	public BigInteger calculate(int num) {
		if (num == 1 || num == 0) return BigInteger.valueOf(num);
    	if (num > 1) return calculate(num - 1).add(calculate(num - 2));
    	//error not valid input
    	return BigInteger.valueOf(-1); 
	}

}
