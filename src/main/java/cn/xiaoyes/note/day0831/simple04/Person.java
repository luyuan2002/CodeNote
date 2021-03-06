package cn.xiaoyes.note.day0831.simple04;

public class Person {
    private String name;

    private int height;

    private int weight;

    public Person(){

    }

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void sayHello(){
        System.out.println("Hello, my name is " + getName());
    }
}
