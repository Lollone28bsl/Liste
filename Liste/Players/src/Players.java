public class Players {

    public static void main(String[] args) {

        Player p1 = new Player("Mario", 100);
        Player p2 = new Player("Luigi", 80);
        Player p3 = new Player("Peach", 120);

        p1.salvaSuFile();
        p2.salvaSuFile();
        p3.salvaSuFile();

        System.out.println("File creati correttamente.");
    }
}