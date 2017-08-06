 //Problem Link : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
/*
*
* @author Nikunj Khokhar
*
*/
 
class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int len=str.length();
	char[] ch=str.toCharArray();
 
	for(int i=0;i<len;i++){
		if(ch[i]<=90)ch[i]=Character.toLowerCase(ch[i]);
		else ch[i]=Character.toUpperCase(ch[i]);

 
	}
	for(int k=0;k<len;k++)System.out.print(ch[k]);
 

    }
}