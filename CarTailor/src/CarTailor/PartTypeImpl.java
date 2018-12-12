package CarTailor.src.CarTailor;

import CarTailor.src.Interface.PartType;

/**
 * The type Part type.
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public  class PartTypeImpl implements PartType {

	private String name,description;
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

}