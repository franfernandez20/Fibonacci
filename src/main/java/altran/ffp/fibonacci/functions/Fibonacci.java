package altran.ffp.fibonacci.functions;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

@Component
public interface Fibonacci {

	BigInteger calculate(int num);
}
