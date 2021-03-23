package hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class TwoDimensionalArray {

	
	static final int[] arr = {3,3,2,1,1};
	
	public static void main(String... args) {
		
		List<Integer> list = new ArrayList<>();
		for(int ii=0;ii<arr.length;ii++) {
			list.add(arr[ii]);
		}
		
		// Count values
		List<List<Integer>> result = new LinkedList<>();

		// Count values
		list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		// Sort and add to final list
		.entrySet().stream()
			// Sort
			.sorted((e1,e2) -> e1.getValue() != e2.getValue() ? 
					// Desc by Frequency ( the value of the map )
					e2.getValue().compareTo(e1.getValue()) :
					// Asc by Value	( the key of the map )
					e1.getKey().compareTo(e2.getKey()))
			// Collecto to list
			.forEachOrdered(e -> {
            	   List<Integer> tempList = new ArrayList<>();
            	   tempList.add(e.getKey());
            	   tempList.add(e.getValue().intValue());
            	   result.add(tempList);
               });
		
		System.out.println("Value	| Frequency");
		for(List<Integer> l : result) {
			System.out.println(""+l.get(0)+"	|	"+l.get(1));
		}
	}	
	
	
}
