package afternoon.lang.object;

import java.util.Objects;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }


}
