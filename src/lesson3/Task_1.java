package lesson3;

public class Task_1 {
    public static void main(String[] args) {
        //why did you put amoeba in for? do we need to cycle this variable? Or use inner for?
        for (int amoeba = 1, time = 0; time <= 24; time += 3) {
            System.out.println(amoeba *=2);
        }
    }
}
