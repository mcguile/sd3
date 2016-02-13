import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CollectionTest {

	Collection c;
	@Before
	public void setup(){
		c = new Collection();
	}
	
	/*
	 * To be completed in part 1
	 */
	@Test
	public void testEmptyMaxAge() {
		assertEquals(-1,c.maxAge());
	}

	@Test
	public void testOneElementMaxAge() {
		c.addPerson("Sam", "Irwin", 15);
		assertEquals(15,c.maxAge());
	}
	
	@Test
	public void testThreeElementsMaxAge() {
		c.addPerson("Connor", "McGuile", 22);
		c.addPerson("Charlie", "McGuile", 21);
		c.addPerson("Chris", "McGuile", 47);
		assertEquals(47,c.maxAge());
	}


}
