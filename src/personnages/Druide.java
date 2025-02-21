package personnages;

public class Druide {
	private String nom;
	private int force;

	public Druide(String nom, int force) {
		this.force = force;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
}
