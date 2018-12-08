package CarTailor.src.CarTailor;

import java.util.HashSet;
import java.util.Set;

enum color {
	TM5,
	TM6,
	TA5,
	TS6,
	TSF7,
	TC120;
}

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
}