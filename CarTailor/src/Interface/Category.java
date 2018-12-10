package CarTailor.src.Interface;

import CarTailor.src.CarTailor.PartTypeImpl;

import java.util.Iterator;

public interface Category {
	void addPart(PartTypeImpl p);
	void removePart(PartTypeImpl p);

}