public class App {

    public static void main(String[] args) {

        Porto porto = new Porto();

        try {
            Barca b1 = new Barca("Aurora", "Italia", 9, 5, "vela");
            Barca b2 = new Barca("Titan", "Francia", 12, 8, "motore");

            porto.assegnaPosto(b1);
            porto.assegnaPosto(b2);

            Barca trovata = porto.cercaBarca(51);
            System.out.println("Barca al posto 51: " + trovata.nome);

            double costo = porto.liberaPosto(51, 3);
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
