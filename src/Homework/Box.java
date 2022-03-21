package Homework;

public class Box<T> {
    private T name;

    public Box() {
    }

    public Box(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public static <T> void generic(Box <T> name) {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                '}';
    }
}
