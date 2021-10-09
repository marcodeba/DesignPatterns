package proxy.proxyFactory;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.framework.ProxyFactory;
/**
 * @author：marco pan
 * @ClassName：ProxyFactoryDemo
 * @Description：
 * @date 2021年10月09日 10:19 上午
 */
public class ProxyFactoryDemo {
    public static void main(String[] args) {
        RealSubject target = new RealSubject();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(target);
        proxyFactory.addAdvice((MethodInterceptor) invocation -> {
            System.out.println("before...");
            Object result = invocation.proceed();
            System.out.println("after...");
            return result;
        });
        RealSubject realSubject = (RealSubject) proxyFactory.getProxy();
        realSubject.rentHouse();
    }
}
