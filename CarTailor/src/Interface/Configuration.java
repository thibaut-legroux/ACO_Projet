package CarTailor.src.Interface;

import CarTailor.src.CarTailor.CategoryImpl;
import CarTailor.src.CarTailor.PartTypeImpl;

public interface Configuration {

   PartTypeImpl getSelection(CategoryImpl category);

   void removePart(PartTypeImpl partype);

   void addPart (PartTypeImpl partype);


}