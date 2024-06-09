package programss;

public class Prog4 {
	private int countryCode;
	private String countryName;
	private long countryPopulation;
	private double countryGeographicsArea;
	public Prog4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prog4(int countryCode, String countryName, long country, double countryGeographicsArea) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.countryPopulation = country;
		this.countryGeographicsArea = countryGeographicsArea;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getCountryPopulation() {
		return countryPopulation;
	}
	public void setCountryPopulation(long country) {
		this.countryPopulation = country;
	}
	public double getCountryGeographicsArea() {
		return countryGeographicsArea;
	}
	public void setCountryGeographicsArea(double countryGeographicsArea) {
		this.countryGeographicsArea = countryGeographicsArea;
	}
	@Override
	public String toString() {
		return "Prog4 [countryCode=" + countryCode + ", countryName=" + countryName + ", countryPopulation=" + countryPopulation
				+ ", countryGeographicsArea=" + countryGeographicsArea + "]";
	}
	
	
}
