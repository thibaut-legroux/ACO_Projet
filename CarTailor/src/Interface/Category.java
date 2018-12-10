package CarTailor.src.CarTailor;

import java.util.Iterator;

public interface Category {
	void addPart(PartTypeImpl p);
	void removePart(PartTypeImpl p);

	public Iterator<PartType> removePart(PartType p);
}