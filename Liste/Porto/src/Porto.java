import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Porto {

    private Barca[] posti = new Barca[100];

    public void assegnaPosto(Barca b) throws Exception {

        for (int i = 0; i < posti.length; i++) {

            if (i < 20 && b.lunghezza > 10)
                continue;

            if (b.tipologia.equals("vela") && i < 50)
                continue;

            if (posti[i] == null) {
                posti[i] = b;
                System.out.println("Barca assegnata al posto " + (i + 1));
                return;
            }
        }

        throw new Exception("Nessun posto disponibile");
    }

    public double liberaPosto(int posto, int giorni) throws Exception {

        if (posto < 1 || posto > 100 || posti[posto - 1] == null)
            throw new Exception("Posto non valido");

        Barca b = posti[posto - 1];
        posti[posto - 1] = null;

        if (b.tipologia.equals("vela"))
            return b.lunghezza * 10 * giorni;
        else
            return b.stazza * 20 * giorni;
    }

    public Barca cercaBarca(int posto) throws Exception {
        if (posto < 1 || posto > 100 || posti[posto - 1] == null)
            throw new Exception("Posto libero o non valido");

        return posti[posto - 1];
    }

    public void salvaSuFile() throws IOException {
        FileWriter fw = new FileWriter("porto.txt");

        for (int i = 0; i < posti.length; i++) {
            if (posti[i] != null) {
                fw.write("Posto " + (i + 1) + ": " + posti[i].nome + "\n");
            }
        }
        fw.close();
    }

    public String[] barchePerNazionalita(String naz) {

        ArrayList<String> nomi = new ArrayList<>();

        for (Barca b : posti) {
            if (b != null && b.nazionalita.equalsIgnoreCase(naz)) {
                nomi.add(b.nome);
            }
        }

        return nomi.toArray(new String[0]);
    }
}
