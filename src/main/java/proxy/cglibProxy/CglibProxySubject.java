package proxy.cglibProxy;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxySubject {

    public Object getCglibProxy(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallbacks(new Callback[]{(MethodInterceptor) (o, method, objects, methodProxy) -> {
            // before
            Object result = methodProxy.invoke(clazz.newInstance(), objects);
            // after
            return result;
        }});
        return enhancer.create();
    }
}
