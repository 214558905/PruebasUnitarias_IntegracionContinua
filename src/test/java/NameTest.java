import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameTest {


	private Name name;
	
	@Before
	public void Before() {
		
		this.name = new Name("Alex");
	}

	@Test
	public void getLeght() {
		
		assertEquals(4, this.name.getLeght());
	}
	
	@Test
	public void getReverse() {
		
		assertEquals("xelA", this.name.getReverse());
		
	}
}
