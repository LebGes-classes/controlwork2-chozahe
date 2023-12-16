package game;
import java.math.*;
public class Wolf extends Enemy {
    //реализуем абстрактный метод из родителя
    @Override
    public void setCoordinates(double x, double y, double z) {
        coordinates[0] = x;
        coordinates[1] = y;
        coordinates[2] = z;
    }
    protected static final int hf = 20;
    protected static final int d = 4;
    //функция находящаа расстояние от волка до овечки
    private double getDistance(Sheep sheep){
        double Distance = Math.sqrt(Math.pow((coordinates[0] - sheep.coordinates[0]), 2) + Math.pow((coordinates[1] - sheep.coordinates[1]), 2 )+ Math.pow(coordinates[2] - sheep.coordinates[2], 2));
        return Distance;
    }
    //функция наносящая урон овечке
    public void AttackSheep(Sheep sheep){
        double harm = (h/hf) * d / Math.pow(getDistance(sheep), 2);
        System.out.println("Удар равен: " + harm);
        sheep.ouchh(harm);
    }
    //функция расчитывающая сколько собака будет убивать овечку
    public int muchaemovtsu(Sheep sheep){
        int seconds = 0;
        while (sheep.h > 0){
            AttackSheep(sheep);
            for (int i = 0; i <3; i++){
                coordinates[i] = sheep.coordinates[i] + Math.random();
            }
            System.out.println("Здоровье овцы равно: " + sheep.h);
            seconds += 1;
        }
        return seconds;
    }

    //создадим два конструктора собэк(первый будет с полным здоровьем, второй с предопределенным)
    public Wolf(double x, double y, double z){
        coordinates[0] = x;
        coordinates[1] = y;
        coordinates[2] = z;
        h = hf;
    }

    public Wolf(double x, double y, double z, double h){
        coordinates[0] = x;
        coordinates[1] = y;
        coordinates[2] = z;
        this.h = h;

    }


}
