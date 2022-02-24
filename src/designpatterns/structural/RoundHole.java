package designpatterns.structural;

public class RoundHole {
	
	private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
                      //Peg parent class
     				 // Liskov - open/close
    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
    
}
