package milan.panic.master.spring.aop;

import org.springframework.aop.ThrowsAdvice;
/**
 * After throwing savet
 */
public class ThrowException implements ThrowsAdvice {
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		
	}
}