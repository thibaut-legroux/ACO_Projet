package CarTailor.src.Interface;

public interface Configuration {

  public Configuration getconfiguration();

  /**
   * <!-- begin-user-doc -->
   * <!--  end-user-doc  -->
   * @generated
   * @ordered
   */

  public void showlistpartcategories();

  /**
   * <!-- begin-user-doc -->
   * <!--  end-user-doc  -->
   * @generated
   * @ordered
   */

  public void selectcategory();

  /**
   * <!-- begin-user-doc -->
   * <!--  end-user-doc  -->
   * @generated
   * @ordered
   */

  public void selectpartcategory();

  /**
   * <!-- begin-user-doc -->
   * <!--  end-user-doc  -->
   * @generated
   * @ordered
   */

  public boolean isvalidconfiguration();
  /**
   * <!-- begin-user-doc -->
   * <!--  end-user-doc  -->
   * @generated
   * @ordered
   */

  public boolean isincompatible();

  /**
   * <!-- begin-user-doc -->
   * <!--  end-user-doc  -->
   * @generated
   * @ordered
   */

  public boolean removepart(PartType partype);

  public boolean addpart (PartType partype);

}