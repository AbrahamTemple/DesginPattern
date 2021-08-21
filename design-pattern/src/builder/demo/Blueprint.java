package builder.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
//抽象的建造图纸：作建造参考，指明要建造什么部分
public abstract class Blueprint {
    abstract void Foundation(); //地基
    abstract void Wall(); //墙体
    abstract void Floor(); //地板
    abstract void Stairs(); //楼梯

    abstract Product getProduct(); //完工得到产品
}
