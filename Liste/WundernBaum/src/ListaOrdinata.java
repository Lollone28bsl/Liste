public class ListaOrdinata<T extends Comparable<T>> extends Lista<T> {

    Nodo<T> head;

    public ListaOrdinata() {
        head = null;
    }

    @Override
    public void add( T v ) {
        Nodo<T> n = new Nodo<T>(v);
        if(head==null) {
            head = n;
            return;
        }
        if(head.getValue().compareTo(v)>0) {
            n.setNext(head);
            head = n;
            return;
        }
        Nodo<T> temp = head;
        while(true){
            if (temp.getNext()==null) {
                temp.setNext(n);
                return;
            }   
            if (temp.getNext().getValue().compareTo(v)>0) {
                n.setNext(temp.getNext());
                temp.setNext(n);
                break;
            }
            temp = temp.getNext();
        }
    }
    @Override
    public String toString() {
        String s = "La lista contiene: ";
        Nodo<T> temp = head;
        while (temp!=null) {
            s += temp.getValue() + " - ";
            temp = temp.getNext();
        }
        return s + "\n";
    }
}
