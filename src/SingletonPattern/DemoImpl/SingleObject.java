package SingletonPattern.DemoImpl;

public class SingleObject {
    //创建singletObject对象
    private static SingleObject instance =
            new SingleObject();
    //私有化构造方法
    private SingleObject(){}
    //提供获取途径
    public static SingleObject getInstance(){
        return instance;
    }
    //方法
    public void showMessage(){
        System.out.println("singleton Pattern");
    }
}
