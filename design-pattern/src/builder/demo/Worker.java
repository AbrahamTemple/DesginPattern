package builder.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
//实现蓝图工作的工人
public class Worker extends Blueprint{

    private Product product;

    public Worker(){
        product = new Product(); //工人负责创建产品
    }

    @Override
    void Foundation() {
        product.setFoundation("混凝土地基");
        System.out.println("地基已经构建好了...");
    }

    @Override
    void Wall() {
        product.setWall("黄金墙体");
        System.out.println("墙体已经构建好了...");
    }

    @Override
    void Floor() {
        product.setFloor("翡翠地板");
        System.out.println("地板已经构建好了...");
    }

    @Override
    void Stairs() {
        product.setStairs("钻石楼梯");
        System.out.println("楼梯已经构建好了...");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
