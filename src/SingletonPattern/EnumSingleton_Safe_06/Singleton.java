package SingletonPattern.EnumSingleton_Safe_06;

/**
 * JDK 1.5+
 * 非懒加载
 * 多线程安全
 * 易实现
 * 支持序列化
 * 不能通过reflection attack调用私有构造方法
 */
public enum Singleton {
    INSTANCE;
    public void whateverMethod(){}
}
