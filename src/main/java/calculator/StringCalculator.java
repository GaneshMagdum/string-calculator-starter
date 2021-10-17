package calculator;

import java.util.ArrayList;
import java.util.List;

class StringCalculator {
	static int count = 0;


	public int add(String input) throws Exception {
		
		count++;
		int sum=0;
		
		List<Integer> list=new ArrayList<>();
		if(input.isEmpty()) {
			
		}
	       if(input.isEmpty())
	    	   
	    	    return 0;
	       else {
	    	   if(input.length()==1)
	    	   return Integer.parseInt(input);
	    	   else {
	    		   String[] nums = StringCalculator.split(input);
	    		  
	    		   for (String num : nums) {
	    			   if (Integer.parseInt(num) < 0) {
	                       list.add(Integer.parseInt(num));
	                   }
	    			   else {
	    				   
	    				   if(Integer.parseInt(num)>1000)
	    					   num="0";
	    				   sum+=Integer.parseInt(num);
	    				   
	    			   }
	    			   
//	    			   if (Integer.parseInt(num) < 0) {
//	    	                throw new StringCalculatorException("negatives not allowed " +num);
//	    	            }

	    	     //       sum += Integer.parseInt(num);
	    	        }
	    		   if(list.size()>0) {
	    			   throw new StringCalculatorException("negatives not allowed "  +list.toString());
	    		   }
	    		   return sum;
	    	   }
	       }
	    }
	 private static String[] split(String str)
		{
		 
		 if (str.startsWith("//")) {   //
             String delimiter = str.substring(2, 3);
             return str.substring(4).split(delimiter);
    	 }

			String[] nums = str.split(",|\n");
			return nums;
		}
	 
	 public int getCallCount() {
			return count;
		}

	}
	
	
      