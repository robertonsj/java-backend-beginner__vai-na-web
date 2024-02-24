/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plainpractices.ebookcap6;

import java.util.Arrays;

/*
 * This class implements an array "fault resistant", 
 * which prevent occurring runtime errs.
 * 1. Taking a random array value: 
 * 		a. Check if that index is within the scope of the array;
 * 		b. return the value or a failure message.
 * 2. Insert an element into the array.
 * 		i. Check if that index is within the scope of the array;
 * 		b. insert the value and display a successfully added, or display
 * 			no added.
*/
public class FailSoftArray {
	private int[] ourArray;
	private int errorValue = -1; //value to be returned if indexOK() is false
	

	public FailSoftArray(int size) {
		ourArray = new int[size];
	}
	
	public boolean indexOK(int index) {
		if(index >= 0 && index < ourArray.length) {return true;}
		else {
			System.out.println("\tIndex " + index + " out of bound.");
			return false;
		}
	}
	
	public int getArrayValue(int index) {
		if(indexOK(index)) {return ourArray[index];}
		return errorValue;
	}
	
	public void insertValue(int value, int index) {
		if(indexOK(index)) {
			ourArray[index] = value;
			System.out.println("The value " + value + " has been inserted.");
		}else {
			System.out.println("The value " + value + " hasn't been inserted.");			
		}
		
	}

	public String toString() {
//		return "FailSoftArray [ourArray=" + Arrays.toString(ourArray) + "]";
		return ourArray.toString();
	}
	
	
	

}
