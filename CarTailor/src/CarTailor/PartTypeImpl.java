package CarTailor.src.CarTailor;

import CarTailor.src.Interface.PartType;

import java.util.*;

public  class PartTypeImpl implements PartType {

    public String name, description;
	private CategoryImpl category;
	private Collection<Incomptatibility> incompatibleParts;
	private Collection<Requirement> requirementPart;

	public PartTypeImpl(CategoryImpl cat, String name, String description)
	{
		this.category = cat;
		this.description = description;
		this.name = name;
		this.requirementPart = new HashSet<>();
		this.incompatibleParts = new HashSet<>();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public CategoryImpl getCategory() {
		return this.category;
	}

	@Override
	public void setdescription(String description) {
		this.description = description;	
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public void addIncompability(Incomptatibility incomptatibility) {
		if(!incompatibleParts.contains(incomptatibility)){
			incompatibleParts.add(incomptatibility);
		}
	}

	@Override
	public void removeIncompability(Incomptatibility incomptatibility) {
		if(!incompatibleParts.contains(incomptatibility)){
			incompatibleParts.remove(incomptatibility);
		}
	}

	@Override
	public Collection<Incomptatibility> getIncompatibility() {
		return incompatibleParts;
	}

	@Override
	public void addRequirement(Requirement requirement) {
		if(!requirementPart.contains(requirement)){
			requirementPart.add(requirement);
		}
	}

	@Override
	public void removeRequirement(Requirement requirement) {
		if(!requirementPart.contains(requirement)){
			requirementPart.add(requirement);
		}
	}

	@Override
	public Collection<Requirement> getRequirement() {
		return requirementPart;
	}
}