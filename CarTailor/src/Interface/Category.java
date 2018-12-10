package CarTailor.src.Interface;

import CarTailor.src.CarTailor.*;

import java.util.Iterator;

public interface Category {
	public void addPart(PartTypeImpl p);

	public Iterator<PartType> removePart(PartTypeImpl p);
}