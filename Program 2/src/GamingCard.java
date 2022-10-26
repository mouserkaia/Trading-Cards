//derived class
public class GamingCard extends TradingCard {
	// the subclass adds two more fields
    String Category, Game;
 // the subclass has one constructor
	public GamingCard(String name, String Img, String Category, String Game) {
		super(name, Img);
		this.Category = Category;
		this.Game = Game;
		
	}
	//getters for both fields
	public String getGame() {
        return Game;

    }
    public String getCategory() {
        return Category ;

    }
	
	
	//toString() method to print info
	@Override
    public String toString() {
		return super.toString() + ": " +Game+ " character" ;
		
    }
}
