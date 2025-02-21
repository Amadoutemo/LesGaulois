package personnages;

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.force = force;
		this.nom = nom;

	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public static void main(String[] args) {
		Gaulois as = new Gaulois("asterix", 8);
		System.out.println(as.getNom());
		Romain romain = new Romain("cesar", 5);
		Romain minus = new Romain("Minus", 6);
		as.frapper(minus);
		as.frapper(minus);
		as.frapper(minus);

	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		int forceCoup = force / 3;
		romain.recevoirCoup(forceCoup);

	}

}