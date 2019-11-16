package by.training.epam.ex7.bean;

public class MyDot {

    private int x;
    private int y;

    public MyDot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDot myDot = (MyDot) o;
        return x == myDot.x &&
                y == myDot.y;
    }

    @Override
    public int hashCode() {
        int res = 1, p = 37;
        res = res*p + x;
        res = res*p + y;
        return res;
    }

    @Override
    public String toString() {
        return "MyDot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
