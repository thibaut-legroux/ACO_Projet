package CarTailor.src.CarTailor;

import CarTailor.src.CarTailor.IncompatibilityManager;
import CarTailor.src.CarTailor.PartTypeImpl;
import CarTailor.src.Interface.Configurator;

import java.util.ArrayList;

public class Requirement extends IncompatibilityManager {

	public Configurator configurator;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Requirement(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public ArrayList<PartTypeImpl> Requirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public PartTypeImpl part;



	public String getRequirement() {
		if(this.Requirement != null)
			return this.Requirement.toString();
		return null;
	}

	public void setRequirement(ArrayList<PartTypeImpl> requirement) {
		Requirement = requirement;
	}

	@Override
	public String toString() {
		return "Requirements [Requirement=" + Requirement;
		//+ ", part=" + part + "]";
	}




}

