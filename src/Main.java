/*  16 option, task 1
* Sylkin Dmytro student Nure KNT-21-4
* email: dmytro.sylkin@nure.ua
* Telegram: @d_ims
* */

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        /*
        * Розділимо формули на дві частини, перша з вводом даних від користувача
        * інша для визначення змінних в формулах
        * */
        System.out.println("--------------------First formula--------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'A' number: "); //користувач вводе змінні
        double a = scanner.nextDouble();
        System.out.println("Enter 'C' number: ");
        double c = scanner.nextDouble();

        double b, m;

        for (m = -2; m <= 2; m += 0.41) { //в цикл помістимо змінні "а" і "b", та з кроком 0.41 вирахуємо результат
            b = Math.cos(a) * Math.cos(2 * a) - Math.sin((Math.PI / 4) + 4 * m) + Math.sin(((3 * Math.PI)/4) + 4 * a) * Math.cos(((7 * Math.PI) / 4) - 5 * c);
            System.out.println("B = " + b); //результат змінної "b"
        }

        System.out.println("--------------------Second formula--------------------");
        double d, t;
        for (d = 2; d <= 15; d++){ //так само як і в першій формулі створимо декілька циклів та вирахуємо кожну із формул залежно від результату попередніх
            for (t = 0; t <= 5; t += 0.5){
                if ((d > t) && (t > 1) && (d > 1)){ //умови для формули №2
                    a = Math.log(t + Math.pow(d, 2));
                } else if (t > 1) {
                    a = Math.sqrt(t * d);
                }else{
                    a = Math.pow(t, 2) * d;
                }
                System.out.println("\tA = " + a); //вивід результату формули для визначення змінної "а"
                for (m = -2; m <= 2; m += 0.41) {
                    b = Math.cos(a) * Math.cos(2 * a) - Math.sin((Math.PI / 4) + 4 * m) +
                        Math.sin(((3 * Math.PI)/4) + 4 * a) * Math.cos(((7 * Math.PI) / 4) - 5 * c);

                    c = Math.pow(Math.tan(a), 3) - 1 + (1 / (Math.pow(Math.cos(d), 2))) -
                            3 * (1 / Math.tan((Math.PI / 2) - Math.pow(b, 3))) * 3 * m;

                    System.out.println("C = " + c); //вивід результату формули для визначення змінної "с"
                }
            }
        }
    }
}