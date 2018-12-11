package CarTailor.src.Interface;

import CarTailor.src.CarTailor.*;

import java.util.Collection;

/**
 * L'interface Configurator.
 */
public interface Configurator
{
	Collection<CategoryImpl> getCategory();
	CompatibleManagerImpl getCompatibilityManager();
	ConfigurationImpl getConfig();
	PartTypeImpl getSelectionForCategory(CategoryImpl c);
}

