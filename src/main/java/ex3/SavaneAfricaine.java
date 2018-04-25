package ex3;


public class SavaneAfricaine extends Zone{
	
	public int compterAnimaux(){
		return animals.size();
	}
	
	public int calculerKgsNourritureParJour(){
		return animals.size() * 10;
	}
}
