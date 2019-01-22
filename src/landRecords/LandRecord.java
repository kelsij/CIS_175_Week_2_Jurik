package landRecords;

public class LandRecord {

	//agLandRecord variables
	private String parcelNumber;
	private String landType;
	private String soilMapSymbol;
	private int csrRate;
	private double acreage;
	private double csrValue;
	
	//default agLandRecord constructor
	public LandRecord() {
		this.parcelNumber="";
		this.landType="";
		this.soilMapSymbol ="";
		this.csrRate = 0;
		this.acreage =0.0;
		this.csrValue=0.0;
	}
	
	//agLandRecord landType variable constructor
	public LandRecord(String landType) {
		this.parcelNumber="";
		this.landType = landType;
		this.soilMapSymbol = "4000";
		this.csrRate =0;
		this.acreage=0.0;
		this.csrValue = 0.0;
	}
	
	//agLandRecord landType, csrRate and acreage constructor
	public LandRecord(String landType, int csrRate, double acreage) {
		this.parcelNumber="";
		this.landType = landType;
		this.soilMapSymbol = "4000";
		this.csrRate =csrRate;
		this.acreage=acreage;
		this.csrValue = 0.0;
	}
	
	//agLandRecord getters
	public String getParcelNumber() {
		return parcelNumber;
	}
	
	public String getLandType() {
		return landType;
	}
	
	public String getSMS() {
		return soilMapSymbol;
	}
	
	public int getCSRRate() {
		return csrRate;
	}
	
	public double getAcreage() {
		return acreage;
	}
	
	public double getCSRValue() {
		return csrValue;
	}
	
	//agLandRecord setters
	
	public void setParcelNumber(String parcelNumber) {
		this.parcelNumber = parcelNumber;
	}
	
	public void setLandType(String landType) {
		this.landType = landType;
	}
	
	public void setSMS(String soilMapSymbol) {
		this.soilMapSymbol = soilMapSymbol;
	}
	
	public void setCSRRate(int csrRate) {
		this.csrRate = csrRate;
	}
	
	public void setAcreage(double acreage) {
		this.acreage = acreage;
		}
	
	public void setCSRValue(double csrValue) {
		this.csrValue = csrValue;
	}
}
