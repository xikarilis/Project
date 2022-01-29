package lesson4;

public class Task_3 {
    public static void main(String[] args) {
        int num= 1;
        int sum=0;
        do {
            System.out.print(num+" ");
            sum+=num;
//            System.out.println(sum+" ");
            num+=2;
        }while (num<=99);//99-const 
        System.out.println(sum);
    }
}
