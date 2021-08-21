package decorator.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.20
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
public class Test {
    public static void main(String[] args) {

//        Component component = new ConcreteComponent();
//        component.operation();

//        Component component = new ConcreteDecoratorOne(new ConcreteComponent());
//        component.operation();

        Component component = new ConcreteDecoratorTwo(new ConcreteDecoratorOne(new ConcreteComponent()));
        component.operation();
    }
}
