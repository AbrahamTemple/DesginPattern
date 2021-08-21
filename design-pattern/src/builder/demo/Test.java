package builder.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        //指挥
        Director director = new Director();
        //指挥工人完成一个产品
        Product build = director.build(new Worker());
        System.out.println(build.toString());
    }
}
