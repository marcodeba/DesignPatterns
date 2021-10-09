package proxy.cglibProxy;

public class Client {
    public static void main(String[] args) {
//        String filePath = ISubject.class.getResource("").getPath();
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, filePath);

        ISubject cglibProxy = (ISubject) new CglibProxySubject().getCglibProxy(new RealSubject().getClass());
        System.out.println(cglibProxy);
        cglibProxy.requestHouse1();
        cglibProxy.requestHouse2();
    }
}
