import java.util.Scanner;

public class Tema3 {

    public static void main(String[] args) {
        //Ex. 1:
        System.out.println("Ex. 1 - Grade Celsius: ");
        Scanner scanner = new Scanner(System.in);
        float gradeC = scanner.nextFloat();

        System.out.println("Ex. 1: " + (gradeC * 1.8 + 32) + " grade F");

        //Ex. 2:
        System.out.println("Nr. ex. 2: ");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        int b = scanner1.nextInt();

        int aux = a;
        a = b;
        b = aux;
        System.out.println("Ex. 2: " + a + " " + b);

        //Ex. 3:
        System.out.println("Ex. 2 - Minute: ");
        Scanner scanner2 = new Scanner(System.in);
        int minute = scanner2.nextInt();

        int zile = minute / 60 / 24;
        System.out.println("Ex. 3: " + (zile / 365) + " an(i) si " + (zile % 365) + " zile");

        //Ex. 4:
        System.out.println("Nr. ex. 4: ");
        Scanner scanner3 = new Scanner(System.in);
        int nr1 = scanner3.nextInt();
        int nr2 = scanner3.nextInt();
        int nr3 = scanner3.nextInt();
        int nr4 = scanner3.nextInt();
        int nr5 = scanner3.nextInt();

        System.out.println("Ex. 4: " + (nr1 + nr2 + nr3 + nr4 + nr5) / 5);

        //Ex. 5:
        System.out.println("Nr. ex. 5: ");
        Scanner scanner4 = new Scanner(System.in);
        int n = scanner4.nextInt();

        if (n >= 5)
            System.out.println("Ex. 5: Promovat");
        else
            System.out.println("Ex. 5: Nepromovat");

        //Ex. 6:
        System.out.println("Nr. ex. 6: ");
        Scanner scanner5 = new Scanner(System.in);
        int nr = scanner5.nextInt();

        if (nr >= 8)
            System.out.println("Ex. 6: Foarte bine");
        else if (nr >= 5)
            System.out.println("Ex. 6: Bine");
        else
            System.out.println("Ex. 6: Insuficient");

        //Ex. 7:
        System.out.println("Nr. ex. 7: ");
        Scanner scanner6 = new Scanner(System.in);
        int nr6 = scanner6.nextInt();

        if (nr6 % 2 == 0)
            System.out.println("Ex. 7: Par");
        else
            System.out.println("Ex. 7: Impar");

        //Ex. 8:
        System.out.println("Nr. ex. 8: ");
        Scanner scanner7 = new Scanner(System.in);
        int nr7 = scanner7.nextInt();
        int min = 0;

        if (nr7 % 10 > min)
            min = nr7 % 10;
        if (nr7 / 100 % 10 > min)
            min = nr7 / 100 % 10;
        if (nr7 % 100 / 10 > min)
            min = nr7 % 100 / 10;
        if (nr7 / 1000 > min)
            min = nr7 / 1000;
        System.out.println("Ex. 8: " + min);

        //Ex. 9:
        System.out.println("Nr. ex. 9: ");
        Scanner scanner8 = new Scanner(System.in);
        int x = scanner8.nextInt();

        switch(x) {
            case 1:
                System.out.println("Ex. 9: Luni");
                break;
            case 2:
                System.out.println("Ex. 9: Marti");
                break;
            case 3:
                System.out.println("Ex. 9: Miercuri");
                break;
            case 4:
                System.out.println("Ex. 9: Joi");
                break;
            case 5:
                System.out.println("Ex. 9: Vineri");
                break;
            case 6:
                System.out.println("Ex. 9: Sambata");
                break;
            case 7:
                System.out.println("Ex. 9: Duminica");
                break;
            default:
                System.out.println("Ex. 9: Nu e nicio zi buna");
        }

        //Ex. 10:
        System.out.println("Nr. ex. 10: ");
        Scanner scanner9 = new Scanner(System.in);
        int c1 = scanner9.nextInt();
        int c2 = scanner9.nextInt();
        int c3 = scanner9.nextInt();

        System.out.println("Ex. 10: " + (c1 * 100 + c2 * 10 + c3));

        //Ex. 11:
        System.out.println("Nr. ex. 10: ");
        Scanner scanner10 = new Scanner(System.in);
        int a1 = scanner10.nextInt();
        int b1 = scanner10.nextInt();

        if (a1 + 1 == b1 || a1 - 1 == b1)
            System.out.println("Ex. 11: Sunt consecutive");
        else
            System.out.println("Ex. 11: Nu sunt consecutive");

        //Ex. 12:
        System.out.println("Nr. ex. 12: ");
        Scanner scanner11 = new Scanner(System.in);
        int luna = scanner11.nextInt();

        switch (luna) {
            case 12, 1, 2: System.out.println("Ex. 12: Iarna"); break;
            case 3, 4, 5: System.out.println("Ex. 12: Primavara"); break;
            case 6, 7, 8: System.out.println("Ex. 12: Vara"); break;
            case 9, 10, 11: System.out.println("Ex. 12: Toamna"); break;
            default: System.out.println("Ex. 12: Nu e luna buna");
        }
    }
}
