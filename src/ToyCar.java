// Design followed from http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/
public class ToyCar implements ToyCarBluePrints{
	
	private String wheels;
	private String engine;

	@Override
	public void setWheels(String wheelType) {
		
		this.wheels = wheelType;
		
	}

	@Override
	public void setEngine(String engineType) {

		this.engine = engineType;
		
	}
	
	public String getWheels() {
		
		return this.wheels;
		
	}
	
	public String getEngine() {
		
		return this.engine;
		
	}

}
