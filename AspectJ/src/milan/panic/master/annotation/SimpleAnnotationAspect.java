package milan.panic.master.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareMixin;
import org.aspectj.lang.annotation.DeclarePrecedence;
import org.aspectj.lang.annotation.Pointcut;

import milan.panic.master.common.DefaultInterfaceImpl;
import milan.panic.master.common.ReturnType;
import milan.panic.master.common.SomeInterface;

/** Definicija aspekta */
@Aspect
/** Definisanje redosleda izvrsenja aspekata */
@DeclarePrecedence("Aspect1,Aspect2")
public class SimpleAnnotationAspect {

	/** Definicija taÄ?ke preseka */
	@Pointcut("execution(* milan.panic.master.common.ExampleClass.*(..) )")
	public void PointcutName() {
	}

	/**
	 * Definicija saveta - jedne od najvaÅ¾nijih konstrukcija koje dodaje ili
	 * menja ponaÅ¡anje u taÄ?kama preseka. MoguÄ‡i tipovi saveta su:
	 */
	// @Before("PointcutName()")
	// public void beforePoincut() {
	// /** Telo saveta se izvrÅ¡ava pre taÄ?ke preseka. */
	// }
	@AfterReturning("PointcutName()")
	public void afterReturning() {
		/**
		 * Telo saveta se izvrÅ¡ava nakon izvrÅ¡enja koda koji je definisan
		 * taÄ?kom preseka, ali samo ukoliko se nije dogodio izuzetak.
		 */
	}
	@AfterThrowing("PointcutName()")
	public void afterThrowing() {
		/**
		 * Telo saveta se izvrÅ¡ava nakon izvrÅ¡enja koda koji je definisan
		 * taÄ?kom preseka, ali samo ukoliko se dogodio izuzetak.
		 */
	}
	@After("PointcutName()")
	public void afterPointcut(JoinPoint joinPoint) {
		/**
		 * Telo saveta se izvrÅ¡ava nakon izvrÅ¡enja koda koji je definisan
		 * taÄ?kom preseka. Objedinjuje after returning i after throwing savet.
		 */
	}
	@Around("PointcutName()")
	public ReturnType aroundPointcut(
			ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		/**
		 * Savet koji potpuno okruÅ¾uje taÄ?ku preseka i daje moguÄ‡nost
		 * izvrÅ¡enja proizvoljnog koda oko taÄ?ke preseka. Savet around() ima i
		 * povratnu vrednost koja predstavlja povratnu vrednost koda taÄ?ke
		 * preseka koji je uÄ?auren. Kod taÄ?ke preseka se, ukoliko se to Å¾eli,
		 * izvrÅ¡ava pozivanjem specijalne funkcije proceed().
		 */
		return (ReturnType) proceedingJoinPoint.proceed();
	}

	/** Definicija konstrukcija koje menjaju statiÄ?ku strukturu programa: */
	/** 1.Dodavanje definicije interfejsa klasi. */
	// @DeclareParents(value = "milan.panic.master.common.ExampleClass",
	// defaultImpl = DefaultInterfaceImpl.class)
	public SomeInterface implementedInterface;
	@DeclareMixin("milan.panic.master.common.ExampleClass")
	public SomeInterface declareMixin() {
		return new DefaultInterfaceImpl();
	}
	/** 2.Dodavanje atributa klasi */
	/** 3.Dodavanje metoda klasi */
	/** Nisu podrÅ¾ani zbog same prirode anotacija. */

}
