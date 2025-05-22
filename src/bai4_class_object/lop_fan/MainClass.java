package bai4_class_object.lop_fan;

public class MainClass {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1);

        fan2.setSpeed(2);
        System.out.println(fan2);
    }
}
