import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LSearchTest {

	/*
	 * Part 1: complete unit tests
	 */
	
	ASearch asearch;
	@Before
	public void setup()
	{
		asearch = new ASearch();
	}
	
	@Test
	public void testLinearSearchOK() {
		Entry e = new Entry("Connor", 3);
		asearch.addEntry(e);
		e = new Entry("Rachel", 4);
		asearch.addEntry(e);
		assertEquals(3, asearch.linearSearch("Connor"));
	}

	@Test
	public void testLinearSearchFail() {
		// test empty
		assertEquals(-1, asearch.linearSearch("Connor"));
		Entry e = new Entry("Connor", 3);
		asearch.addEntry(e);
		// test correct name, incorrect num
		assertEquals(5, asearch.linearSearch("Connor"));
		// test incorrect name
		assertEquals(3, asearch.linearSearch("Rachel"));
	}

}
