import java.io.Serializable;
import java.time.LocalDate;

public class Activity implements Serializable {

    private String nota;
    private LocalDate start;
    private LocalDate stop;

    public Activity(String nota) {
        this.nota = nota;
        this.start = LocalDate.now();
        this.stop = start;
    }

    @Override
    public String toString() {
        return nota + " (" + start + " - " + stop + ")";
    }
}