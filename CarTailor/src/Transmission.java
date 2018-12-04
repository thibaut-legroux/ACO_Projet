package carTailor;

public enum Color {
	TM5;
	TM6;
	TA5;
	TS6;
	TSF7;
	TC120;
}

public class Transmission extends PartImpl {
	private Color printColor = color.TM5;//par défaut
	
	public Exterior(){
		possibleColors.add(color.TM6.name());
		possibleColors.add(color.TA5.name());
		possibleColors.add(color.TS6.name());
		possibleColors.add(color.TSF7.name());
		possibleColors.add(color.TC120.name());
		addProperty("color", ()->getColor(),(c)->setColor(c), possibleColors);
	}
	
	public String getColor() {
		return printColor.name();
	}
	Set<E> <String> possibleColors=new HashSet<>();	
}