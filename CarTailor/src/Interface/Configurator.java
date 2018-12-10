package CarTailor.src.Interface;

import CarTailor.src.CarTailor.*;

public  interface Configurator 
{

    public Requirement requierement = null;

	public void addincompatibilities(PartImpl part, PartImpl incompat);

	public void addrequirements(PartImpl part,PartImpl incompat);

	public void removeincompatibilities(PartImpl part,PartImpl incompat);

	public void removerequirements(PartImpl part,PartImpl incompat);

}

