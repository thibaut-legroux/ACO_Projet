package CarTailor.src.CarTailor;


import CarTailor.src.Interface.Category;

import java.util.*;

/**
 * Classe Category.
 */
public  class CategoryImpl implements Category {

		private String name;
		private Collection<PartTypeImpl> parts;

	/**
	 * Instantiation d'une nouvelle Category.
	 *
	 * @param name  Le nom de la quatégorie
	 * @param parts La collection de références contenu dans la catégorie
	 */
	public CategoryImpl(String name, Collection<PartTypeImpl> parts) {
			this.name = name;
			this.parts = parts;

			Iterator<PartTypeImpl> it = parts.iterator();
			while (it.hasNext()) {
				it.next().setCategory(this);
			}

		}

	/**
	 * Ajouter une référence à la catégorie.
	 *
	 * @param   p la référence à ajouter
	 */
	public void addPart(PartTypeImpl p) {
		if(!parts.contains(p)) {
			this.parts.add(p);
		}
	}

	/**
	 * Supprimer une référence à la catégorie.
	 *
	 * @param   p la référence à ajouter
	 */
	public void removePart(PartTypeImpl p) {
		if(parts.contains(p)){
			this.parts.remove(p);
		}
	}

	/**
	 * Connaitre le contenu de la catégorie.
	 *
	 * @return la collection de categorie
	 */
	public Collection<PartTypeImpl> getPart(){
			return this.parts;
		}

	/**
	 * Connaitre le nom de la catégorie.
	 *
	 * @return le nom de la categorie
	 */
	public String getName(){
			return this.name;
		}

	/**
	 * Savoir si une référence existe.
	 *
	 * @param name La référence à chercher?
	 * @return retorune vrai si la référence existe, faux sinon
	 */
	public boolean existPart(String name)
	{
		boolean found = false;
		Iterator<PartTypeImpl> it = this.parts.iterator();
		while (it.hasNext() && !found) {
			found = it.next().getName() == name;
		}
		return found;
	}

	/**
	 * Permet de connaitre le contenu d'une référence.
	 *
	 * @param name Le nom de la référence
	 * @return Le contenu de la référence
	 */
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