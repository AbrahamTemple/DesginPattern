package singleton.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
//懒汉式单例
public class Lazy {
    private Lazy(){
    }

    private static Lazy LAZY;

    public static Lazy getInstance(){
        if(LAZY == null){
            LAZY = new Lazy();
        }
        return LAZY;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                Lazy.getInstance();
            }).start();
        }
    }
}
