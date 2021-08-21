package builder.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
//指挥员（包工头）：指挥工人构建部件
public class Director {

    //指挥工人按照顺序建房子
    public Product build(Blueprint blueprint){
        blueprint.Foundation();
        blueprint.Wall();
        blueprint.Floor();
        blueprint.Stairs();
        return blueprint.getProduct();
    }
}
