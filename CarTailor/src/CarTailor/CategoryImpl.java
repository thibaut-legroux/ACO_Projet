package CarTailor.src.CarTailor;


import CarTailor.src.Interface.Category;

import java.util.*;

public  class CategoryImpl implements Category {

		private String name;
		private Collection<PartTypeImpl> parts;

		public CategoryImpl(String name, Collection<PartTypeImpl> parts) {
			this.name = name;
			this.parts = parts;

			Iterator<PartTypeImpl> it = parts.iterator();
			while (it.hasNext()) {
				it.next().setCategory(this);
			}

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

		public String getName(){
			return this.name;
		}

	public boolean existPart(String name)
	{
		boolean found = false;
		Iterator<PartTypeImpl> it = this.parts.iterator();
		while (it.hasNext() && !found) {
			found = it.next().getName() == name;
		}
		return found;
	}

	public PartTypeImpl getPart(String name)
	{
		PartTypeImpl p = null, temp;
		Iterator<PartTypeImpl> it = this.parts.iterator();
		while (it.hasNext() && p == null) {
			temp = it.next();
			if (temp.getName() == name) {
				p = temp;
			}
		}
		return p;
	}



}