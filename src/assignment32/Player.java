package assignment32;

public class Player implements Comparable<Player> {
	String playerName, skill, country;
	Integer capNumber,matchesPlayed;
	public Player(
			Integer capNumber, 
			String playerName, 
			String skill, 
			String country, 
			Integer matchesPlayed
			) {
		super();
		this.capNumber = capNumber;
		this.playerName = playerName;
		this.skill = skill;
		this.country = country;
		this.matchesPlayed = matchesPlayed;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getCapNumber() {
		return capNumber;
	}
	public void setCapNumber(Integer capNumber) {
		this.capNumber = capNumber;
	}
	public Integer getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(Integer matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
    @Override
    public int compareTo(Player otherPlayer) {
        return Integer.compare(this.getCapNumber(), otherPlayer.getCapNumber());
    }
	
	public String toString() {
		return String.format(
				"%d,%s,%s,%s,%d", 
				this.getCapNumber(),
				this.getPlayerName(),
				this.getSkill(),
				this.getCountry(),
				this.getMatchesPlayed()
				);
	}
}

