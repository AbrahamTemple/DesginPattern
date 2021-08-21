package flyweight.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description: 地图单元格节点
 */
public class MapCellNode {

    int x;
    int y;
    MapCell cell;

    public MapCellNode(int x, int y, MapCell cell) {
        this.x = x;
        this.y = y;
        this.cell = cell;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MapCell getCell() {
        return cell;
    }

    public void setCell(MapCell cell) {
        this.cell = cell;
    }
}
