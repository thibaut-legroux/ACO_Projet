package carTailor;

public enum Color {
	EG100;
	EG133;
	EG210;
	ED110;
	ED180;
	EH120;
}

public class Engine extends PartImpl {
	private Color printColor = color.EG100;//par défaut
	
	public Exterior(){
		possibleColors.add(color.EG133.name());
		possibleColors.add(color.EG210.name());
		possibleColors.add(color.ED110.name());
		possibleColors.add(color.ED180.name());
		possibleColors.add(color.EH120.name());
		addProperty("color", ()->getColor(),(c)->setColor(c), possibleColors);
	}
	
	public String getColor() {
		return printColor.name();
	}
	Set<E> <String> possibleColors=new HashSet<>();	
}