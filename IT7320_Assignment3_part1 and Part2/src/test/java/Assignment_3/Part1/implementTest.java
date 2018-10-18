package Assignment_3.Part1;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class implementTest {

	Icompute  InterfaceObj;
	implementation implementationObj;
	int x;
	int y;
	
	@Before
	public void setUp() throws Exception{
		implementationObj = new implementation();
		x = 500;
		y = 700;
		
		InterfaceObj = Mockito.mock(Icompute.class);
	}

	@Test
	public void teardown() throws Exception {
		InterfaceObj = null;
		implementationObj = null;	
	}

}
