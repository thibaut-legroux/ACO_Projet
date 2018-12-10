package CarTailor.src.CarTailor;

import CarTailor.src.Interface.Category;
import CarTailor.src.CarTailor.ConflictingRoleException;
import CarTailor.src.Interface.Part;
import CarTailor.src.Interface.PartType;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public  class PartTypeImpl implements CarTailor.src.Interface.PartType {

    public String name;
	private Category category;
	private Collection<Part> parts;
	private Collection<PartType> incompatibleParts;
	private Collection<PartType> requirementPart;
	private String description;
	private Class<? extends Part>Classref; 

	
	public PartTypeImpl(Category cat, Collection<Part> parts){
		this.category=cat;
	}

	public  PartTypeImpl(String name, String description, Category category, Class<? extends Part> classref) {
		super();
		this.name = name;
		this.category = category;
		this.Classref = classref;	
	}

	public Iterator<PartType> getIncompatibleParts() {
			return incompatibleParts.iterator();
		}

	public void setIncompatibleParts(Collection<PartType> incompatibleParts) {
			this.incompatibleParts = incompatibleParts;
		}

	public Iterator<PartType> getRequirementPart() {
			return null;
		}

	public void setRequirementPart(Collection<PartType> requirementPart) {
			this.requirementPart = requirementPart;
	}
	
	@Override
	public String getdescription() {
		return this.description;
	}

	/*les cas a gerer pour ajouter un imcompatibility a un partType
	 * 1 quand il n'est pas dans les requirements on l'ajoute 
	 * 2 quand il est dja dans la liste des incompatibmes on fait rien 
	 * 3
	 */
	@Override
	public void addingIncompability(Iterator<CarTailor.src.Interface.PartType> CollectiontPartType) {
		//Objects.requireNonNull(refPart);
		
		Objects.requireNonNull(CollectiontPartType);
		List<PartType> listimcompa =  new ArrayList();
		List<PartType> listRequements = new ArrayList();
		while(this.getRequirement().hasNext()) {
			listRequements.add(this.getRequirement().next());
		}
		
		while(CollectiontPartType.hasNext()) {
			listimcompa.add(CollectiontPartType.next());
		}
		
		for(PartType partType : listimcompa) {
			    if(listRequements.contains(partType)) {
					try {
						throw new ConflictingRoleException("partType is a requirement");
					} catch (ConflictingRoleException e) {
						e.printStackTrace();
					}
					} 
				if(listimcompa.contains(partType)) {
					try {
						throw new ConflictingRoleException("partType is already existe");
					} catch (ConflictingRoleException e) {
						e.printStackTrace();
					}
				}
				listimcompa.add(this);
			}	
	}

	@Override
	public Iterator<PartType> getRequirement() {
		return this.getRequirement();
	}

	@Override
	public Iterator<PartType> getIncompPartType() {
		return this.getIncompPartType();
	}

	@Override
	public String getname() {
		return this.name;
	}

	@Override
	public void setdescription(String description) {
		this.description = description;	
	}
}