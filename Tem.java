package lab03;

public class Tem {
	private Float C;
	private Float F;
	private String City;
	
	public Tem(float C, float F ,String City) {
		this.C = C;
		this.F =F;
		this.City = City;
	}
	
	public float getC() {
    	return C;
	}
	
	public float getF() {
    	return F;
	}
	
	 public String toString() {
	        return "\nCity: " + City + ", \nCelsius: " + C + "\nFahrenheit: " + F ;
	    }
}
