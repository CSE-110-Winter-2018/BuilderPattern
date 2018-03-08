// Design followed from http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/
public interface ToyCarBuilder {
	
	public void buildCarEngine();
	public void buildCarWheels();
	public ToyCar getToyCar();

}
