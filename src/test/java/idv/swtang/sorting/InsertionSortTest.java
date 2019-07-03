package idv.swtang.sorting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InsertionSortTest {

	private static int[] input;
    private static int[] expectedDesc = new int[] {93, 77, 55, 54, 44, 31, 26, 20, 17};
    private static int[] expectedAsc = new int[] {17, 20, 26, 31, 44, 54, 55, 77, 93};
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		 input = new int[] {54,26,93,17,77,31,44,55,20};
	}

	@Test
	public void test() {
		assertArrayEquals(expectedAsc, InsertionSort.sortAsc(input));
	}

}
