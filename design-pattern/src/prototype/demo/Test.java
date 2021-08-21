package prototype.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.20
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Doctor father = new Doctor("Keith Campbell");

        Sheep sheep = new Sheep("Dolly","Female",3,father);

        Sheep cloneSheep = sheep.clone();

        System.out.println(sheep);

        System.out.println(cloneSheep);
    }
}
