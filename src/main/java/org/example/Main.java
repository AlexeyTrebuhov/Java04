//Написать программу возрващающее число, которе без остатка делится на сумма цифр этого числа.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Input member n : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        double m = n;
        double sum = 0;


        while(n != 0){
            //Суммирование цифр числа
            sum += (n % 10);
            n/=10;
        }
        System.out.println("sum =" +sum);

        double s = m / sum;

        if ( m % sum == 0){
            System.out.println ("True " + s);}

        else{
            System.out.println ("False " + s);}

    }
}
