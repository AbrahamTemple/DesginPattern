package flyweight.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        MapCellNode node1 = new MapCellNode(143,64, MapCellFactory.getMapCell("Frank","Hi, How are you?"));
        MapCellNode node2 = new MapCellNode(231,89, MapCellFactory.getMapCell("Jack","I'm fine, What about you?"));

        MapCellNode node3 = new MapCellNode(143,64, MapCellFactory.getMapCell("Frank","Well, I've worked for 3 year"));
        MapCellNode node4 = new MapCellNode(143,64, MapCellFactory.getMapCell("Frank","And I never had a girlfriend"));
        MapCellNode node5 = new MapCellNode(231,89, MapCellFactory.getMapCell("Jack","That's really sad. I've been in love six times"));
        MapCellNode node6 = new MapCellNode(231,89, MapCellFactory.getMapCell("Jack","Right now, I have two children "));

        System.out.println(node1.cell.getName()+"> "+node1.cell.getData());
        System.out.println(node2.cell.getName()+"> "+node2.cell.getData());
        System.out.println(node3.cell.getName()+"> "+node3.cell.getData());
        System.out.println(node4.cell.getName()+"> "+node4.cell.getData());
        System.out.println(node5.cell.getName()+"> "+node5.cell.getData());
        System.out.println(node6.cell.getName()+"> "+node6.cell.getData());

        System.out.println("用户数量:"+MapCellFactory.getFlyweightSize());
    }
}
