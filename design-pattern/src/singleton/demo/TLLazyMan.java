package singleton.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
public class TLLazyMan {
    //每个实例只能拿到这么一个交通灯隐藏变量
    private static boolean trafficLight = false;

    private TLLazyMan(){
        synchronized (TLLazyMan.class){
            if (!trafficLight){
                trafficLight = true;
            } else {
                throw new RuntimeException("检测到反射的实例...");
            }
        }
    }
    //给实例对象增加原子性
    private volatile static TLLazyMan LAZYMAN;
    //双重检测锁模式（DCL懒汉式）
    public static TLLazyMan getInstance(){
        if(LAZYMAN == null){
            synchronized (TLLazyMan.class) {
                LAZYMAN = new TLLazyMan();
            }
        }
        return LAZYMAN;
    }

    public static void main(String[] args) throws Exception {
        Constructor<TLLazyMan> declare = TLLazyMan.class.getDeclaredConstructor(null);
        declare.setAccessible(true);//无视有参构造器
        TLLazyMan lazyMan1 = declare.newInstance();
        TLLazyMan lazyMan2 = declare.newInstance();
        System.out.println(lazyMan1);
        System.out.println(lazyMan2);

        // --------------破解方法--------------------

//        Field trafficLight = TLLazyMan.class.getDeclaredField("trafficLight");//选取隐藏变量
//        trafficLight.setAccessible(true);//修改这个隐藏变量可以访问
//        Constructor<TLLazyMan> declare = TLLazyMan.class.getDeclaredConstructor(null);
//        declare.setAccessible(true);//无视有参构造器
//        TLLazyMan lazyMan1 = declare.newInstance();
//        trafficLight.set(lazyMan1,false);//把lazyMan1的这次执行过的隐藏变量值修改成原始值
//        TLLazyMan lazyMan2 = declare.newInstance();
//        System.out.println(lazyMan1);
//        System.out.println(lazyMan2);
    }
}
