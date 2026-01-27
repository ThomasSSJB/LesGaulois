package personnages;

public class Soldat extends Romain {
	
	private Grades grade;
	private Equipement[] equipements;
	private int nbEquipements = 0;
	
	public Soldat(String nom, int force, Grades grade) {
		super(nom, force);
		this.grade = grade;
		this.equipements = new Equipement[3];
	}
	
	@Override
	protected String donnerAuteur() {
		return "soldat";
	}
	
	public void ajouterEquipement(Equipement equipement) {
		for (int i=0 ; i<nbEquipements ; i++) {
			if (equipements[i] == equipement) {
				System.out.println("Le " + grade + " " + nom + " possède déjà un " + equipement + " !");
				return;
			}
		}
		
		if (nbEquipements < 3) {
			equipements[nbEquipements] = equipement;
			nbEquipements++;
			System.out.println("Le " + grade + " " + nom + " s'équipe avec un " + equipement + ".");
		} else {
			System.out.println("Le " + grade + " " + nom + " est déjà équipé au maximum !");
		}
	}
	
	@Override
	public void recevoirCoup(int forceCoup) {
		for (int i=0 ; i<nbEquipements ; i++) {
			int protection = equipements[i].getProtection();
			if (forceCoup > protection) {
				System.out.println("Le " + equipements[i] + " absorbe " + protection + " du coup");
				forceCoup -= protection;
			} else {
				System.out.println("Le " + equipements[i] + " absorbe tout le coup");
				forceCoup = 0;
				break;
			}
		}
		
		if ( (force - forceCoup) <= 0 ) {
			force = 0;
			this.parler("J'abandonne...");
		} else {
			force -= forceCoup;
			if (forceCoup > 0) {
				this.parler("Aïe !");
			}
		}
	}
	
	public Grades getGrade() {
		return grade;
	}
}
