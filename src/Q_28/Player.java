package Q_28;

public class Player {
	 private String Name;
	 private String Country;
	 private String Skill;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
	public Player(String name, String country, String skill) {
		super();
		Name = name;
		Country = country;
		Skill = skill;
	}
	 
	 
	}
