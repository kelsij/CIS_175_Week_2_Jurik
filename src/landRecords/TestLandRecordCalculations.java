package landRecords;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLandRecordCalculations {
	
	calculateLandRecordValues LRCalc = new calculateLandRecordValues();
	LandRecord agLandRecord = new LandRecord("Crop Land", 100, 1.0);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNeedsAdjustment() {
		agLandRecord.setLandType("Crop Land");
		assertFalse(LRCalc.needsCSRAdjustment(agLandRecord));
	}
	@Test
	public void testCSRValues() {
		double csrValue =(agLandRecord.getCSRRate())* (agLandRecord.getAcreage());
		assertEquals(1.0, csrValue, 100.0);
		
	}

}
