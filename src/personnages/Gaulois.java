package personnages;

public class Gaulois {
	public Gaulois(String nom, int force) {;
		this.nom = nom;
		this.force = force;
	}
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.print(prendreParole() + "<" + texte + ">");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		romain.recevoirCoup(force / 3 * effetPotion);
	}
	
	public void boirePotion(int forcePotion) {
        effetPotion = forcePotion; 
        System.out.println("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
    }
	
//	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois("Asterix",8);
//		Romain minus= new Romain("Minus",6);
//		System.out.println(asterix.nom);
//		System.out.println(asterix);
//		asterix.prendreParole();
//		asterix.parler("hello");
//		asterix.frapper(minus);
//	}
	public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 20);
        Gaulois obelix = new Gaulois("Obélix", 30);

        Druide panoramix = new Druide("panoramix",5, 10);

        panoramix.preparerPotion();
        
        
        
    }
}





