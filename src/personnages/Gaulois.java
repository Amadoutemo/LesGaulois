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
	public void sePresenter(Village village) {
		if (village != null) {
			if (village.getNom().equals("Village des Irréductibles")) {
				System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". J'habite le village " + village.getNom() + ".\"");
			} else {
				System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". Je suis le chef du village " + village.getNom() + ".\"");
			}
		} else {
			System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.\"");
		}
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
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + nomRomain);
		int forceCoup = force / 3;
		romain.recevoirCoup(forceCoup);

	}

}