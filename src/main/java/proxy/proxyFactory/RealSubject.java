package proxy.proxyFactory;

import proxy.staticProxy.IAbstractSubject;

/**
 * 真实角色--房东
 *
 * @author marcopan
 */
public class RealSubject implements IAbstractSubject {

    public void rentHouse() {
        System.out.println("rentHouse from RealSubject");
    }
}
