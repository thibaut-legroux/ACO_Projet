package CarTailor.src.Interface;

import CarTailor.src.CarTailor.CategoryImpl;
import CarTailor.src.CarTailor.Incomptatibility;
import CarTailor.src.CarTailor.Requirement;

import java.util.Collection;

public interface PartType {

  String getName();

  CategoryImpl getCategory();

  void setdescription(String description );
  
  String getDescription();
  
  void addIncompability(Incomptatibility incomptatibility);
  void removeIncompability(Incomptatibility incomptatibility);
  Collection<Incomptatibility> getIncompatibility();

  void addRequirement(Requirement requirement);
  void removeRequirement(Requirement requirement);
  Collection<Requirement> getRequirement();
}