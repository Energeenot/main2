package test;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Triangle.setAc = 4;
        Triangle.setAb = 5;
        Triangle.setBc = 3;
        Triangle.setHeight= 2;
        System.out.println(Triangle.getP());
        System.out.println(Triangle.getS());

        Circle circle = new Circle();
        Circle.setRadius = 10;
        System.out.println(Circle.getP());
        System.out.println(Circle.getS());
    }
}
