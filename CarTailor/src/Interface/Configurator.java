package CarTailor.src.Interface;

import CarTailor.src.CarTailor.*;

import java.util.Collection;

/**
 * L'interface Configurator.
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public interface Configurator
{
	Collection<CategoryImpl> getCategory();
	CompatibleManagerImpl getCompatibilityManager();
	ConfigurationImpl getConfig();
}

