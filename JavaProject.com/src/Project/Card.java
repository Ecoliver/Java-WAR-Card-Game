package Project;

public class Card {

	    private Rank rank; //initialize the rank (2,3,4...King, Ace)
	    private Suit suit; //initialize the suit (spades, hearts...)
		private int value;
		private String name;
	    
	    public Card(Rank r, Suit s) {
			// TODO Auto-generated constructor stub
	    	this.rank = r;
	    	this.suit = s;
		}

		//getter method
	    public String getCard(){
	        return this.toString(); 
	    }//end getCard
	    
	    //setter method
	    public void setCard(Rank rank){
	        this.rank = rank;
	    }//end setCard
	    
	    @Override
	    public String toString(){
	    //combine rank and suit together into a single string(ex: Ace of Diamonds)

	        //suing StringBuilder for modifiability later on
	        StringBuilder displayCard = new StringBuilder();
	        
	        //personal choice to use switch
	        switch(rank.getPointValue()){
	            //since rank is int type, now match int 11 to String jack...14 to Ace
	            case 11:
	                displayCard.append("Jack");
	                break;
	            case 12:
	                displayCard.append("Queen");
	                break;
	            case 13:
	                displayCard.append("King");
	                break;
	            case 14:
	                displayCard.append("Ace");
	                break;    
	            default:
	                displayCard.append(rank); //number from 2 to 10 does not need to modify
	                break;
	        }//end rank switch
	        
	        displayCard.append(" of "); //setting the format of the output
	        

            displayCard.append(suit.getSuitName());

	        return displayCard.toString();
	    }

	            public Card(int value, String name) {
	                this.value = value;
	                this.name = name;
	            }

	            public int getValue1() {
	                return value;
	            }

	            public String getName() {
	                return name;
	            }

	            public void describe() {
	                System.out.println("Card: " + name + ", Value: " + value);
	            
	      
	        
	        //return the result of an entire combined string
	    }//end toString

		public int compareTo(Card playerTwoFaceUp) {
			// TODO Auto-generated method stub
			if (this.getValue() > playerTwoFaceUp.getValue()) {
				return 1;
			} else if (this.getValue() < playerTwoFaceUp.getValue()) {
				return -1;
			}
			return 0;
		}

		public int getValue() {
			// TODO Auto-generated method stub
			return this.rank.getPointValue();
		}
	    
	}//end Card Class
	
