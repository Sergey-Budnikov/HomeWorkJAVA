package BeonMax;

public class Rect {
    int length;
    int width;

    public void getTheParameters(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double perimeterRectangle() {
        return (length + width) * 2;
    }

    public double areaRectangle() {
        return length * width;
    }
}

