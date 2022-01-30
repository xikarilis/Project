package lesson3;

public class Task_4 {
    public static void main(String[] args) {
        for (float distance = 10, way=10, days = 1; days <= 6; days++) {
            float norm = (float) (distance * 0.1);
            distance += norm;
            way+=distance;
            System.out.println("В " + days + " " + distance + " км");
            System.out.println(way+"км");
        }
    }
}
