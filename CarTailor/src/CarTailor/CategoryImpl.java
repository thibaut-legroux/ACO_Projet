package CarTailor.src.CarTailor;


import CarTailor.src.Interface.Category;

import java.util.ArrayList;
import java.util.List;

public  class CategoryImpl implements CarTailor.src.Interface.Category {
	//PartTypeImpl p;

		private String name;
		private String category;
		private List<PartTypeImpl> parts;

		public CategoryImpl(String name) {
			this.name = name;
			parts = new ArrayList<>();

		}


		public void addPart(PartTypeImpl p) {
			if(!parts.contains(p)) {
				this.parts.add(p);
			}
		}

		public void removePart(PartTypeImpl p) {
			if(parts.contains(p)) {
				this.parts.remove(p);
			}
		}

		public List<PartTypeImpl> getPart(){
			return this.parts;
		}



	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		category = category;
	}

}