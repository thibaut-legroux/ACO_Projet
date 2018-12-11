package CarTailor.src.CarTailor;

import CarTailor.src.Interface.Part;
import CarTailor.src.Interface.PartType;

import java.util.*;

/**
 * The type Part.
 */
public class PartImpl implements CarTailor.src.Interface.Part {


	Collection<PartType> listPartType ;
	public PartImpl(Collection<PartType> listPartType) {
		super();
	}

	/**
	 * Non implémenté dans la version rendu.
	 */
	public PartImpl() {
		this.listPartType = new HashSet<>();
	}



	public void setPartType(Part p) {
		if(!this.listPartType.contains(p)) {
			listPartType.add((PartType) p);
		}else {
			try {
				throw new  ConflictingRoleException("the partType already exists");
			} catch (ConflictingRoleException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Iterator<PartType> getPartType() {
		return listPartType.iterator();
	}
}