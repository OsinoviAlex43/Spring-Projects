package osinovii.develop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(* osinovii.develop.TaskManager.*(..))")
//    public void logBefore(JoinPoint joinPoint) {
//        System.out.println("Перед вызовом метода: " +
//                joinPoint.getSignature().getName());
//    }
//
//
//    @AfterReturning(value = "execution(* osinovii.develop.TaskManager.*(..))", returning = "result")
//    public void logAfterReturning(JoinPoint joinPoint,
//                                  Object result) {
//        System.out.println("После возвращения результата: " +
//                joinPoint.getSignature().getName() + " результат = " + result);
//    }
//
//    @AfterThrowing(value = "execution(* osinovii.develop.TaskManager.*(..))", throwing = "exception")
//    public void logAfterThrowing(JoinPoint joinPoint, Exception exception) {
//        System.out.println("После выбрасыввания исключения: " + exception.getMessage());
//    }
//
//    @After(value = "execution(* osinovii.develop.TaskManager.*(..))")
//    public void logAfterThrowing(JoinPoint joinPoint) {
//        System.out.println("После выполнения метода: " + joinPoint.getSignature().getName());
//    }
//
//    @Around("execution(* osinovii.develop.TaskManager.*(..))")
//    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("До метода ");
//        Object result = proceedingJoinPoint.proceed();
//        System.out.println("После метода ");
//        return result;
//    }
@Before("@annotation(loggable)")
public void log(JoinPoint joinPoint,
Loggable loggable) {
    for (int i = 0; i < loggable.times(); i++) {
        System.out.printf("Log %s: before method = %s\n",
                loggable.value(),
                joinPoint.getSignature().getName());
    }
}
}










