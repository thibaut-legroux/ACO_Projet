package CarTailor.src.Interface;

import CarTailor.src.CarTailor.CategoryImpl;


/**
 * L'interface PartType.
 */
public interface PartType {

  public String getName();

  public CategoryImpl getCategory();
  
  public String getDescription();

}