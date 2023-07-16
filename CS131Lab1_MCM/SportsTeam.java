
public abstract class SportsTeam {
	
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	
	public SportsTeam() {
		
		teamName = "";
		teamMascot = "";
		headCoach = "";
		wins = 0;
		losses = 0;
		
	}//end empty-constructor
	
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		
		this.teamName = "";
		this.teamMascot = "";
		this.headCoach = "";
		
	}//end full argument constructor

	public double getWinPercentage() {
		
		return (double)wins/(wins + losses);
		
	}//end WinPercent
	
	public abstract double[] getStats();//end GetStats
	
	
	//Getters and Setters
	public String getTeamName() {
		return teamName;
	}//end getTeamName

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}//end setTeamName

	public String getTeamMascot() {
		return teamMascot;
	}//end getTeamMascot

	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}//end setTeamMascot

	public String getHeadCoach() {
		return headCoach;
	}//end getHeadCoach

	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}//end setHeadCoach

	public int getWins() {
		return wins;
	}//end getWins

	public void setWins(int wins) {
		this.wins = wins;
	}//end setWins

	public int getLosses() {
		return losses;
	}//end getLosses

	public void setLosses(int losses) {
		this.losses = losses;
	}//end setLosses

	
}//end class
