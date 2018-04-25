package ex3;


public class ZoneCarnivore extends Zone{
	
	public double calculerKgsNourritureParJour(){
		return animals.size() * 10;
	}
}
