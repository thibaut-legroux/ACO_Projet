package carTailor;

public enum Color {
	XC;
	XM;
	XS;
}

public class Exterior extends PartImpl {
	private Color printColor = color.XC;//par défaut
	
	public Exterior(){
		possibleColors.add(color.XM.name());
		possibleColors.add(color.XS.name());
		addProperty("color", ()->getColor(),(c)->setColor(c), possibleColors);
	}
	
	public String getColor() {
		return printColor.name();
	}
	Set<String> possibleColors=new HashSet<>();	
}