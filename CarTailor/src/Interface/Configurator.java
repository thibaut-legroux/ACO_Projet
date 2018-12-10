package CarTailor.src.Interface;

import CarTailor.src.CarTailor.*;

import java.util.Collection;

public  interface Configurator 
{

    public Requirement requierement = null;

	public void addincompatibilities(PartImpl part, PartImpl incompat);

	public void addrequirements(PartImpl part,PartImpl incompat);

	public void removeincompatibilities(PartImpl part,PartImpl incompat);

	public void removerequirements(PartImpl part,PartImpl incompat);

	public Requirement getrequirements();

	public Incomptatibility getincompatibilities();

}

