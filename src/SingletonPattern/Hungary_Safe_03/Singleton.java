package SingletonPattern.Hungary_Safe_03;

/**
 * 非懒加载
 * 多线程安全
 * 易实现
 * 浪费内存
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
