package batailles;

import personnages.Personnage;

public interface IBataille {
	
	String decrireContexte();
	String choisirCombattants();
	String preparerCombat();
	String decrireCombat();
	String donnerResultat();	

}
