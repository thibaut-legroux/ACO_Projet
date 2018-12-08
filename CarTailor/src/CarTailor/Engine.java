package CarTailor.src.CarTailor;

import java.util.HashSet;
import java.util.Set;

enum Name {
	EG100,
	EG133,
	EG210,
	ED110,
	ED180,
	EH120;
}
enum Energy{
	Gasoline,
	Diesel,
	Gasoline_electric_hybrid;
}

public class Engine extends PartImpl {

	
	public Engine(){
		possible_Name.add(Name.EG100.name());possible_Name.add(Name.EG133.name());possible_Name.add(Name.EG210.name());
		possible_Name.add(Name.ED110.name());possible_Name.add(Name.ED180.name());possible_Name.add(Name.EH120.name());
		possible_Energy.add(Energy.Gasoline.name());possible_Energy.add(Energy.Diesel.name());possible_Energy.add(Energy.Gasoline_electric_hybrid.name());
		possible_Power.add(100);possible_Power.add(133);possible_Power.add(210);possible_Power.add(110);possible_Power.add(180);possible_Power.add(120);
	}
	
	public String getName() {
		return possible_Name.iterator().next();
	}
	Set<String> possible_Name=new HashSet<>();
	Set<String> possible_Energy=new HashSet<>();
	Set<Integer> possible_Power=new HashSet<>();
}