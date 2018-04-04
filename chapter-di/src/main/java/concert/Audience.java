package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

    @Pointcut("execution(* concert.Performance.perform())")
    public void pointcut(){}

    @Pointcut("execution(* concert.Performance.perform(String)) && args(title)")
    public void performance(String title){}

    @Before("pointcut()")
    public void takeSeats() {
        System.out.println(">>> take seats.");
    }

    @After("pointcut()")
    public void applause() {
        System.out.println(">>> CLAP CLAP CLAP!");
    }

    @AfterThrowing("pointcut()")
    public void demandRefund() {
        System.out.println(">>> demand refund.");
    }

    @Around("performance(title)")
    public void watchPerformance(ProceedingJoinPoint joinPoint, String title) {
        System.out.println(">>> take seats. watch " + title);
        //被通知对象执行
        try {
            joinPoint.proceed();
            System.out.println(">>> CLAP CLAP CLAP!");
        } catch (Throwable throwable) {
            System.out.println(">>> demand refund.");
        }
    }

}
