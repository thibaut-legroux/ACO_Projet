package CarTailor.src.CarTailor;

import CarTailor.PartType;
import CarTailor.PartTypeImpl;

import java.util.Iterator;

public interface Category {
	public void addPart(PartTypeImpl p);

	public Iterator<PartType> removePart(PartType p);
}