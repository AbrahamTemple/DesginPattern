package builder.demo;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
public class Product {

    private String foundation;
    private String wall;
    private String floor;
    private String stairs;

    @Override
    public String toString() {
        return "Product{" +
                "foundation='" + foundation + '\'' +
                ", wall='" + wall + '\'' +
                ", floor='" + floor + '\'' +
                ", stairs='" + stairs + '\'' +
                '}';
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getStairs() {
        return stairs;
    }

    public void setStairs(String stairs) {
        this.stairs = stairs;
    }
}
