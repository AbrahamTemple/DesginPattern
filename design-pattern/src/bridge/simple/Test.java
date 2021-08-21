package bridge.simple;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
public class Test {

    public static void main(String[] args) {

        String Lenevo = new LenevoComputer(new Amd()).describe();
        String Hasee = new HaseeComputer(new Intel()).describe();

        System.out.println(Lenevo);
        System.out.println(Hasee);
    }
}
