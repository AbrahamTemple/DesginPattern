package decorator.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.20
 * @GitHub https://github.com/AbrahamTemple/
 * @description: 就新版本蓝图做新版本二号实现
 */
public class ConcreteDecoratorTwo extends Decorator{

    public ConcreteDecoratorTwo(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation(); //老版本功能
        System.out.println("克隆组件..."); //新版本功能
    }
}
