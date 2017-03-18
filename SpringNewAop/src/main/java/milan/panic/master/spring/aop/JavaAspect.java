/**Java definicija aspekta.*/
package milan.panic.master.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
/**
 * Aspekt definicija je identična @AspectJ-u
 */
@Aspect
public class JavaAspect {
	@Pointcut("execution(* milan.panic.master..Service*.*(..))")
	public void pointcut() {
	}

	@Before("pointcut()")
	public void beforeMethod(JoinPoint joinPoint) {
		System.out.println("Before advice-Java defined aspect.");
	}
}
