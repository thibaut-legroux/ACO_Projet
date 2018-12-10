package CarTailor.src.CarTailorConfiguration;

public interface Configuration {

  public boolean iSCompatible();

  public boolean iSValide();

  public void addPart(CarTailor.src.CarTailor.Part part);

  public void removePart(CarTailor.src.CarTailor.Part part);

}