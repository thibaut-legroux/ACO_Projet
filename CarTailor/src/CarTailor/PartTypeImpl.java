package CarTailor.src.CarTailor;

import CarTailor.src.Interface.Category;
import CarTailor.src.CarTailor.ConflictingRoleException;
import CarTailor.src.Interface.Part;
import CarTailor.src.Interface.PartType;

/**
 * The type Part type.
 */
public  class PartTypeImpl implements PartType {


	public String name,description;

	private CategoryImpl category;

	/**
	 * Constructeur de la classe .
	 *
	 * @param name Le nom de la référence
	 * @param description La description de la référence
	 */
	public PartTypeImpl(String name, String description)
	{
		this.description = description;
		this.name = name;
		//this.requirementPart = new HashSet<>();
		//this.incompatibleParts = new HashSet<>();
	}

	/**
	 * Définir la category.
	 *
	 * @param cat Le nom de la catégorie
	 */
	public void setCategory(CategoryImpl cat){
		this.category = cat;
	}

	/**
	 * Obtenir le nom de la référence.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Obtenir le nom de la catégorie.
	 */
	public CategoryImpl getCategory() {
		return this.category;
	}

	/**
	 * Obtenir la description de la référence.
	 */
	public String getDescription() {
		return this.description;
	}

	/*@Override
	public void addIncompability(Incompatibility incompatibility) {
		if(!incompatibleParts.contains(incompatibility)){
			incompatibleParts.add(incompatibility);
		}
	}

	@Override
	public void removeIncompability(Incompatibility incompatibility) {
		if(!incompatibleParts.contains(incompatibility)){
			incompatibleParts.remove(incompatibility);
		}
	}

	@Override
	public Collection<Incompatibility> getIncompatibility() {
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
	}*/
}