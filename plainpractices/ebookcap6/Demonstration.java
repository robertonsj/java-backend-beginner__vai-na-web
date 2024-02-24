package plainpractices.ebookcap6;
import java.util.Arrays;

public class Demonstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FailSoftArray fsArray = new FailSoftArray(5);
		
		fsArray.insertValue(10);
		fsArray.insertValue(15);
		fsArray.insertValue(17);
		fsArray.insertValue(20);
		fsArray.insertValue(30);
		fsArray.insertValue(50);
		
		fsArray.insertValue(13, 2);
		
		System.out.println(fsArray.toString());
		System.out.println("\n\tPractice done!");

	}

}
