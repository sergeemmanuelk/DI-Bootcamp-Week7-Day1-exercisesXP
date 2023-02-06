public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
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

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int[] arr = {x, y};
        return arr;
    }

    @Override
    public String toString() {
        return "(x : " + x + ", y : " + y + ")";
    }

    public double distance(int x, int y) {
        double dist = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
        return dist;
    }
}
