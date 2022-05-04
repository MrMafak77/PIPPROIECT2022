package bridgePattern2_PIP;

/** 
 * Implementez clasa abstracta
 * @author David Vatavu
 */
public abstract class Produs {
	/**
	 *  Clasa abstracta detine o referinta la un obiect de tipul implementorului
	 *  @author David Vatavu
	 */
	protected Companie cmp;
	/**
	 * Se creeaza constuctorul cu parametrii prin care se creeaza un produs de la o anumita companie
	 * @author David Vatavu
	 */
	protected Produs(Companie c){
		cmp = c;
	}
	
	/**
	 *  Metoda ce trebuie implementata in clasele care vor mosteni abstractia
	 *  @author David Vatavu
	 */
	abstract public String tipProdus();
}
