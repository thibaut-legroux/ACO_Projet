package CarTailor.src.CarTailor;

import CarTailor.src.CarTailor.PartImpl;

import java.util.HashSet;
import java.util.Set;

enum Color {
	XC,
	XM,
	XS;
}

public class Exterior extends PartImpl {
	private Color printColor = Color.XC;//par d�faut
	
	public Exterior(){
		possibleColors.add(Color.XM.name());
		possibleColors.add(Color.XS.name());
	}
	
	public String getColor() {
		return printColor.name();
	}
	Set<String> possibleColors=new HashSet<>();
}