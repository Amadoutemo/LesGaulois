package personnages;


import objets.Chaudron; 

public class Druide {
    private String nom;
    private int forcePotion;
    private Chaudron chaudron;

    public Druide(String nom, int forcePotion, Chaudron chaudron) {
        this.nom = nom;
        this.forcePotion = forcePotion;
        this.chaudron = chaudron;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le Druide " + nom + " : ";
    }

    public void fabriquerPotion(int quantite, int forcePotion) {
        this.forcePotion = forcePotion;
        chaudron.remplirChaudron(quantite);
        parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
    }

    public void boosterGaulois(Gaulois gaulois) {
        if (chaudron.restePotion()) {
            if (gaulois.getNom().equals("Obélix")) {
                parler("Non, Obélix Non !... Et tu le sais très bien !");
            } else {
                parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
                gaulois.booster(forcePotion);
                chaudron.utiliserPotion();
            }
        }
    }
}