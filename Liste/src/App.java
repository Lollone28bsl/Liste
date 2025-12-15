public class App {
    public static void main(String[] args){
        Lista l = new Lista();
        l.addTail(new Nodo("Mario"));
        l.addTail(new Nodo("Giulio"));
        l.addHead(new Nodo("Francesco"));
        l.add("Juve magica Juve");
        System.out.println(l);

        boolean esiste = l.exists("Mario");
        System.out.println("Esiste 'Mario'? " + esiste);

        l.remove("Giulio");
        System.out.println("Dopo remove 'Giulio': " + l);
    }
}