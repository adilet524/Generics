package Homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box a1 = new Box<>(23);
        Box a2 = new Box("Maksat");
        Box a3 = new Box(Math.PI);
        Box a4 = new Box(3.44);

        Box.generic(a1);
        Box.generic(a2);
        Box.generic(a3);
        Box.generic(a4);

    }
}
