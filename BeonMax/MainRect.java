package BeonMax;

public class MainRect {
    public static void main(String[] args) {
        Rect rectangle = new Rect();
        rectangle.getTheParameters(10, 5);
        System.out.println(rectangle.perimeterRectangle());
        System.out.println(rectangle.areaRectangle());
    }
}
