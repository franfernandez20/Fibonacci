package altran.ffp.fibonacci.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import altran.ffp.fibonacci.service.FibonacciService;


@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {
	
	@Autowired
	private FibonacciService fibonacciService;

    @GetMapping("/recursive/{num}")
    public BigInteger getRecursiveNumberFibonacci(@PathVariable("num") int num) {   	
    	return fibonacciService.recursiveFibonacci(num);
    }
    
    @GetMapping("/recursive-cached/{num}")
    public BigInteger getRecursiveCachedFibonacci(@PathVariable("num") int num) {   	
    	return fibonacciService.cachedRecursiveFibonacci(num);
    }
    
    @GetMapping("/iterative/{num}")
    public BigInteger getIterativeSecuenceFibonacci(@PathVariable("num") int num) {   	
    	return fibonacciService.lambdaFibonacci(num);
    }
}
