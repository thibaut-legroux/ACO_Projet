package CarTailor.src.Interface;

import java.util.Iterator;

/**
 * L'interface Part.
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public interface Part {

  void setPartType(Part p);
  Iterator<PartType> getPartType();

}