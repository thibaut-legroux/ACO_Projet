package CarTailor.src.Interface;

import CarTailor.src.CarTailor.PartTypeImpl;

import java.util.Iterator;

/**
 * L'interface Category.
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public interface Category {
	void addPart(PartTypeImpl p);
	void removePart(PartTypeImpl p);
}