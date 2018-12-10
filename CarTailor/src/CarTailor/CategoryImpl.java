package CarTailor.src.CarTailor;


import CarTailor.src.Interface.Category;
import CarTailor.src.Interface.PartType;

import java.util.*;

public  class CategoryImpl implements Category {

		private String name;
		private Collection<PartTypeImpl> parts;

		private CategoryImpl(String name) {
			this.name = name;
			parts = new HashSet<>();
		}

		@Override
		public void addPart(PartTypeImpl p) {
			if(!parts.contains(p)) {
				this.parts.add(p);
			}
		}

		@Override
		public void removePart(PartTypeImpl p) {
			if(parts.contains(p)){
				this.parts.remove(p);
			}
		}

		public Collection<PartTypeImpl> getPart(){
			return this.parts;
		}



	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		category = category;
	}

}