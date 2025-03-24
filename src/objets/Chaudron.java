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

	public void remplirChaudron(int quantite) {
		this.quantitePotion += quantite;

	}

	public int getEffetPotion() {
		return effetPotion;
	}

	public void utiliserPotion() {
		if (quantitePotion > 0) {
			quantitePotion--;
		}
	}

	public boolean restePotion() {
		return quantitePotion > 0;
	}

	public void afficherEtat() {
		System.out.println("Chaudron : " + quantitePotion + "/" + capaciteMax
				+ " potions disponibles. Effet de la potion : " + effetPotion);
	}
}