import java.io.Serializable;

public class Stack<T> implements Serializable {

    private T[] data;
    private int size;

    public Stack() {
        data = (T[]) new Object[10];
        size = 0;
    }

    public void push(T val) {
        if (size == data.length) {
            T[] newData = (T[]) new Object[data.length * 2];
            for (int i = 0; i < data.length; i++)
                newData[i] = data[i];
            data = newData;
        }
        data[size++] = val;
    }

    public T pop() {
        if (size == 0) throw new RuntimeException("Stack vuoto");
        return data[--size];
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "(Stack vuoto)";
        }
        String s = "";
        for (int i = size - 1; i >= 0; i--) {
            s += data[i] + "\n";
        }
        return s;
    }
}