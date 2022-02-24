package designpatterns.structural;

public class Runner {

	public static void main(String[] args) {
		RoundHole rh = new RoundHole(10);
		RoundHole rhBigger = new RoundHole(20);
		
		RoundPeg rp = new RoundPeg(5);
		RoundPeg rpBigger = new RoundPeg(15);
		
		SquarePeg sp = new SquarePeg(2);
		SquarePeg spBigger = new SquarePeg(20);
		
		System.out.println(rh.fits(rpBigger));
		System.out.println(rhBigger.fits(rpBigger));
		
		SquarePegAdapter spa = new SquarePegAdapter(spBigger);
		
		System.out.println(rhBigger.fits(spa));
		
	}

}
