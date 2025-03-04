package village;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private int NB_VILLAGEOIS_MAX;
	private Gaulois[] villageois;

	public Village(String nom, int nbVillageois) {
		this.nbVillageois = nbVillageois;
		this.nom = nom;
		villageois = new Gaulois[30];
	}

	public String getNom() {
		return nom;
	}

	public void ajouterVIllageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;

	}

	public void trouverVillageois(int numVillageois){
		if villageois[numVillageois] != null {
			return 
			
		else {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			
		}
				
		}
	
		
		
	}

	public static void main(String[] args) {
		Village village = new Village("Nom", 20);
		Gaulois as = new Gaulois("Asterix", 5);
		village.ajouterVIllageois(as);

	}

}
