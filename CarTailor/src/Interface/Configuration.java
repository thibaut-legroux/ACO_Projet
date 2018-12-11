package CarTailor.src.Interface;

import CarTailor.src.CarTailor.CategoryImpl;
import CarTailor.src.CarTailor.PartTypeImpl;

/**
 * L'interface Configuration.
 */
public interface Configuration {

   PartTypeImpl getSelection(CategoryImpl category);

   void removePart(PartTypeImpl partype);

   void addPart (PartTypeImpl partype);


}