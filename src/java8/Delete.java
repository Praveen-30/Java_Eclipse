package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	List<Integer> ls =	list.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
	List<Integer> ls1 = list.stream().filter(i -> i% 2 != 0).collect(Collectors.toList());
	System.out.println("Even :"+ls+"\n"+"Odd :"+ls1);
	
	
	
	
	}

}
