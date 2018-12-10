package CarTailor.src.Interface;

import CarTailor.src.CarTailor.CategoryImpl;

public interface PartType {

  public String getName();

  public CategoryImpl getCategory();
  
  public String getDescription();

}