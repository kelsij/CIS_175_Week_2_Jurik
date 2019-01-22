package landRecords;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLandRecordCal2 {

	calculateLandRecordValues LRCalc = new calculateLandRecordValues();
	LandRecord agLandRecord = new LandRecord("Non-Crop Land", 100, 1.0);
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNeedsAdjustment() {
		agLandRecord.setLandType("Non-Crop Land");
		assertTrue(LRCalc.needsCSRAdjustment(agLandRecord));
	}

}
