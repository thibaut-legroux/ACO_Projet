package CarTailor.src.CarTailor;


import java.util.Iterator;

public interface Part {

  public void setPartType(Part p);
  public Iterator<PartType> getPartType();

}