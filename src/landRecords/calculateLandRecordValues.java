package landRecords;

public class calculateLandRecordValues {

	public boolean needsCSRAdjustment(LandRecord LandRecord) {
		boolean adjustCSR;
		if (LandRecord.getLandType() == "Crop Land") {
			adjustCSR  = false;
		}
		else {
			adjustCSR = true;
		}
		
		return adjustCSR;
	}
	
	public double calculateCSRValue(LandRecord LandRecord) {
		double csrValue;
		double acres = LandRecord.getAcreage();
		int rate = LandRecord.getCSRRate();
		csrValue = acres * rate;
		
		return csrValue;
		}
}
