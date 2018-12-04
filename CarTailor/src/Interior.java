package carTailor;

public enum Color {
	IN;
	IH;
	IS;
}

public class Interior extends PartImpl {
	private Color printColor = color.IN;//par défaut
	
	public Exterior(){
		possibleColors.add(color.IH.name());
		possibleColors.add(color.IS.name());
		addProperty("color", ()->getColor(),(c)->setColor(c), possibleColors);
	}
	
	public String getColor() {
		return printColor.name();
	}
	Set<String> possibleColors=new HashSet<>();	
}