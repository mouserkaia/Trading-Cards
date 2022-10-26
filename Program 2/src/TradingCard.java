/**
 *  Program 2
 *  Identifies the author
 *  CS160-1
 *  February 20, 2022
 *  @author  Kaia Mouser
  */


//base class
public class TradingCard {
	//two fields  
	String name; 
	  String img;
//one constructor
	    public TradingCard(String name, String img) {
	        this.name = name;
	        this.img = img;
	    }

	   
	   //two methods 
	    public String getName() {
	        return name;

	    }
	    public String getImg() {
	        return img;

	    }

	   //toString() method to print info
	    @Override
	    public String toString() {
	            return name ;
	    }
	
}
