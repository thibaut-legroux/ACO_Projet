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


public class Engine extends PartImpl {

	private Name printname = Name.EG100;//par d?faut

	public Engine(){
		possible_Name.add(Name.EG100.name());possible_Name.add(Name.EG133.name());possible_Name.add(Name.EG210.name());
		possible_Name.add(Name.ED110.name());possible_Name.add(Name.ED180.name());possible_Name.add(Name.EH120.name());

	}
	
	public String getName() {
		return possible_Name.iterator().next();
	}
	Set<String> possible_Name=new HashSet<>();

}