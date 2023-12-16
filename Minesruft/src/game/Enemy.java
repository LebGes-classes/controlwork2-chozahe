package game;

public abstract class Enemy {
    //создадим общие пременные и гетеры, сеттеры к ним
    protected double h;
    public double getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
    protected double[] coordinates = new double[3];
    public double[] getCoordinates() {
        return coordinates;
    }

    public abstract void setCoordinates(double x, double y, double z);
}
