package prototype.demo;

import java.io.Serializable;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.20
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
public class Doctor implements Cloneable, Serializable {

    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    @Override
    protected Doctor clone() throws CloneNotSupportedException {
        return (Doctor) super.clone();
    }

    @Override
    public String toString() {
        return super.hashCode()+"---Doctor{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
