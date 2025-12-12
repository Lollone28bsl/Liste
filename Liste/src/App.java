public class App {
    public static void main(String[] args){
        Lista l = new Lista();
        l.addTail(new Nodo("Mario"));
        l.addTail(new Nodo("Giulio"));
        l.addTail(new Nodo("Francesco"));
        System.out.println(l);
    }
}
