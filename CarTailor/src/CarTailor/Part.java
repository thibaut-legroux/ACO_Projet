package CarTailor.src.CarTailor;

import CarTailor.PartType;

import java.util.Iterator;

public interface Part {

  public void setPartType(Part p);
  public Iterator<PartType> getPartType();

}