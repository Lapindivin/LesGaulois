package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain minus= new Romain("Minus",6);
		asterix.parler("Bonjour a tous");
		minus.parler("UN Gaulois");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
