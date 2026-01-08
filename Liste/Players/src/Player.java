import java.io.FileWriter;
import java.io.IOException;

public class Player {

    private String nome;
    private int valore;

    // Costruttore
    public Player(String nome, int valore) {
        this.nome = nome;
        this.valore = valore;
    }

    // Metodo che salva il valore in un file
    public void salvaSuFile() {
        try {
            FileWriter fw = new FileWriter(nome + ".txt");
            fw.write("Valore del player " + nome + ": " + valore);
            fw.close();
        } catch (IOException e) {
            System.out.println("Errore nella scrittura del file");
        }
    }
}