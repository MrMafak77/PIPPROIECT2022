package bridgePattern2_PIP;

/**
 * Implementarea clasei abstracte
 */
public class Televizor extends Produs{

	Televizor(Companie c) {
		super(c);
	}

	@Override
	public String tipProdus() {
		return "Televizor de la " + cmp.numeCompanie();
	}
	
}
