package decorator.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.20
 * @GitHub https://github.com/AbrahamTemple/
 * @description: 老版本实现
 */
public class ConcreteComponent implements Component{

    @Override
    public void operation() {
        System.out.println("添加组件...");
    }
}
