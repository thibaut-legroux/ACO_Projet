package CarTailor.src.CarTailor;

import CarTailor.src.CarTailor.PartImpl;
import CarTailor.src.CarTailor.color;

import java.util.HashSet;
import java.util.Set;

enum name {
	IN,
	IH,
	IS;
}



public class Interior extends PartImpl {
	private name printname = name.IN;//par d?faut

	public Interior(){
		possibleColors.add(name.IH.name());possibleColors.add(name.IS.name());possibleColors.add(name.IN.name());

	}

	public String getName() {
		return printname.name();
	}
	Set<String> possibleColors=new HashSet<>();

}