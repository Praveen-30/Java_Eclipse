package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       
       ListIterator itr = (ListIterator) list.listIterator();
       while(itr.hasNext())
       {
    	     Integer inte = (Integer)itr.next();
    	     if(inte%2==0)
    	     {
    	    	 itr.add(3);
    	     }
    	     else
    	     {
    	    	 itr.remove();;
    	     }
    	   
       }
      System.out.println(list);
                  
       
	}

}
