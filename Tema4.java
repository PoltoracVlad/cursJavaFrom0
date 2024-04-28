import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class Tema4 {

    public static void main(String[] args) {
        //Ex. 1:
        System.out.print("Ex. 1: ");
        for (int i=1;i<=10;++i)
            System.out.print(i + " ");
        System.out.println();

        //Ex. 2:
        int i = 1, sum = 0;
        while (i <= 10) {
            sum += i;
            ++i;
        }

        System.out.println("Ex. 2: " + sum);

        //Ex. 3:
        System.out.println("Nr. ex. 3: ");
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt(), t = 0;

        System.out.println("Ex. 3: ");
        do {
            System.out.println(nr + " * " + t + " = " + (nr * t));
            ++t;
        } while (t <= 10);

        //Ex. 4:
        System.out.println("Nr. ex. 4: ");
        Scanner scanner1 = new Scanner(System.in);
        int nr1 = scanner1.nextInt();
        double fact = 1;

        for (int j=1;j<=nr1;++j)
            fact *= j;

        System.out.println("Ex. 4: " + fact);

        //Ex. 5:
        System.out.println("Ex. 5: ");
        int q = 2;
        while (q <= 100) {
            System.out.print(q + " ");
            q += 2;
        }
        System.out.println();

        //Ex. 6:
        System.out.println("Ex. 6: ");
        int l = 1;
        do {
            System.out.print(l + " ");
            l += 2;
        } while (l <= 100);
        System.out.println();

        //Ex. 7:
        System.out.println("Nr. ex. 7: ");
        Scanner scanner2 = new Scanner(System.in);
        int n = scanner2.nextInt(), sum1 = 0;

        for (int z=1;z<=n;++z)
            sum1 += z;

        System.out.println("Ex. 7: " + sum1);

        //Ex. 8:
        System.out.println("Nr. ex. 8: ");
        Scanner scanner3 = new Scanner(System.in);
        int n1 = scanner3.nextInt(), sum2 = 0, v = 1;

        while (v + 1 <= n1) {
            sum2 += v + 1;
            v += 2;
        }

        System.out.println("Ex. 8: " + sum2);

        //Ex. 9:
        System.out.println("Sir ex. 9: ");
        Scanner scanner4 = new Scanner(System.in);
        String sir = scanner4.nextLine();
        int prim = 0, ultim = sir.length() - 1, ok = 1;

        do {
            if (sir.charAt(prim) != sir.charAt(ultim)) {
                System.out.println("Ex. 9: Nu este palindrom");
                ok = 0;
            }
            prim++;
            ultim--;
        } while (prim < ultim);

        if (ok == 1)
            System.out.println("Ex. 9: Este palindrom");

        //Ex. 10:
        System.out.println("Nr. ex. 10: ");
        Scanner scanner5 = new Scanner(System.in);
        int n2 = scanner5.nextInt(), sum3 = 0;

        while (n2 != 0) {
            sum3 += n2 % 10;
            n2 /= 10;
        }

        System.out.println("Ex. 10: " + sum3);
        //Ex. 11:
        System.out.println("Nr. ex. 11: ");
        Scanner scanner6 = new Scanner(System.in);
        int n3 = scanner6.nextInt(), putere = scanner6.nextInt(), prod = 1;

        if (putere == 0)
            System.out.println("Ex. 11: 1");
        else {
            for (int h=0;h<putere;++h)
                prod *= n3;
            System.out.println("Ex. 11: " + prod);
        }

        //Ex. 12:
        System.out.println("Nr. ex. 12: ");
        Scanner scanner7 = new Scanner(System.in);
        int n4 = scanner7.nextInt(), reversed = 0, lung = String.valueOf(n4).length();

        while (n4 != 0) {
            reversed += (n4 % 10 * Math.pow(10, lung - 1));
            lung--;
            n4 /= 10;
        }

        System.out.println("Ex. 12: " + reversed);

        //Ex. 13:
        System.out.println("Nr. ex. 13 (orice inafara de nr. opreste citirea): ");
        Scanner scanner8 = new Scanner(System.in);
        int even = 0, odd = 0;

        while (scanner8.hasNextInt()) {
            int n5 = scanner8.nextInt();
            if (n5 % 2 == 0)
                even += n5;
            else
                odd += n5;
        }

        System.out.println("Ex. 13: ");
        System.out.println("Even sum: " + even);
        System.out.println("Odd sum: " + odd);

        //Ex. 14:
        System.out.println("Nr. ex. 14 (orice inafara de nr. opreste citirea): ");
        Scanner scanner9 = new Scanner(System.in);
        int pos = 0, neg = 0, zeroes = 0;

        while (scanner9.hasNextInt()) {
            int n6 = scanner9.nextInt();
            if (n6 > 0)
                pos++;
            else if (n6 < 0)
                neg++;
            else
                zeroes++;
        }

        System.out.println("Ex. 14: ");
        System.out.println("Positives: " + pos);
        System.out.println("Negatives: " + neg);
        System.out.println("Zeroes: " + zeroes);

        //Ex. 15:
        System.out.println("Nr. ex. 15: ");
        Scanner scanner10 = new Scanner(System.in);
        int largest = 0, smallest = 0, first = 0;

        while (scanner10.hasNextInt()) {
            int n7 = scanner10.nextInt();
            if (first == 0) {
                largest = n7;
                smallest = n7;
                first++;
            }
            else {
                if (n7 > largest)
                    largest = n7;
                if (n7 < smallest)
                    smallest = n7;
            }
        }
        if (first == 0)
            System.out.println("Ex. 15: You haven't read any numbers!");
        else
            System.out.println("Ex. 15: " + largest + " " + smallest);

        //Ex. 16:
        int n8, sum4;

        System.out.print("Ex. 16: ");
        for (int x=1;x<=500;++x) {
            n8 = x;
            sum4 = 0;
            while (n8 != 0) {
                sum4 += Math.pow(n8 % 10, 3);
                n8 /= 10;
            }
            if (sum4 == x)
                System.out.print(x + " ");
        }
        System.out.println();

        //Ex. 17:
        System.out.println("Nr. ex. 17: ");
        Scanner scanner11 = new Scanner(System.in);
        int n9 = scanner11.nextInt(), a = 0, b = 1;

        System.out.print("Ex. 17: ");
        for (int w=0;w<n9;++w) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();

        //Ex. 18:
        System.out.println("Nr. ex. 18: ");
        Scanner scanner12 = new Scanner(System.in);
        int n10 = scanner12.nextInt();
        double sum5 = 0;

        for (int y=1;y<=n10;++y)
            sum5 += (double) 1 / y;

        System.out.println("Ex. 18: " + sum5);

        //Ex. 19:
        System.out.println("Nr. ex. 19: ");
        Scanner scanner13 = new Scanner(System.in);
        int n11 = scanner13.nextInt();

        Random random = new Random();
        int min = 1;
        int max = 10;
        int rand = random.nextInt(max - min + 1) + min;

        System.out.println("Ex. 19: ");
        while (rand != n11) {
            if (n11 > rand)
                System.out.println("Too high, try again!");
            if (n11 < rand)
                System.out.println("Too low, try again!");
            n11 = scanner13.nextInt();
        }
        System.out.println("Congrats! The number was: " + n11);

        //Ex. 20:
        System.out.print("Ex. 20I: ");
        for (int g=0;g<4;++g) {
            System.out.println();
            for (int i1=0;i1<10;++i1)
                System.out.print("*");
        }

        System.out.println();
        System.out.print("Ex. 20II: ");
        int nr2 = 1;
        for (int i2=0;i2<5;++i2) {
            System.out.println();
            for (int j=0;j<nr2;++j)
                System.out.print("*");
            nr2++;
        }

        System.out.println();
        System.out.print("Ex. 20III: ");
        int m = 4;
        for (int i3=0;i3<5;++i3) {
            System.out.println();
            for (int j=0;j<m;++j)
                System.out.print(" ");
            for (int k=0;k<5-m;++k)
                System.out.print("*");
            m--;
        }

        System.out.println();
        System.out.print("Ex. 20IV: ");
        int mij = 4;
        for (int i4=0;i4<5;++i4) {
            System.out.println();
            for (int j=0;j<9;++j) {
                if (j >= mij - i4 && j <= mij + i4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        }

        System.out.println();
        System.out.print("Ex. 20V: ");
        int pozMij = 4, z = 1;
        for (int i5=0;i5<5;++i5) {
            System.out.println();
            for (int j=0;j<9;++j) {
                if (j >= pozMij - i5 && j <= pozMij + i5)
                    System.out.print(z);
                else
                    System.out.print(" ");
            }
            z++;
        }

        System.out.println();
        System.out.print("Ex. 20VI: ");
        int mijl = 4;
        for (int i6=0;i6<5;++i6) {
            System.out.println();
            for (int j=0;j<9;++j) {
                if (j >= mijl - i6 && j <= mijl + i6)
                    System.out.print(Math.abs(mijl - j) + 1);
                else
                    System.out.print(" ");
            }
        }
    }
}

