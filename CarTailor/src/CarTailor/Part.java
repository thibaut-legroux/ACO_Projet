package carTailor;

import java.util.Iterator;
import java.util.Vector;

public interface Part {

  public void setPartType(Part p);
  public Iterator<PartType> getPartType();

}