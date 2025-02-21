package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {
		Gaulois as = new Gaulois("asterix", 8);
		Gaulois ob = new Gaulois("obelix", 8);

		as.parler("Bonjour Obélix.");
		ob.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		as.parler("Oui très bonne idée");
		Romain minus = new Romain("Minus", 6);
		System.out.println(
				"Dans la forêt " + as.getNom() + " et " + ob.getNom() + " tombe nez à sur le romain " + minus.getNom());
	}
}