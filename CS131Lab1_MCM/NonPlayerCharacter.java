import java.security.SecureRandom;
import java.util.Random;
/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter {
	
	private boolean active;
	private String intelligenceType;
	
	
	public NonPlayerCharacter() {
		
		super();
		this.active = false;
		setIntelligenceType("AVERAGE");
		
	}//end empty-argument constructor
	
	public NonPlayerCharacter(String uniqueID, String personality, boolean active, String intelligenceType) {
		
		super();
		super.setUniqueID(uniqueID);
		super.setPersonality(personality);
		this.active = active;
		this.intelligenceType = "";
		
	}//end preferred constructor

	public String reportStructure() {
		super.reportStructure();
		
		String modify = super.reportStructure();
		StringBuilder sb = new StringBuilder(modify);
		sb.append("Active: "+isActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		
		return sb.toString();
	}//end reportStructure
	
	public String introduce() {
		super.setUniqueID(uniqueID);
		return ("Hello, my name is "+ uniqueID );
	}//end Introduce
	
	public String exclaim() {
		String[] exclaimOptions = {
	            "Dag Gummit",
	            "Doggone it",
	            "Holy cow",
	            "Jeez",
	            "Well cheese and crackers"
	    };
		
		Random random = new Random();
	        int index = random.nextInt(exclaimOptions.length);
	        return exclaimOptions[index];
		
	}//end exclaim
	
	
	//Getters and Setters
	public String getIntelligenceType() {
		return intelligenceType;
	}//end getIntelligenceType

	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}//end setIntelligenceType

	public boolean isActive() {
		return active;
	}//end isActive
	
	
}//end class
