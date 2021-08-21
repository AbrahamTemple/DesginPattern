package singleton.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
public class RLazyMan {
    private RLazyMan(){
    }
    //给实例对象增加原子性
    private volatile static RLazyMan LAZYMAN;
    //双重检测锁模式（DCL懒汉式）
    public static RLazyMan getInstance(){
        if(LAZYMAN == null){
            synchronized (RLazyMan.class) {
                LAZYMAN = new RLazyMan();
            }
        }
        return LAZYMAN;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                RLazyMan.getInstance();
            }).start();
        }
    }
}
