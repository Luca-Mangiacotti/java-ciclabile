package lessons.java.ciclabile;

public class ArrayOfInt {
    private int index = 0;
    private int[] array;

    // metodo costruttore
    public ArrayOfInt(int[] array) {
        this.array = array;
        if (this.array.length > 0) {
            this.index = 0;
        }

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

    // metodo per ottenere il successivo
    public int getNext() {
        int currentNum = this.array[index];
        this.index++;
        return currentNum;
    }

    // metodo per controllare se ci sono ancora elementi
    public boolean hasNumYet() {
        if (array.length == 0) {
            return false;
        }
        return this.index < this.array.length;
    }

    // metodo per aggiungere un nuovo elemento

    public void addNum(int num) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = this.array[i];
        }
        newArray[array.length] = num;
        this.array = newArray;
    }

}
