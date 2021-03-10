package qio.io.code.qio_code;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

public class SortingProblemTest {

	private SortingProblem sorting;

	@Before
    public void before() throws Exception {
        System.out.println("Before Test!");
        sorting = new SortingProblem();
    }
	
	@Test
	public void testSort() {
		int[] arrMock = new int[] {2,3,4,1};
		int[] arr = sorting.sort(arrMock);
		assertEquals(arrMock, arr);  
	}
	
	@Test
	public void testSortWithLength() {
		int[] arrMock = new int[] {2,3,4,1};
		int[] arr = sorting.sort(arrMock);
		assertEquals(arrMock.length, arr.length);  
	}
	
	@Test(expected=NullPointerException.class)
	public void testSortWithNull() {
		int[] arrMock = null;
		int[] arr = sorting.sort(arrMock);
	}
	
	@Test
	public void testSortWithEmpty() {
		int[] arrMock = new int[]{};
		assertSame(arrMock, sorting.sort(arrMock));
	}
}
