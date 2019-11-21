/* Author   -  Nanda kumar.s 
 * Version  -  1.2
 * Purpose  -  JUnitTest case to test the junit pograms
 * FileName -  TestCases.java
 * Date     -  20/11/2019
 */
package junittest;
import static org.junit.Assert.*; 
import org.junit.Test;
import com.bridgelabz.utility.Utility;

public class TestCases {

	@Test
	public void TestDayOfWeek() {
		assertEquals(2,Utility.DayOfWeek(19,11,2019));
	}
	
	@Test
	public void TestToBinary()
	{
		assertEquals("11000",Utility.ConvertToBinary(24));
	}
	
	@Test
	public void TestSqrt()
	{
		assertEquals(Math.sqrt(16),Utility.Sqrt(16),Math.exp(-15));
	}
	
	@Test
	public void TestNotes()
	{
		int arr[]={5,1,0,1,0,1,0,0,1};
		assertArrayEquals(arr,Utility.PrintNotes(5561));
	}
	
	@Test
	public void TestSwapNibbles()
	{
		assertEquals(6,Utility.ConvertToBinSwap(24));
	}
	
	@Test
	public void TestTempConvertion()
	{
		assertEquals(122,Utility.TemperatureConversion(50,1));
	}

	@Test
	public void test_Monthpay()
	{
		assertEquals(286,(int)Utility.MonthlyPayment(10000,2,3),Math.exp(-15));
	}
     
	
}
