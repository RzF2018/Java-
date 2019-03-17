package SingletonPattern.LazyNotSafe_01;

/**
 * 懒加载
 * 多线程非安全
 * 易实现
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
