package lessons.java.ciclabile;

public class ArrayOfInt {
    private int[] array;

    // metodo costruttore
    public ArrayOfInt(int[] array) {
        this.array = array;

    }

    public ArrayOfInt() {
        final int[] newArray = {};
        this.array = newArray;

    }

    // metodi getter e setter
    public void getArray() {
        for (int numero : this.array) {
            System.out.println(numero);
        }
    }

    public void setArray(int[] array) {
        this.array = array;
    }

}
