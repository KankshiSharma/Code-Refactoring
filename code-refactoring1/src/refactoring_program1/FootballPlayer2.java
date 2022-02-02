package refactoring_program1;

public class FootballPlayer2 {
		
		private String playerName = "";
		private String college = "";
		private double fortyYardDash = 0.0;
		private int repsBenchPress = 0;
		private double sixtyYardDash = 0.0;

		

		public String getPlayerName() { return playerName; }

		public String getCollege() {
			return college;
		}

		public double get40YdDash() {
			return fortyYardDash;
		}

		public int getRepsBenchPress() {
			return repsBenchPress;
		}

		public double get60YdDash() {
			return sixtyYardDash;
		}

		

		

		
		// Too much duplication in constructors
		
		/*
		 *  public FootballPlayer2(String playerName, String college, 23 double
		 * fortyYardDash, double sixtyYardDash){ 24
		 * 
		 *  this.playerName = playerName; 26 this.college = college; 27
		 * this.fortyYardDash = fortyYardDash; 28 this.sixtyYardDash = sixtyYardDash; 29
		 * 
		 *  } 
		 * 
		 *  public FootballPlayer2(String playerName, String college, 33 double
		 * fortyYardDash, int repsBenchPress){ 34
		 * 
		 *  this.playerName = playerName; 36 this.college = college; 37
		 * this.fortyYardDash = fortyYardDash; 38 this.repsBenchPress = repsBenchPress;
		 * 
		 * 
		 *  } 
		 * 
		 *  public FootballPlayer2(String playerName, String college, 43 double
		 * fortyYardDash, int repsBenchPress, double sixtyYardDash){ 44
		 * 
		 *  this.playerName = playerName; 46 this.college = college; 47
		 * this.fortyYardDash = fortyYardDash; 48 this.repsBenchPress = repsBenchPress;
		 *  this.sixtyYardDash = sixtyYardDash; 50
		 * 
		 *1 } 
		 */
		
		// Create a general catch all constructor
		

		public FootballPlayer2(String playerName, String college,
	
	          double fortyYardDash, int repsBenchPress, double sixtyYardDash){
	
	         
	
	        this.playerName = playerName;
	
	        this.college = college;
	
	        this.fortyYardDash = fortyYardDash;
	
	        this.repsBenchPress = repsBenchPress;
	
	        this.sixtyYardDash = sixtyYardDash;
	
	         
	
	    }
	
	     
	

		public FootballPlayer2(String playerName, String college,
	
	            double fortyYardDash, int repsBenchPress){
	
	         
	
	        this(playerName, college, fortyYardDash, repsBenchPress, 0.0);
	
	         
	
	    }
	
	     
	

		public FootballPlayer2(String playerName, String college,
	
	            double fortyYardDash, double sixtyYardDash){
	
	         
	
	        this(playerName, college, fortyYardDash, 0, sixtyYardDash);
	
	         
	
	    }
	
	     
	

		public static void main(String[] args){
	
	         
	
	        FootballPlayer2 jamellFleming = new FootballPlayer2("Jamell Fleming", "Oklahoma", 4.53, 10.75);
	
	         
	
	        System.out.println(jamellFleming.getPlayerName());
	
	        System.out.println(jamellFleming.getCollege());
	
	        System.out.println(jamellFleming.get40YdDash());
	
	        System.out.println(jamellFleming.getRepsBenchPress());
	
	        System.out.println(jamellFleming.get60YdDash());
	
	         
	
	    }

}