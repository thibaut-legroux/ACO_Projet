package CarTailor.src.Interface;

import java.util.Iterator;

/**
 * L'interface Part.
 */
public interface Part {

  public void setPartType(Part p);
  public Iterator<PartType> getPartType();

}