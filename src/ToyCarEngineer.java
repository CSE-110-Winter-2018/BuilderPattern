// Design followed from http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/
public class ToyCarEngineer {
	
	private ToyCarBuilder carBuilder;
	
	public ToyCarEngineer(ToyCarBuilder customToyCarBuilder) {
		
		this.carBuilder = customToyCarBuilder;
		
	}
	
	public ToyCar getToyCar() {
		
		return this.carBuilder.getToyCar();
		
	}
	
	public void makeToyCar() {
		
		this.carBuilder.buildCarEngine();
		this.carBuilder.buildCarWheels();
		
	}

}
