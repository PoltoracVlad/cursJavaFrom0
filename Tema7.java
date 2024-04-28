import java.util.*;

public class Tema7 {

    public static void main(String[] args) {
        //Ex. 1:
        String[] noteMuzicale = {"do", "re", "mi", "fa", "sol", "la", "si", "do"};
        System.out.print("Ex. 1: ");
        for (String i : noteMuzicale)
            System.out.print(i + " ");
        System.out.println();

        //Ex. 2:
        int cont = 0;
        for (String i : noteMuzicale)
            if (i.equals("do"))
                cont++;
        System.out.println("Ex. 2: " + cont);

        //Ex. 3:
        int[] list1 = {3, 1, 0, 2}, list2 = {6, 5, 4}, list3 = new int[7];
        int n = -1;
        for (int i : list1) {
            ++n;
            list3[n] = i;
        }
        for (int i : list2) {
            ++n;
            list3[n] = i;
        }
        System.out.print("Ex. 3: ");
        for (int i : list3)
            System.out.print(i + " ");
        System.out.println();

        //Ex. 4:
        Arrays.sort(list3);
        System.out.print("Ex. 4 - lista sortata: ");
        for (int i : list3)
            System.out.print(i + " ");
        System.out.println();
        list3 = stergere(list3, 0);
        System.out.print("Ex. 4 - element sters: ");
        for (int i : list3)
            System.out.print(i + " ");
        System.out.println();

        //Ex. 5:
        int min = 0, max = 0;
        for (int i=0;i<list3.length;++i) {
            if (i == 0)
                min = max = list3[i];
            else {
                if (list3[i] < min)
                    min = list3[i];
                if (list3[i] > max)
                    max = list3[i];
            }
        }
        System.out.println("Ex. 5: Minim = " + min + " Maxim = " + max);

        //Ex. 6:
        Scanner scanner = new Scanner(System.in);

        String[] jucatori = {"a", "b", "c", "d", "e"};
        int schMax = 3, schEfectuate = 0;
        String m = "";
        System.out.println("Ex. 6: ");
        while (schEfectuate != schMax) {
            String jucator = scanner.nextLine();
            try {
                for (int i=0;i<jucatori.length;++i)
                    if (jucatori[i].equals(jucator)) {
                        m = jucatori[i];
                        jucatori[i] = jucator;
                        break;
                    }
                schEfectuate++;
                System.out.println("A intrat " + jucator);
                System.out.println("A iesit " + m);
                System.out.println("Mai aveti " + (schMax - schEfectuate) + " schimbari");
            } catch(Exception e) {
                System.out.println("Nu se poate efectua schimbarea deoarece jucatorul" + jucator + " nu e in teren");
                System.out.println("Mai aveti " + (schMax - schEfectuate) + "schimbari");
            }
        }
    }

    public static int[] stergere(int[] lista, int val) {
        int[] lista2 = new int[lista.length - 1];
        for (int i=0;i< lista.length;++i)
            if (lista[i] == val) {
                System.arraycopy(lista, 0, lista2, 0, i);
                System.arraycopy(lista, i + 1, lista2, i, lista.length - i - 1);
                return lista2;
            }
        return lista;
    }
}
