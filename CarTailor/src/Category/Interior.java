package CarTailor.src.Category;

import CarTailor.src.CarTailor.PartImpl;

import java.util.*;

enum nom {
	IN,
	IH,
	IS;
}



public class Interior extends PartImpl {
	private nom printname = nom.IN;//par d?faut

	public Interior(){
		possibleColors.add(nom.IH.name());possibleColors.add(nom.IS.name());possibleColors.add(nom.IN.name());
	}

	public Iterator<String> getContent(){
			return possibleColors.iterator();
	}

	public String getName() {
		return printname.name();
	}
	List<String> possibleColors = new ArrayList<String>();
	//ArrayList possibleColors=new ArrayList<>();


}