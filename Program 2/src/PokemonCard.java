//derived class
public class PokemonCard extends GamingCard {
	// the subclass adds three more fields
	
	String Type;
    int Pokedex;
    String Ability;

    
    // the subclass has one constructor
    public PokemonCard(String name, String img, String Category,String Game,  String Type,
    		int Pokedex, String Ability) {
    	super(name, img, Category, Game);
		this.Type = Type;
		this.Pokedex = Pokedex;
		this.Ability = Ability;
	}
  //getters for fields
	public void setType(String Type) {
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }

    public void setPokedex(int Pokedex) {
        this.Pokedex = Pokedex;
    }

    public int getPokedex() {
        return Pokedex;
    }

    public void setAbility(String Ability) {
        this.Ability = Ability;
    }

    public String getAbility() {
        return Ability;
    }
    
    
  //toString() method to print info		
    	
    @Override
    public String toString() {
        return super.toString() + ", " +Pokedex+ ", a " +Type + "-type with " + Ability+ " ability.";
    }
}