package lesson3;

public class Task_1 {
    public static void main(String[] args) {
        //why did you put amoeba in for? do we need to cycle this variable? Or use inner for?
        int amoeba = 1;
        final  int hour =24;
        for (int time = 0; time <= hour; time += 3) {
            amoeba *= 2;
        }
        System.out.println(amoeba);
    }
}
