package personnages;

public class Soldat extends Romain {
	
	private Grades grade;
	
	public Soldat(String nom, int force, Grades grade) {
		super(nom, force);
		this.grade = grade;
	}
	
	@Override
	protected String donnerAuteur() {
		return "soldat";
	}
	
	public Grades getGrade() {
		return grade;
	}
}
