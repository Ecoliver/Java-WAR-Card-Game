package Project;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return this.hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

	public Card flip() {
		// TODO Auto-generated method stub
		return null;
	}

	public void draw(Deck deck) {
		// TODO Auto-generated method stub
		
	}

	public void incrementScore() {
		// TODO Auto-generated method stub
		
	}

	public String getScore() {
		// TODO Auto-generated method stub
		return null;
	}
}

