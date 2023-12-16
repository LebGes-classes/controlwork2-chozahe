package game;

public class Sheep extends Enemy {
    @Override
    public void setCoordinates(double x, double y, double z) {
        coordinates[0] = x;
        coordinates[1] = y;
        coordinates[2] = z;
    }
    //создадим константу hf
    public static final double hf = 8;
    //создадим функцию снимающую урон овечке
    public void ouchh(double harm){
        h = h - harm;
    }
    //создадим два конструктора овечек(первый будет с полным здоровьем, второй с предопределенным)
    public Sheep(double x, double y, double z){
        coordinates[0] = x;
        coordinates[1] = y;
        coordinates[2] = z;
        h = hf;
    }

    public Sheep(double x, double y, double z, double h){
        coordinates[0] = x;
        coordinates[1] = y;
        coordinates[2] = z;
        this.h = h;
    }





}
