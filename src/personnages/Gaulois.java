package personnages;

import objets.Equipement;

public class Gaulois {
	private String nom;

	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	private int effetPotion;

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

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public static void main(String[] args) {
		Gaulois as = new Gaulois("asterix", 8);
		System.out.println(as.getNom());
		Romain minus = new Romain("Minus", 6);
		as.frapper(minus);
		as.frapper(minus);
		as.frapper(minus);

	}

//	public void frapper(Romain romain) {
//		String nomRomain = romain.getNom();
//		System.out.println(nom + " envoie un grand coup dans la choire de " + nomRomain);
//		int forceCoup = force / 3;
//		romain.recevoirCoup(forceCoup);
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] equipements = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; equipements != null && i < equipements.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = equipements[i];
		}
	}

}