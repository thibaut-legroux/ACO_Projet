package CarTailor.src.CarTailor;

import java.util.Iterator;

public interface PartType {

  public String getname();

  public void setdescription(String description );
  
  public String getdescription();
  
  public void addingIncompability(Iterator<PartType> CollectiontPartType);
  public Iterator<PartType> getRequirement();
  public Iterator<PartType> getIncompPartType();
}