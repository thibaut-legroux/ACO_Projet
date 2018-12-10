package CarTailor.src.CarTailor;

import CarTailor.src.Interface.CompatibleManager;
import CarTailor.src.Interface.PartType;

import java.util.*;


public class CompatibleManagerImpl implements CompatibleManager {

	private ConfiguratorImpl configurator;
	private HashMap<PartTypeImpl, ArrayList<PartTypeImpl>> incompatibility;
	private HashMap<PartTypeImpl, ArrayList<PartTypeImpl>> requirement;

	public CompatibleManagerImpl(ConfiguratorImpl configurator) {
		this.configurator = configurator;
		this.incompatibility = new HashMap<>();
		this.requirement = new HashMap<>();
	}

	public void addInCompPartType(PartTypeImpl partType, PartTypeImpl partIncomp) {
		if (this.incompatibility.containsKey(partType)) {
			this.incompatibility.get(partType).add(partIncomp);
		} else {
			ArrayList<PartTypeImpl> temp = new ArrayList<>();
			temp.add(partIncomp);
			this.incompatibility.put(partType, temp);
		}

	}

	public void addRequirementPart(PartTypeImpl partType, PartTypeImpl partRequire) {
		if (this.requirement.containsKey(partType)) {
			this.requirement.get(partType).add(partRequire);
		} else {
			ArrayList<PartTypeImpl> temp = new ArrayList<>();
			temp.add(partRequire);
			this.requirement.put(partType, temp);
		}

	}

	@Override
	public boolean isComplete() {
		return this.configurator.getConfig().size() == 4;
	}

	@Override
	public boolean isValid() {
		boolean correct = this.isComplete();
		if (correct) {
			PartTypeImpl p;
			Iterator<PartTypeImpl> it = this.configurator.getConfig().getConfig().values().iterator();
			while (it.hasNext() && correct) {
				p = it.next();
				correct = this.verifyNonAuthorized(this.incompatibility.get(p))
						&& this.verifyRequirement(this.requirement.get(p));
			}
		}
		return correct;
	}

	public boolean verifyNonAuthorized(Collection<PartTypeImpl> auto) {
		boolean correct = true;
		if (auto != null) {
			Iterator<PartTypeImpl> it = auto.iterator();
			Collection<PartTypeImpl> listPartType = this.configurator.getConfig().getConfig().values();
			while (it.hasNext() && correct) {
				correct = !listPartType.contains(it.next());
			}
		}
		return correct;
	}

	public boolean verifyRequirement(Collection<PartTypeImpl> require) {
		if (require != null) {
			return this.configurator.getConfig().getConfig().values().containsAll(require);
		} else {
			return true;
		}
	}


}