import java.util.Scanner;

public class Tema6 {

    public static void main(String[] args) {
        //Ex. 1:
        System.out.println("Ex. 1: " + ex1());

        //Ex. 2:
        System.out.println("Nr. ex. 2: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ex2(n);

        //Ex. 3:
        System.out.println("Nr. ex. 3: ");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt(), b = scanner1.nextInt(), c = scanner1.nextInt();
        ex3(a, b, c);

        //Ex. 4:
        System.out.println("Sir ex. 4: ");
        Scanner scanner2 = new Scanner(System.in);
        String sir = scanner2.nextLine();
        System.out.println("Ex. 4: " + ex4(sir));

        //Ex. 5:
        System.out.print("Ex. 5I: ");
        ex5I();
        System.out.print("Ex. 5II: ");
        ex5II();
        System.out.print("Ex. 5III: ");
        ex5III();

        //Ex. 6:
        System.out.println("Nr. ex. 6: ");
        Scanner scanner3 = new Scanner(System.in);
        int margInf = scanner3.nextInt(), margSup = scanner3.nextInt();
        ex6(margInf, margSup);
    }

    public static int ex1() {
        int cont = 0;
        for (int i=1000;i<=9999;++i)
            if (i % 67 == 23)
                cont++;
        return cont;
    }

    public static void ex2(int n) {
        System.out.print("Ex. 2: ");
        for (int i=1;i<=n;++i)
            if (n % i == 0)
                System.out.print(i + " ");
        System.out.println();
    }

    public static void ex3(int a, int b, int c) {
        int max, min, medie;
        System.out.println("Ex. 3: ");

        if (a > b && a > c)
            max = a;
        else if (b > a && b > c)
            max = b;
        else
            max = c;

        if (a < c && a < b)
            min = a;
        else if (b < a && b < c)
            min = b;
        else
            min = c;

        medie = (a + b + c) / 3;

        System.out.println("Maximul: " + max);
        System.out.println("Minimul: " + min);
        System.out.println("Media aritmetica: " + medie);
    }

    public static boolean ex4(String sir) {
        for (int i=0;i<sir.length();++i)
            if (sir.charAt(i) == 'a' || sir.charAt(i) == 'A')
                return true;
        return false;
    }

    public static void ex5I() {
        for (int i=0;i<5;++i) {
            System.out.println();
            for (int j=0;j<5;++j) {
                if (i % 2 != 0 && j % 2 == 0 || i % 2 == 0 && j % 2 !=0 && i != 0 && i != 4)
                    System.out.print("+");
                else
                    System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void ex5II() {
        int n = 4;
        for (int i=0;i<7;++i) {
            System.out.println();
            int k;
            if (i <= 3)
                k = i;
            else
                k = 6 - i;
            while (k != 0) {
                System.out.print(" ");
                k--;
            }
            for (int j=0;j<n;++j)
                System.out.print("* ");
            if (i >= 3)
                n++;
            else
                n--;
        }
        System.out.println();
    }

    public static void ex5III() {
        int mijl = 4;
        for (int i=0;i<5;++i) {
            System.out.println();
            int k = 1;
            for (int j=0;j<9;++j) {
                if (j <= mijl && j >= mijl - i) {
                    System.out.print(i + k);
                    k++;
                }
                else if (j > mijl && j <= mijl + i) {
                    k--;
                    System.out.print(i + k - 1);
                }
                else
                    System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static boolean prim(int nr) {
        for (int i=2;i<=nr/2;++i)
            if (nr % i == 0)
                return false;
        return true;
    }

    public static void ex6(int a, int b) {
        System.out.print("Ex. 6: ");
        for (int i=a;i<=b;++i)
            if (prim(i))
                System.out.print(i + " ");
    }
}
