package decorator.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.20
 * @GitHub https://github.com/AbrahamTemple/
 * @description: 新版本蓝图
 */
public abstract class Decorator implements Component{

    Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
