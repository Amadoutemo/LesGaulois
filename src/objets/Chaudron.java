package objets;

public class Chaudron {
	private int quantitePotion;
	private int capaciteMax;
	private int effetPotion;

	public Chaudron(int capaciteMax, int effetPotion) {
		this.capaciteMax = capaciteMax;
		this.quantitePotion = 0;
		this.effetPotion = effetPotion;
	}

	public boolean resterPotion() {
		return quantitePotion == 0;
	}

	public void fabriquerPotion(int quantiteAjoutee) {
		if (quantiteAjoutee > 0) {
			quantitePotion += quantiteAjoutee;
			if (quantitePotion > capaciteMax) {
				quantitePotion = capaciteMax;
			}
			System.out.println("Potion fabriquée ! Nouvelle quantité : " + quantitePotion);
		} else {
			System.out.println("Impossible de fabriquer une quantité négative de potion !");
		}
	}

	public void remplirChaudron() {
		quantitePotion = capaciteMax;
		System.out.println("Le chaudron est maintenant plein !");
	}

	public int getEffetPotion() {
		return effetPotion;
	}

	public void afficherEtat() {
		System.out.println("Chaudron : " + quantitePotion + "/" + capaciteMax
				+ " potions disponibles. Effet de la potion : " + effetPotion);
	}
}