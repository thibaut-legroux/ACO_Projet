package CarTailor.src.Category;

import CarTailor.src.CarTailor.PartImpl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

enum color {
	TM5,
	TM6,
	TA5,
	TS6,
	TSF7,
	TC120;
}

/**
 * Transmission
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public class Transmission extends PartImpl {
	private color printColor = color.TM5;//par d�faut
	
	public Transmission(){
		possibleColors.add(color.TM6.name());
		possibleColors.add(color.TA5.name());
		possibleColors.add(color.TS6.name());
		possibleColors.add(color.TSF7.name());
		possibleColors.add(color.TC120.name());
	}
	
	public String getColor() {
		return printColor.name();
	}
	Set<String> possibleColors=new HashSet<>();

	public Iterator<String> getContent(){
		return possibleColors.iterator();
	}
}