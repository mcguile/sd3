import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LinkedListTest {

	LinkedList l;
	
	@Before
	public void setup(){
		l = new LinkedList();
	}
	
	/*
	 * Part 1: implement these methods
	 */
	@Test
	public void testCalculateSizeEmpty() {
		assertEquals(0, l.calculateSize());
	}

	@Test
	public void testCalculateSizeMany() {
		l.addAtTail(15);
		l.addAtHead(24);
		l.addAtHead(22);
		assertEquals(3, l.calculateSize());
	}

	
	@Test
	public void testCalculateTotalEmpty() {
		assertEquals(0, l.calculateTotal());
	}

	@Test
	public void testCalculateTotalMany() {
		l.addAtHead(3);
		l.addAtHead(9);
		l.addAtHead(11);
		// total should be 23
		assertEquals(23, l.calculateTotal());
	}
	
	/*
	 * Optional part
	 */
	
	@Test
	public void testReverse() {
		fail("Not yet implemented");
	}

}
