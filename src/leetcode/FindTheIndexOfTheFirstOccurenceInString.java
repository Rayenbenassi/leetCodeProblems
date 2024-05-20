package leetcode;


//Beats 89.36% of users with Java
public class FindTheIndexOfTheFirstOccurenceInString {
	 public static  int strStr(String haystack, String needle) {
         if(haystack.length()<needle.length()) {
				return -1;
			}
        else if(haystack.equals(needle)){
                    return 0;
            }
            else if(haystack.contains(needle)){
               for(int i=0;i<haystack.length();i++){
            	   if(haystack.substring(i).startsWith(needle)){
                    return i;
            	   }
               }
            }
	    return -1;
}
	public static void main(String[] args) {
		strStr("abc","c");
	}

}
