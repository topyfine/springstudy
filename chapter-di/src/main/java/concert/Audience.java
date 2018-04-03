package concert;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

    @Pointcut("execution(* concert.Performance.perform())")
    public void pointcut(){}

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

}
