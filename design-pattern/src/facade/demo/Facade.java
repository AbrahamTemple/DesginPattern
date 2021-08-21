package facade.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description: 代理把实例和应用封装好，供客户端直接使用
 */
public class Facade {

    SubSystemOne one = new SubSystemOne();

    SubSystemTwo two = new SubSystemTwo();

    void doSomething(){
        one.work();
        two.work();
    }
}
