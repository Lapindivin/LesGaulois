package personnages;

public class Gaulois {
	public Gaulois(String nom, int force) {;
		this.nom = nom;
		this.force = force;
	}
	private String nom;
	private int force;
	private int effetPotion;
	
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
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8); 
		System.out.println(asterix);
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de "
		+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}
}




