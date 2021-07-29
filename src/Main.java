import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("pick a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int  inputtedNum = input.nextInt();
        if (inputtedNum < 5){
            System.out.println("Enjoy  good luck a friend brings to you");
        }else {
            System.out.println("you shoe selection will make you happy today");
        }
    }
}
