//Problem Link : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/
import java.util.*;
import java.lang.*;

/*
*
* @author Nikunj Khokhar
*
*/
 
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner scs=new Scanner(System.in);
		String line=scs.next();
		int i=0,j=0;
		char c[]=line.toCharArray();
		for ( i = 0, j=line.length()-1; i <line.length()/2 ; i++,j--) {
		if (c[i]==c[j])
		continue;
		else break;
		}
			if (line.length()%2==0&&i-1==j||line.length()%2!=0&&i==j)
		System.out.println("YES");
		else
		System.out.println("NO");
    }
}