package carTailor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PartImpl implements Part {
	
	List<PartType> listPartType ;
	
	public PartImpl(List<PartType> listPartType) {
		super();	
	}
	public PartImpl() {
		//this.listPartType = new ArrayList<Part>();
	}

//	public void setPartType(Part p) {
//		if(!this.listPartType.contains(p)) {
//			listPartType.add(p);
//		}else {
//			try {
//				throw new  ConflictingRoleException("the partType already exists");
//			} catch (ConflictingRoleException e) {
//				e.printStackTrace();
//			}
//		}
//	}

	@Override
	public void setPartType(Part p) {
		// TODO Auto-generated method stub
	}
	@Override
	public Iterator<PartType> getPartType() {	
		return listPartType.iterator();
	}
}