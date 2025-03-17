package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {
		Gaulois as = new Gaulois("asterix", 8);
		Gaulois ob = new Gaulois("obelix", 8);

		as.parler("Bonjour Ob�lix.");
		ob.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers ?");
		as.parler("Oui très bonne idée");
		Romain minus = new Romain("Minus", 6);
		System.out.println(
				"Dans la for�t " + as.getNom() + " et " + ob.getNom() + " tombe nez � sur le romain " + minus.getNom());
	}
}