import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExampleTest {
	Example<Integer> obj;
	
	@Before 
	public void setup(){
		obj = new Example<Integer>(); 
		System.out.println("Before, setup");
	}
	
	@Test
	public void testAdd() {
		assertTrue(obj.add(5));
		System.out.println("TestAdd");
	}

	@Test 
	public void testGet() {
		/** 
		 * Tests run independently, so you need to uncomment 
		 * the following line
		 */
		obj.add(5);
		assertEquals(obj.get(0), new Integer(5));
		System.out.println("testGet");
	}
	
	@Test 
	public void testSize() {
		obj.add(5);
		assertEquals(obj.size(), 1);
		System.out.println("testSize");
	}
}