

package leetcode;


public class RomanToInt {
	private static int getRomanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // Default case should never be reached for valid input
        }
    }
	

	public static int romanToInt(String s) {
		
			int sum=0;
			int i =0;
	        		
	        while(i<s.length()  ) 
	        {
	        	sum+=getRomanValue(s.charAt(i));
	        	
        		if((i<s.length()-1)  &&(getRomanValue(s.charAt(i))<getRomanValue(s.charAt(i+1))) )
        		{
        			sum=sum-getRomanValue(s.charAt(i));
        			sum=sum-getRomanValue(s.charAt(i));
        			
	        	}
        		i++;
 	
	        	}

	        return sum;
  
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		romanToInt("MCMXCIV");

	}


}
