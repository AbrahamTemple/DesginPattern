package singleton.demo;

import java.lang.reflect.Constructor;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
public class DRLazyMan {
    private DRLazyMan(){
        synchronized (DRLazyMan.class){
            if(LAZYMAN!=null){
                throw new RuntimeException("检测到反射的实例...");
            }
        }
    }
    //给实例对象增加原子性
    private volatile static DRLazyMan LAZYMAN;
    //双重检测锁模式（DCL懒汉式）
    public static DRLazyMan getInstance(){
        if(LAZYMAN == null){
            synchronized (DRLazyMan.class) {
                LAZYMAN = new DRLazyMan();
            }
        }
        return LAZYMAN;
    }

    public static void main(String[] args) throws Exception {
        DRLazyMan DRLazyMan = getInstance();
        Constructor<DRLazyMan> declare = DRLazyMan.class.getDeclaredConstructor(null);
        declare.setAccessible(true);//无视有参构造器
        DRLazyMan DRLazyMan2 = declare.newInstance();
        System.out.println(DRLazyMan);
        System.out.println(DRLazyMan2);
    }
}
