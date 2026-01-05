class Lista {
    private Nodo head;
    private Nodo tail;
    private int size;


    public Lista() {
        head = null;
        tail = null;
        size = 0;
    }

    public void inserisciInTesta(int valore) {
        Nodo nuovo = new Nodo(valore);

        if (head == null) {
            head = tail = nuovo;
        } else {
            nuovo.next = head;
            head.prev = nuovo;
            head = nuovo;
        }
        size++;
    }

    public void inserisciInCoda(int valore) {
        Nodo nuovo = new Nodo(valore);

        if (tail == null) {
            head = tail = nuovo;
        } else {
            tail.next = nuovo;
            nuovo.prev = tail;
            tail = nuovo;
        }
        size++;
        }

    public void rimuoviTesta() {
        if (head == null) return;
        
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
            size--;
        }

    public void rimuoviCoda() {
        if (tail == null) 
            return;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public boolean contiene(int valore) {
        Nodo corrente = head;
        
        while (corrente != null) {
            if (corrente.valore == valore) 
                return true;
                corrente = corrente.next;
            }
        return false;
    }

    public void stampaAvanti() {
        Nodo corrente = head;
        System.out.print("Lista (avanti): ");

        while (corrente != null) {
            System.out.print(corrente.valore + " ");
            corrente = corrente.next;
        }
        System.out.println();
    }

    public void stampaIndietro() {
        Nodo corrente = tail;
        System.out.print("Lista (indietro): ");

        while (corrente != null) {
            System.out.print(corrente.valore + " ");
            corrente = corrente.prev;
        }
        System.out.println();
    }


    public int getSize() {
        return size;
    }
}