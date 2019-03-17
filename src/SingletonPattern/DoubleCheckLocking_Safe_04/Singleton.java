package SingletonPattern.DoubleCheckLocking_Safe_04;

/**
 * JDK 1.5+
 * 懒加载
 * 多线程安全
 * 实现复杂
 * 具备高性能
 */
public class Singleton {
    private volatile static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
