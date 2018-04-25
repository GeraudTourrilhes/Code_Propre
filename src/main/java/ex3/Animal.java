package ex3;

public class Animal {
	private String nomAnimal;
	private String typeAnimal;
	private String comportement;
	
	public Animal(String nomAnimal, String typeAnimal, String comportement) {
		super();
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
		this.comportement = comportement;
	}

	public String getNomAnimal() {
		return nomAnimal;
	}

	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}

	public String getTypeAnimal() {
		return typeAnimal;
	}

	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	public String getComportement() {
		return comportement;
	}

	public void setComportement(String comportement) {
		this.comportement = comportement;
	}
	
	

}
