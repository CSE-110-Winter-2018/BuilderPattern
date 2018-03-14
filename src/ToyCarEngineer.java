// Design followed from http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/

/*An engineer needs not know how the various build tools work.
 * They assemble all the complex components together.
 * */
public class ToyCarEngineer {
	
	/* There could be many different builders
	One for each type of toy car, e.g. F1_builder, Nazcar_builder
	This variable will hold whatever builder type you pass as an argument
	to ToyCarEngineer's constructor
	*/
	private ToyCarBuilder carBuilder;
	
	// Constructor
	public ToyCarEngineer(ToyCarBuilder customToyCarBuilder) {
		
		this.carBuilder = customToyCarBuilder;
		
	}
	
	// Return car to the client
	public ToyCar getToyCar() {
		
		return this.carBuilder.getToyCar();
		
	}
	
	// Assemble the car
	public void makeToyCar() {
		
		this.carBuilder.buildCarEngine();
		this.carBuilder.buildCarWheels();
		
	}

}
