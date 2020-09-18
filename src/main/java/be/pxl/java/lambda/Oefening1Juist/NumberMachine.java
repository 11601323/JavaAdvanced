package be.pxl.java.lambda.Oefening1Juist;

import java.util.ArrayList;
import java.util.function.Function;

public class NumberMachine {
	private ArrayList<Integer> numbers = new ArrayList<>();
	
	public NumberMachine(int[] numbers) {
		for(int i=0;i<numbers.length;i++)
			this.numbers.add(numbers[i]);
	}
	
	public String processNumbers(NumberFilter filter) {
		String result = "";
		for(int i=0;i<numbers.size();i++) {
			if(filter.check(numbers.get(i))) {
				if(!result.equals("")) {
					result += "-";
				}
				result += numbers.get(i);
			}
		}
		return result;
	}

	public String converNumbers(NumberConvert numberConvert){
		String result = "";
		for(int i=0;i<numbers.size();i++) {
			result += numberConvert.toHex(numbers.get(i));

			if(i != numbers.size() -1){
				result +="-";
			}


		}
		return result;
	}

}
