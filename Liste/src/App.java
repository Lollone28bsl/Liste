public class App {
    public static void main(String[] args){
        Lista l = new Lista();
        l.addTail(new Nodo("Mario"));
        l.addTail(new Nodo("Giulio"));
        l.addHead(new Nodo("Francesco"));
        l.add("Juve magica Juve");
        System.out.println(l);
    }
}