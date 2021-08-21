package singleton.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
public class LazyMan {
    private LazyMan(){
    }

    private static LazyMan LAZYMAN;
    //双重检测锁模式（DCL懒汉式）
    public static LazyMan getInstance(){
        if(LAZYMAN == null){
            synchronized (LazyMan.class) {
                LAZYMAN = new LazyMan();
            }
        }
        return LAZYMAN;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                LazyMan.getInstance();
            }).start();
        }
    }
}
