import java.util.Scanner;
import java.util.Random;

public class Tema2 {

    public static void main(String[] args) {

        //Ex. 2:
        System.out.println("Sir ex. 2: ");
        Scanner scanner = new Scanner(System.in);
        String sir = scanner.nextLine();

        System.out.println("Ex. 2 a): " + sir.substring(0, 3) + sir.substring(sir.length() - 3));
        System.out.println("Ex. 2 b): " + sir.replaceAll("a", "?"));
        System.out.println("Ex. 2 c): " + sir.lastIndexOf("x"));

        if (sir.substring(0, 1).equalsIgnoreCase(sir.substring(sir.length() - 1)))
            System.out.println("Ex. 2 d): Da");
        else
            System.out.println("Ex. 2 d): Nu");

        //Ex. 3:
        System.out.println("Sir ex. 3: ");
        Scanner scanner2 = new Scanner(System.in);
        String sir2 = scanner2.nextLine();

        //Ex. 4:
        if (sir2.matches("[a-zA-z]+"))
            System.out.println("Ex. 4: Contine doar litere");
        else
            System.out.println("Ex. 4: Nu contine doar litere");

        //Ex. 5:
        System.out.println("Sir ex. 5: ");
        Scanner scanner3 = new Scanner(System.in);
        String sir3 = scanner3.nextLine();

        System.out.println("Ex. 5: " + sir3.substring(sir3.length() / 2, sir3.length() / 2 + 1));
        //System.out.println("Ex. 5: " + sir3.charAt(sir3.length() / 2));

        //Ex. 6:
        System.out.println("Sir ex. 6: ");
        Scanner scanner4 = new Scanner(System.in);
        String sir4 = scanner4.nextLine();

        String caracter = sir4.substring(0, 1);
        int lastIndexOfCaracter = sir4.lastIndexOf(caracter);
        System.out.println("Ex. 6: " + caracter + sir4.substring(1, lastIndexOfCaracter).replaceAll(caracter, caracter.toUpperCase()) + sir4.substring(lastIndexOfCaracter));

        //Ex. 7:
        System.out.println("Nr. ex. 7: ");
        Scanner scanner5 = new Scanner(System.in);
        double nr = scanner5.nextDouble();

        if (nr >= 0 && nr == (int) nr )
            System.out.println("Ex. 7: Este nr. natural");
        else
            System.out.println("Ex. 7: Nu este nr. natural");

        //Ex. 8:
        System.out.println("Nr. ex. 8: ");
        Scanner scanner6 = new Scanner(System.in);
        int nr1 = scanner6.nextInt();

        if (nr1 == 0)
            System.out.println("Ex. 8: E nr. neutru");
        else if (nr1 < 0)
            System.out.println("Ex. 8: E nr. negativ");
        else
            System.out.println("Ex. 8: E nr. pozitiv");

        //Ex. 9:
        System.out.println("Nr. ex. 9: ");
        Scanner scanner7 = new Scanner(System.in);
        int nr2 = scanner7.nextInt();

        if (nr2 >= -2 && nr2 <= 13)
            System.out.println("Ex. 9: Este in interval");
        else
            System.out.println("Ex. 9: Nu este in interval");

        //Ex. 10:
        System.out.println("Nr. ex. 10: ");
        Scanner scanner8 = new Scanner(System.in);
        int nr3 = scanner8.nextInt();
        int nr4 = scanner8.nextInt();

        if (nr3 - nr4 < 5)
            System.out.println("Ex. 10: Diferenta e mai mica");
        else
            System.out.println("Ex. 10: Diferenta nu e mai mica");

        //Ex. 11:
        System.out.println("Nr. ex. 11: ");
        Scanner scanner9 = new Scanner(System.in);
        int nr5 = scanner9.nextInt();

        if (!(nr5 >= 5 && nr5 <= 27))
            System.out.println("Ex. 11: Nu este in interval");
        else
            System.out.println("Ex. 11: Este in interval");

        //Ex. 12:
        System.out.println("Nr. ex. 12: ");
        Scanner scanner10 = new Scanner(System.in);
        int nr6 = scanner10.nextInt();
        int nr7 = scanner10.nextInt();

        if (nr6 == nr7)
            System.out.println("Ex. 12: Sunt egale");
        else if (nr6 > nr7)
            System.out.println("Ex. 12: X e mai mare");
        else
            System.out.println("Ex. 12: Y e mai mare");

        //Ex. 13:
        System.out.println("Nr. ex. 13: ");
        Scanner scanner11 = new Scanner(System.in);
        int nr8 = scanner11.nextInt();
        int nr9 = scanner11.nextInt();
        int nr10 = scanner11.nextInt();

        if (nr8 == nr9 && nr9 == nr10)
            System.out.println("Ex. 13: Triunghi echilateral");
        else if (nr8 == nr9 || nr8 == nr10 || nr9 == nr10)
            System.out.println("Ex. 13: Triunghi isoscel");
        else
            System.out.println("Ex. 13: Triunghi oarecare");

        //Ex. 14:
        System.out.println("Litera ex. 14: ");
        Scanner scanner12 = new Scanner(System.in);
        String sir5 = scanner12.nextLine();
        String litera = sir5.toLowerCase();

        if (litera.equals("a") || litera.equals("e") || litera.equals("i") || litera.equals("o") || litera.equals("u"))
            System.out.println("Ex. 14: Este vocala");
        else
            System.out.println("Ex. 14: Este consoana");

        //Ex. 15:
        System.out.println("Nr. ex. 15: ");
        Scanner scanner13 = new Scanner(System.in);
        double nr11 = scanner13.nextDouble();

        if (nr11 > 9)
            System.out.println("Ex. 15: A");
        else if (nr11 > 8)
            System.out.println("Ex. 15: B");
        else if (nr11 > 7)
            System.out.println("Ex. 15: C");
        else if (nr11 > 6)
            System.out.println("Ex. 15: D");
        else if (nr11 > 4)
            System.out.println("Ex. 15: E");
        else
            System.out.println("Ex. 15: F");

        //Ex. 16:
        System.out.println("Nr. ex. 16: ");
        Scanner scanner14 = new Scanner(System.in);
        int nr12 = scanner14.nextInt();

        if (nr12 >= 1000)
            System.out.println("Ex. 16: Are minim 4 cifre");
        else
            System.out.println("Ex. 16: Are mai putin de 4 cifre");

        //Ex. 17:
        System.out.println("Nr. ex. 17: ");
        Scanner scanner15 = new Scanner(System.in);
        int nr13 = scanner15.nextInt();

        if (nr13 >=100000 && nr13 <= 999999)
            System.out.println("Ex. 17: Are exact 6 cifre");
        else
            System.out.println("Ex. 17: Nu are 6 cifre");

        //Ex. 18:
        System.out.println("Nr. ex. 18: ");
        Scanner scanner16 = new Scanner(System.in);
        int nr14 = scanner16.nextInt();

        if (nr14 % 2 == 0)
            System.out.println("Ex. 18: Este nr. par");
        else
            System.out.println("Ex. 18: Este nr. impar");

        //Ex. 19:
        System.out.println("Nr. ex. 19: ");
        Scanner scanner17 = new Scanner(System.in);
        int nr15 = scanner17.nextInt();
        int nr16 = scanner17.nextInt();
        int nr17 = scanner17.nextInt();

        if (nr15 > nr16 && nr15 > nr17)
            System.out.println("Ex. 19: X e cel mai mare");
        else if (nr16 > nr15 && nr16 > nr17)
            System.out.println("Ex. 19: Y e cel mai mare");
        else
            System.out.println("Ex. 19: Z e cel mai mare");

        //Ex. 20:
        System.out.println("Nr. ex. 20: ");
        Scanner scanner18 = new Scanner(System.in);
        int nr18 = scanner18.nextInt();
        int nr19 = scanner18.nextInt();
        int nr20 = scanner18.nextInt();

        if (nr18 + nr19 + nr20 == 180)
            System.out.println("Ex. 20: Triunghiul este valid");
        else
            System.out.println("Ex. 20: Triunghiul nu este valid");

        //Ex. 21:
        System.out.println("Lista ex. 21");
        Scanner scanner19 = new Scanner(System.in);

        System.out.println("Varsta: ");
        int varsta = scanner19.nextInt();

        System.out.println("Insotit de mama: ");
        boolean mama = scanner19.nextBoolean();

        System.out.println("Insotit de tata: ");
        boolean tata = scanner19.nextBoolean();

        System.out.println("Pasaport: ");
        boolean pasaport = scanner19.nextBoolean();

        System.out.println("Act permisiune mama: ");
        boolean permisiuneMama = scanner19.nextBoolean();

        System.out.println("Act permisiune tata: ");
        boolean permisiuneTata = scanner19.nextBoolean();

        //Cazuri pentru imbarcare:
        //Caz 1: varsta>=18, mama=false/true, tata=false/true, pasaport=true, permisiuneMama=false/true, permisiuneTata=false/true => Ma pot imbarca
        //Caz 2: varsta<18, mama=true, tata=true, pasaport=true, permisiuneMama=false/true, permisiuneTata=false/true => Ma pot imbarca
        //Caz 3: varsta<18, mama=false/true, tata=true, pasaport=true, permisiuneMama=true, permisiuneTata=false/true => Ma pot imbarca
        //Caz 4: varsta<18, mama=true, tata=false/true, pasaport=true, permisiuneMama=false/true, permisiuneTata=true => Ma pot imbarca
        //Caz 5: varsta<18, mama=false/true, tata=false/true, pasaport=true, permisiuneMama=true, permisiuneTata=true => Ma pot imbarca

        //In restul cazurilor nu se poate face imbarcarea

        if (pasaport) {
            if (varsta >= 18 ||
                    varsta < 18 && mama && tata ||
                    varsta < 18 && permisiuneMama && tata ||
                    varsta < 18 && mama && permisiuneTata ||
                    varsta < 18 && permisiuneMama && permisiuneTata)
                System.out.println("Ex. 21: Ma pot imbarca");
            else
                System.out.println("Ex. 21: Nu ma pot imbarca");
        } else
            System.out.println("Ex. 21: Nu ma pot imbarca");

        //Ex. 22:
        System.out.println("Nr. ex. 22: ");
        Scanner scanner20 = new Scanner(System.in);
        int nr21 = scanner20.nextInt();

        Random random = new Random();
        int min = 1;
        int max = 6;
        int diceRoll = random.nextInt(max - min + 1) + min;

        if (nr21 == diceRoll)
            System.out.println("Ex. 22: Ai castigat! Ai ales " + nr21 + " si zarul a fost " + diceRoll);
        else if (nr21 < diceRoll)
            System.out.println("Ex. 22: Ai pierdut! Ai ales un nr. mai mic. Ai ales " + nr21 + " si zarul a fost " + diceRoll);
        else
            System.out.println("Ex. 22: Ai pierdut! Ai ales un nr. mai mare. Ai ales " + nr21 + " si zarul a fost " + diceRoll);
    }
}
