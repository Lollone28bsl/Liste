public class App {

    public static void main(String[] args) {

        Porto porto = new Porto();

        try {
            Barca b1 = new Barca("Porsche", "Italia", 9, 5, "vela");
            Barca b2 = new Barca("Mora", "Francia", 12, 8, "motore");

            porto.assegnaPosto(b1);
            porto.assegnaPosto(b2);

            Barca trovata = porto.cercaBarca(1);
            System.out.println("Barca al posto 1: " + trovata.nome);

            double costo = porto.liberaPosto(1, 3);
            System.out.println("Costo affitto: " + costo + " €");

            porto.salvaSuFile();

            String[] italiane = porto.barchePerNazionalita("Italia");
            for (String nome : italiane) {
                System.out.println("Barca italiana: " + nome);
            }

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}

