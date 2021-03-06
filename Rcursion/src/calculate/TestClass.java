/**
 * 
 */
package calculate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Divyaprakash
 *
 */
class TestClass {
	recursion r;
	@BeforeEach
	void init(){
		r = new recursion();
	}
	
	@Test
	void testLcm() {
		int[][] input = {{2,3},{20,36},{45,9},{0,1}};
		int[] output = {6,180,45,0};
		for(int i=0;i<input.length;i++){
			assertEquals(output[i], r.LCM(input[i][0], input[i][1]));
		}
	}
	
	@Test
	void testHcf() {
		int[][] input = {{2,8},{14,35},{45,9}};
		int[] output = {2,7,9};
		for(int i=0;i<input.length;i++){
			assertEquals(output[i], r.HCF(input[i][0], input[i][1]));
		}
	}


}
