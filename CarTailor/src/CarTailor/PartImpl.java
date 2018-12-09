package CarTailor.src.CarTailor;


import java.util.Iterator;
import java.util.List;

public class PartImpl implements CarTailor.src.CarTailor.Part {

	List<PartType> listPartType ;

	public PartImpl(List<PartType> listPartType) {
		super();
	}
	public PartImpl() {
		//this.listPartType = new ArrayList<Part>();
	}

	public void setPartType(CarTailor.src.CarTailor.Part p) {
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