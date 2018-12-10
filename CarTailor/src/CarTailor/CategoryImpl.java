package CarTailor.src.CarTailor;


import CarTailor.src.Interface.Category;
import CarTailor.src.Interface.PartType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class CategoryImpl implements CarTailor.src.Interface.Category {
	//PartTypeImpl p;

		private String name;
		private List<PartType> parts;
		private CategoryImpl(String name) {
			this.name = name;
			parts = new ArrayList<>();
		}


		public void addPart(PartTypeImpl p) {
			if(parts.contains(p)) {
				this.parts.remove(p);
			}else {
				try {
					throw new ConflictingRoleException("the partType isn't exists");
				} catch (ConflictingRoleException e) {
					e.printStackTrace();
				}
			}
		}

		public Iterator<PartType> removePart(PartTypeImpl p) {
			Iterator<PartType> it = this.parts.iterator() ;
			return it;
		}

		public List<PartType> getPart(){
			return this.parts;
		}

}