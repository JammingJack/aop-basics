package aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecondAspect {
    @Pointcut("execution(* test.Application.main(..))")
    public void pointCut1() {

    }

    @Before("pointCut1()")
    public void beforeMain(){
        System.out.println("------------------------------------");
        System.out.println("Before method main from Aspect with AspectJ class syntax ");
        System.out.println("------------------------------------");
    }

    @After("pointCut1()")
    public void afterMain(){
        System.out.println("------------------------------------");
        System.out.println("After method main from Aspect with AspectJ class syntax ");
        System.out.println("------------------------------------");
    }
}
