package prototype.demo;

import java.io.*;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.20
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
public class Sheep implements Cloneable, Serializable{

    private String name;
    private String sex;
    private Integer age;
    private Doctor father;

    public Sheep() {
    }

    public Sheep(String name, String sex, Integer age, Doctor father) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
    }

//    @Override
//    protected Sheep clone() throws CloneNotSupportedException {
//        Sheep cloneSheep = (Sheep) super.clone();
//        Doctor father = this.father.clone();
//        cloneSheep.setFather(father); //把克隆后的成员对象设置进去
//        return cloneSheep;
//    }

    //java序列化机制自动深拷贝（前题得实现序列化接口）
    @Override
    protected Sheep clone() throws CloneNotSupportedException {

        ByteArrayOutputStream byteArrayOs = new ByteArrayOutputStream();

        try (ObjectOutputStream oos = new ObjectOutputStream(byteArrayOs)){
            oos.writeObject(this); //将所有成员对象输出到ByteArrayOutputStream
        } catch (IOException e){
            e.printStackTrace();
        }

        ByteArrayInputStream byteArrayIs = new ByteArrayInputStream(byteArrayOs.toByteArray());

        try (ObjectInputStream ois = new ObjectInputStream(byteArrayIs)){
            return (Sheep) ois.readObject(); //将读取到的输入流中的成员对象返回出去
        } catch (Exception e){
            e.printStackTrace();
        }

        return  null; //没有成员对象
    }

    @Override
    public String toString() {
        return super.hashCode()+"---Sheep{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", father=" + father +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Doctor getFather() {
        return father;
    }

    public void setFather(Doctor father) {
        this.father = father;
    }
}
