// Design followed from http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/
/*A generic form of ToyCarBuilder
 * To make a car:
 * 	1. Implement ToyCarBuilders
 *	2. Pass them to ToyCarEngineer
 *		a. ToyCarEngineer assembles the car
 *		b. And returns it*/
public interface ToyCarBuilder {
	
	public void buildCarEngine();
	public void buildCarWheels();
	public ToyCar getToyCar();

}
