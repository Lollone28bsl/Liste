public class App {
    public static void main(String[] args) {
    Lista lista = new Lista();

    lista.inserisciInTesta(10);
    lista.inserisciInTesta(5);
    lista.inserisciInCoda(20);
    lista.inserisciInCoda(30);

    lista.stampaAvanti();
    lista.stampaIndietro();

    System.out.println("Contiene 20? " + lista.contiene(20));
    System.out.println("Contiene 99? " + lista.contiene(99));

    lista.rimuoviTesta();
    lista.rimuoviCoda();

    lista.stampaAvanti();
    lista.stampaIndietro();
    
    System.out.println("Dimensione lista: " + lista.getSize());
    }
}