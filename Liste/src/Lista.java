public class Lista {
    Nodo root;
    
    public Lista() {
        root = null;
    }
    
    public void addTail(Nodo n) {
        if (root == null) {
            root = n;
        } else {
            Nodo temp = root;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(n);
        }
    }

    public void addHead(Nodo n) {
        Nodo temp = root;
        root = n;
        n.setNext(temp);
    }

    public void add(String s) {
        Nodo n = new Nodo(s);
        addTail(n);
    }

    public void remove ( String s ) {
        //da fare a casa;
    }

    public boolean exists( String s){
        return true;
        //da fare a casa;
    }
    
    public String toString() {
        String s = "La lista contiene: ";
        Nodo temp = root;
        while (temp != null) {
            s += temp.getValue() + " - ";
            temp = temp.getNext();
        }
        return s + "\n";
    }
}
