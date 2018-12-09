package CarTailor.src.CarTailor;

import CarTailor.src.CarTailor.PartImpl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

enum couleur_exter {
	XC,
	XM,
	XS;
}


public class Exterior extends PartImpl {
	private couleur_exter print_couleur = couleur_exter.XC;//par d�faut

	public Exterior(){
		possibleColors.add(couleur_exter.XC.name());possibleColors.add(couleur_exter.XM.name());possibleColors.add(couleur_exter.XS.name());

	}

	public String getCouleur_ext() {
		return print_couleur.name();
	}
	Set<String> possibleColors=new HashSet<>();

	public Iterator<String> getContent(){
		return possibleColors.iterator();
	}
}