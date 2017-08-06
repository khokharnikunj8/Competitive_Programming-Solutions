import java.util.Scanner; 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
       
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		String s=sc.next();
		System.out.println(i*2);
		System.out.print(s);
        
    }
}