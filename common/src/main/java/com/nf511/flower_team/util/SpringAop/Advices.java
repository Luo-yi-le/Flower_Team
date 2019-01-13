package com.nf511.flower_team.util.SpringAop;
import com.nf511.flower_team.util.Log4jUtil.Logging;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * 通知
 */
public class Advices {

    Logging logging=new Logging();

    //前置通知
    public void beforeMethod(JoinPoint joinPoint){
        //注解
        MethodSignature methodSignature=(MethodSignature)joinPoint.getSignature();
        Method method=methodSignature.getMethod();

        System.out.println("--------------------前置通知--------------------");
        System.out.println("方法名："+joinPoint.getSignature().getName()+"，参数："+joinPoint.getArgs().length+"，被代理对象："+joinPoint.getTarget().getClass().getName());
        logging.setInfo("开始写入日志...,方法是："+joinPoint.getSignature().getName());
    }

    //后置通知
    public void afterMethod(JoinPoint joinPoint){
        System.out.println("--------------------后置通知--------------------");
        logging.setInfo("写入日志完成...");
    }

    //返回值通知
    public void afterReturning(JoinPoint joinPoint, Object result){
        System.out.println("--------------------返回结果后通知--------------------");
        System.out.println("结果是："+result);
    }

    //抛出异常通知
    //在方法出现异常时会执行的代码可以访问到异常对象，可以指定在出现特定异常时在执行通知代码
    public void afterThrowing(JoinPoint joinPoint, Exception ex){
        System.out.println("--------------------异常后通知，发生了异常："+ex.getMessage()+"--------------------");
    }

    //环绕通知
    //环绕通知需要携带ProceedingJoinPoint类型的参数
    //环绕通知类似于动态代理的全过程：ProceedingJoinPoint类型的参数可以决定是否执行目标方法。
    //而且环绕通知必须有返回值，返回值即为目标方法的返回值
    public Object aroundMethod(ProceedingJoinPoint pjd) throws Throwable {
        System.out.println("--------------------环绕开始--------------------");
        Object object=pjd.proceed();
        System.out.println("--------------------"+pjd.getSignature().getName()+"环绕结束--------------------");
        return object;
    }
}