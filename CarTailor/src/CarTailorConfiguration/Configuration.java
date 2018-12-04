package carTailorConfigurator;

import java.util.Observable;
import java.util.Vector;
import java.util.concurrent.locks.Condition;

public interface Configuration extends CompatibilityChecker {

  public boolean iSCompatible();

  public boolean iSValide();

  public void addPart(Part part);

  public void removePart(Part part);

}