public class Tema1 {

    public static void main(String[] args) {

        //Ex. 3:
        int x = 5, y = 10;
        System.out.println("Ex. 3: " + (x + y));

        //Ex. 4:
        int a = 20;
        float b = 10;
        String c = "java";

        //Ex. 5:
        System.out.println("Ex. 5: " + (a * b));

        //Ex. 6:
        double bilet1 = 19.99, bilet2 = 3.99, bilet3 = 10.55, sumaBilete = bilet1 + bilet2 + bilet3;
        System.out.println("Ex. 6: " + sumaBilete);

        //Ex. 7:
        double suma;
        System.out.println("Ex. 7: " + (suma = 142 + 9.38));

        //Ex. 8:
        String nume = "Poltorac", prenume = "Vlad";
        System.out.println("Ex. 8: Numele complet are " + (nume.length() + prenume.length()) + " caractere");

        //Ex. 9:
        int lung = 9, lat = 16;
        System.out.println("Ex. 9: Aria dreptunghiului este " + (lung * lat));

        //Ex. 10:
        String fraza = "Eu merg la mare";
        System.out.println("Ex. 10: " + fraza.length());

        //Ex. 11:
        String prop = "Ana are mere";
        int m = 3;
        prop = prop.substring(m);
        System.out.println("Ex. 11: " + prop);

        //Ex. 12:
        String frz = "Coral is either the stupidest animal or the smartest rock", frz1;
        int z = 7;
        frz1 = frz.substring(0, frz.length() - z);
        System.out.println("Ex. 12: " + frz1);

        //Ex. 13:
        System.out.println("Ex. 13: " + frz.substring(0, 5) + frz.substring(frz.length() - 5));

        //Ex. 14:
        String findFrz = frz.replaceAll("the", "");
        System.out.println("Ex. 14: " + (frz.length() - findFrz.length()) / 3);

        //Ex. 15:
        System.out.println("Ex. 15: " + frz.replaceAll("the", "THE"));
    }
}
