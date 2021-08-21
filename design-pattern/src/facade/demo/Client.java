package facade.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description: 直接引用黑盒Facade
 */
public class Client {

    Facade facade = new Facade();

    void doSomething(){
        facade.doSomething();
    }
}
