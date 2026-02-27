public class App {
	public static void main(String[] args) {

        // crea una lista di stringhe con dati di prova, la manipola con i metodi presenti ed infine la stampa
        ListaOrdinata<String> l = new ListaOrdinata<>();
	    l.add( "Lollo" );
	    l.add( "Mirko" );
        l.add( "Davide" );
        l.add( "Marco" );
        l.add( "Lebron" );
        l.add( "Cristiano" );
        
        System.out.println(l);

        ListaOrdinata<Bici> lb = new ListaOrdinata<>();
        lb.add( new Bici( 16, Colori.BIANCO ) );
        lb.add( new Bici( 24, Colori.ROSSO ) );
        lb.add( new Bici( 18, Colori.VERDE ) );
        System.out.println(lb);
	}
}