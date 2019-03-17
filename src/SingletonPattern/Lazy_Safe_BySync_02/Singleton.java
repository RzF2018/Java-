package SingletonPattern.Lazy_Safe_BySync_02;

/**
 * 懒加载
 * 多线程安全
 * 易实现
 * 效率低
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
