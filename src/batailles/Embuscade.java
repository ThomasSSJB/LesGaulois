package batailles;

import java.util.Random;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Grades;
import personnages.Personnage;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class Embuscade implements IBataille {
	
	private String contexte;
	private Gaulois[] promeneurs;
	private Soldat[] soldats;
	private Village village;
	private Camp camp;
	private Random random;
	
	public Embuscade(String contexte) {
		this.contexte = contexte;
		this.random = new Random();
	}
	
	public void setVillage(Village village) {
		this.village = village;
	}
	
	public void setCamp(Camp camp) {
		this.camp = camp;
	}
	
	public void setPromeneurs(Gaulois[] promeneurs) {
		this.promeneurs = promeneurs;
	}
	
	public void setSoldats(Soldat[] soldats) {
		this.soldats = soldats;
	}
	
	@Override
	public String decrireContexte() {
		return contexte;
	}

	@Override
	public String choisirCombattants() {
		String resultat = "";
		
		resultat += "Il s'agit de " + afficherListe(promeneurs) + ".\n";
		
		if (soldats.length == 1) {
			resultat += "Mais caché derrière des bosquets se cache " + soldats[0].getNom() + ".";
		} else if (soldats.length == 2) {
			resultat += "Mais cachés derrière des bosquets se cachent " + soldats[0].getNom() + " et " + soldats[1].getNom() + ".";
		} else {
			resultat += "Mais cachés derrière des bosquets se cachent " + afficherListe(soldats) + ".";
		}
		
		return resultat;
	}

	@Override
	public String preparerCombat() {
		String resultat = "Les soldats s'étaient bien préparés : \n";
		
		for (int i = 0; i < soldats.length; i++) {
			resultat += soldats[i].ajouterEquipement(Equipement.CASQUE) + "\n";
			resultat += soldats[i].ajouterEquipement(Equipement.PLASTRON) + "\n";
			resultat += soldats[i].ajouterEquipement(Equipement.BOUCLIER) + "\n";
		}
		
		return resultat;
	}

	@Override
	public String decrireCombat() {
		String resultat = "";
		
		while (touteEquipeDebout(promeneurs) && touteEquipeDebout(soldats)) {
			Personnage promeneur = choisirPromeneurValide();
			Personnage soldat = choisirSoldatValide();
			
			int choix = random.nextInt(2);
			if (choix == 0) {
				promeneur.frapper(soldat);
			} else {
				soldat.frapper(promeneur);
			}
		}
		
		return resultat;
	}

	@Override
	public String donnerResultat() {
		String resultat = "";
		
		if (touteEquipeDebout(promeneurs)) {
			resultat = "Malgré cette sournoise attaque, nos promeneurs s'en sont sortis indemnes.\n";
			
			Gaulois[] gauloisValides = trouverGauloisValides();
			resultat += "Ils pouvaient compter sur la force de " + afficherListe(gauloisValides) + ".";
		} else {
			resultat = "L'attaque fut tellement rapide et inattendue que nos malheureux gaulois n'ont pas eu le temps de réagir.\n";
			resultat += "Ils furent ligotés et emmenés dans le camp de " + camp.getCommandant().getNom() + ".";
		}
		
		return resultat;
	}
	
	private String afficherListe(Personnage[] liste) {
		String resultat = "";
		for (int i = 0; i < liste.length; i++) {
			if (i == liste.length - 1) {
				resultat += "et " + liste[i].getNom();
			} else if (i == liste.length - 2) {
				resultat += liste[i].getNom() + " ";
			} else {
				resultat += liste[i].getNom() + ", ";
			}
		}
		return resultat;
	}
	
	private boolean touteEquipeDebout(Personnage[] equipe) {
		for (int i = 0; i < equipe.length; i++) {
			if (equipe[i].getForce() > 0) {
				return true;
			}
		}
		return false;
	}
	
	private Personnage choisirPromeneurValide() {
		Personnage promeneur = null;
		while (promeneur == null || promeneur.getForce() <= 0) {
			int index = random.nextInt(promeneurs.length);
			promeneur = promeneurs[index];
		}
		return promeneur;
	}
	
	private Personnage choisirSoldatValide() {
		Personnage soldat = null;
		while (soldat == null || soldat.getForce() <= 0) {
			int index = random.nextInt(soldats.length);
			soldat = soldats[index];
		}
		return soldat;
	}
	
	private Gaulois[] trouverGauloisValides() {
		int nbValides = 0;
		for (int i = 0; i < promeneurs.length; i++) {
			if (promeneurs[i].getForce() > 0) {
				nbValides++;
			}
		}
		
		Gaulois[] valides = new Gaulois[nbValides];
		int index = 0;
		for (int i = 0; i < promeneurs.length; i++) {
			if (promeneurs[i].getForce() > 0) {
				valides[index] = promeneurs[i];
				index++;
			}
		}
		
		return valides;
	}

}