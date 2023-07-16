
public class BasketballTeam extends SportsTeam {

	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	
	public BasketballTeam() {
		super();
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}//end empty constructor 
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		
		super.setTeamName(teamName);
		super.setTeamMascot(teamMascot);
		super.setHeadCoach(headCoach);
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
		
	}//end preferred constructor
	
	public double fieldGoalPercentage() {
		return (double) fieldGoals/fieldGoalsAttempted;
	}//end fieldGoalPercent
	
	public double freeThrowPercentage() {
		return (double) freeThrows/freeThrowsAttempted;
	}//end freeThrowPercent
	
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		
	}//end setStats
	
	
	
	//Getters and Setters
	public int getFieldGoals() {
		return fieldGoals;
	}//end getFieldGoals

	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}//end setFieldGoals

	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}//end getFieldGoalsAttempted

	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}//end setFieldGoalsAttempted

	public int getFreeThrows() {
		return freeThrows;
	}//end getFreeThrows

	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}//end setFreeThrows

	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}//end getFreeThrowsAttempted

	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}//end setFreeThrowsAttempted

	@Override
	public double[] getStats() {
		// TODO Auto-generated method stub
		double[] stats = new double [3];
		stats[0] = getWinPercentage();
		stats[1] = fieldGoalPercentage();
		stats[2] = freeThrowPercentage();
		return stats;
	}//end GetStats

}//end class
