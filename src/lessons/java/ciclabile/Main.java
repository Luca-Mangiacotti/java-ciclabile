package lessons.java.ciclabile;

public class Main {
    public static void main(String[] args) {
        System.out.println("java-ciclabile");
        int[] primoArray = { 4, 5, 6 };
        ArrayOfInt listaDiNumeri = new ArrayOfInt(primoArray);
        listaDiNumeri.getArray();
        int[] array = { 3, 4, 6, 7, 8, 8 };
        listaDiNumeri.setArray(array);
        listaDiNumeri.getArray();
        int[] nuovoArray = { 93, 888, 9, 73, 14, 58 };
        listaDiNumeri.setArray(nuovoArray);
        listaDiNumeri.getArray();

    }
}
