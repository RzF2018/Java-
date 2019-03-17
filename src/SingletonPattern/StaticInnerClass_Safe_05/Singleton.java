package SingletonPattern.StaticInnerClass_Safe_05;

/**
 * 懒加载
 * 多线程安全
 * 实现难度一般
 * 利用classloader机制保证初始化instance只有一个线程
 */
public class Singleton {

    private static class SingletonHolder{
        private static final Singleton INSTANCE =
                new Singleton();
    }
    private Singleton(){}
    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
