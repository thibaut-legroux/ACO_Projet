package CarTailor.src.Category;

import CarTailor.src.CarTailor.PartImpl;

import java.util.*;

enum nom {
	IN,
	IH,
	IS;
}

/**
 * Interior
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public class Interior extends PartImpl {
	private nom printname = nom.IN;//par d?faut
	List<String> possibleColors = new ArrayList<String>();

	public Interior(){
		possibleColors.add(nom.IH.name());possibleColors.add(nom.IS.name());possibleColors.add(nom.IN.name());
	}

	public Iterator<String> getContent(){
			return possibleColors.iterator();
	}

	public String getName() {
		return printname.name();
	}
	}