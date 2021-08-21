package singleton.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
//饿汉式单例
public class Hungry {
    //保持整个类是私有，外部类就不能实例
    private Hungry(){
    }
    //在内部类实例本身
    private final  static Hungry HUNGRY = new Hungry();

    //返回这个内部类已实例好的Hungry对象（反射）
    public static Hungry getInstance(){
        return HUNGRY;
    }

}
