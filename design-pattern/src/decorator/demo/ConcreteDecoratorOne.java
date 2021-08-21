package decorator.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.20
 * @GitHub https://github.com/AbrahamTemple/
 * @description: 就新版本蓝图做新版本一号实现
 */
public class ConcreteDecoratorOne extends Decorator{

    public ConcreteDecoratorOne(Component component) {
        super(component);
    }

    @Override
    public void operation() {

        component.operation(); //老版本功能
        System.out.println("删除组件..."); //新版本功能
    }
}
