package bridgePattern2_PIP;

/**
 * Implementarea clasei abstracte 
 */
public class Telefon extends Produs {

	Telefon(Companie c) {
		super(c);
	}

	@Override
	public String tipProdus() {
		return "Telefon de la " + cmp.numeCompanie();
	}

}
