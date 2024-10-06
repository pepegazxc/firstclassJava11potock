import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int c = 25;
        int d = 45;

        System.out.println(a);
        System.out.println(c);
        System.out.println(d);

        int sum = a + c;
        int sub = a - c;
        int mul = a * c;
        int div = a / c;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        double a1 = 10.2;
        double a2 = 15.3;
        double sum1 = a1 + a2;

        System.out.println(sum1);

        float a3 = 10.2f;
        float a4 = 15.3f;
        float sum2 = a4 + a3;
        System.out.println(sum2);

        boolean trueVar = true;
        boolean flaseVar2 = false;

        char digit = '1';
        String digits = "124432";

        boolean sumBool = true || false; // логическое И && логическое или ||

        boolean antiTrueVar = !trueVar;

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println(a1+ " " + str3);

        int calculation = (1 + 2) * 3 * (4 + 8);
        System.out.println(calculation);

        int result = 1 + 2 / (3 * 4) + 6;
        System.out.println(result);

        // прооверить можно ли проджать человеку бутылочку вина
        // если человеку больше 18 но меньше 25 трушно , больше 25  но меньше 65 -  мега трушно если больше 65 но меньше 100 - с валидолом
        System.out.print("Введи свои цифры: ");
        Scanner sc = new Scanner(System.in);
        int ahe = sc.nextInt();

        if (ahe >= 18 && ahe <= 25){
            System.out.println("трушно с паспортом");
        }else if ( ahe >= 25 && ahe <= 65){
            System.out.println("мега  трушно");
        }else if ( ahe >= 65 && ahe <= 100) {
            System.out.println("трушно с валидолом ");
        }else {
            System.out.println("не трушно");
        }





    }
}