// Design followed from http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/
public class HotwheelsBuilder implements ToyCarBuilder{
	
	private ToyCar toycar;
	
	public HotwheelsBuilder() {
		
		this.toycar = new ToyCar();
		
	}

	@Override
	public void buildCarEngine() {

		toycar.setEngine("Boxer");
		
	}

	@Override
	public void buildCarWheels() {

		toycar.setWheels("Chrome Wheels");
		
	}

	@Override
	public ToyCar getToyCar() {

		return this.toycar;
		
	}
	
	
	
}
