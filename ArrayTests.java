import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1,2,3,4,5 };
    assertArrayEquals(new int[]{ 5,4,3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testaverageWithoutLowest(){
    double [] arr={10,4,5,8,6,2,2};
    double avg=ArrayExamples.averageWithoutLowest(arr);
    assertEquals(6.6,avg,0.001);

  }

}
