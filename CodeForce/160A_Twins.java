// 							made by
//						
//
//
//							Nikunj Khokhar
//							B.Tech. 1 year -> Computer Engineering
//						
//
//
//
//
//							SVNIT,Surat
//					
//
//
//
//							contact : +918347287925
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
 class Main 
 {
 		static Scanreader sc=new Scanreader();
 		public static void out(Object j){System.out.print(j);}
 		public static LinkedList <String> ln;
 		public static boolean isPrime(long n) {
			if(n < 2) return false;
			if(n == 2 || n == 3) return true;
			if(n%2 == 0 || n%3 == 0) return false;
			long sqrtN = (long)Math.sqrt(n)+1;
			for(long i = 6L; i <= sqrtN; i += 6) 
			{
			if(n%(i-1) == 0 || n%(i+1) == 0) return false;
			}
			return true;
		}
		public static int nextPrime(int n)
		{
			if(isPrime(n+1))return n+1;
			else return nextPrime(n+1);
		}
		public static int  prePrime(int n)
		{
			if(n-1<=0)return 0;
			if(isPrime(n-1))return n-1;
			else return prePrime(n-1);
		}
		
		public static double trnarea(int x1, int y1, int x2, int y2, int x3, int y3)
		{
			return (double)Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
		}
		public static boolean inTriangle(int p1, int p2, int p3, int p4, int p5, int p6, int p11, int p22)
		{
			double area=trnarea(p1,p2,p3,p4,p5,p6);
			double area1=trnarea(p1,p2,p3,p4,p11,p22);
			double area2=trnarea(p1,p2,p11,p22,p5,p6);
			double area3=trnarea(p11,p22,p3,p4,p5,p6);
			if(area==area1+area2+area3)return true;
			else return false;
		}
		public static long factorial(int n)
		{
			long a=1;
			for(int i=1;i<=n;i++)a*=i;
			return a;
		}
		
		public static int[] bfs(int b[][],int c)
		{
			
			LinkedList<Integer> ln=new LinkedList<Integer>();
			int node=b[c].length-1;
			int ans[]=new int[node];
			int visit[]=new int[node+1];
			int i,element,j=0;
			visit[c]=1;
			ln.add(c);
			
			while(ln.size()!=0)
			{
					element=ln.removeFirst();
					ans[j]=i=element;
					j++;
					while(i>=1)
					{
						if(b[element][i]!=0 && visit[i]==0)
						{
							ln.add(i);
							visit[i]=1;
						}
						i--;
					}
					i=element;
					while(i<=node)
					{
						if(b[element][i]!=0 && visit[i]==0)
						{
							ln.add(i);
							visit[i]=1;
						}
						i++;
						
					}
			}
			return ans;
			
			
				
		}
		public static int[] dfs(int b[][],int c)
		{
			
			LinkedList<Integer> ln=new LinkedList<Integer>();
			int node=b[c].length-1;
			int ans[]=new int[node];
			int visit[]=new int[node+1];
			int i,element,j=1;
			visit[c]=1;
			ans[0]=c;
			ln.addFirst(c);
			
			while(ln.size()!=0)
			{
					element=ln.get(0);
					
					i=1;
					while(i<=node)
					{
						if(b[element][i]!=0 && visit[i]==0)
						{
							ln.addFirst(i);
							visit[i]=1;
							element=i;
							ans[j]=element;
							j++;
							i=1;
							continue;
						}
						i++;
						
					}
					ln.removeFirst();
			}
			return ans;
		}
		 public static void sort(int[] a, int low, int high) 
  		{
       		 int N = high - low;         
      		  if (N <= 1) 
           		 return; 
       		 int mid = low + N/2; 
        // recursively sort 
       		 sort(a, low, mid); 
        	 sort(a, mid, high); 
        // merge two sorted subarrays
       		 int[] temp = new int[N];
       		 int i = low, j = mid;
      		  for (int k = 0; k < N; k++) 
      		  {
           		 if (i == mid)  temp[k] = a[j++];
           		 else if (j == high) temp[k] = a[i++];
           		 else if (a[j]<a[i])  temp[k] = a[j++];
            	else temp[k] = a[i++];
        	}    
        	for (int k = 0; k < N; k++)a[low + k] = temp[k];         
   		 }
   		public static int gcd(int a,int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
   		 }
   		 public static String addition(String a,String b)
   		 {
   		 	StringBuilder sb=new StringBuilder();
   		 	int x=a.length();
   		 	int y=b.length();
   		 	int i=0,temp=0,carry=0;
   		 	while(i<x && i<y)
   		 	{
   		 			temp=(a.charAt(x-i-1)-'0')+(b.charAt(y-i-1)-'0')+carry;
   		 			sb.append(temp%10);
   		 			carry=temp/10;
   		 			i++;
   		 	}
   		 	while(i<x)
   		 	{
   		 		temp=(a.charAt(x-i-1)-'0')+carry;
   		 			sb.append(temp%10);
   		 			carry=temp/10;
   		 			i++;
   		 	}
   		 	while(i<y)
   		 	{
   		 		temp=(b.charAt(y-i-1)-'0')+carry;
   		 			sb.append(temp%10);
   		 			carry=temp/10;
   		 			i++;
   		 	}
   		 	if(carry!=0)sb.append(carry);
   		 	return sb.reverse().toString();

   		 }
   		   
 		public static void main(String[] args) throws Exception
 		{
 			//int a=sc.scanInt();
 			int a=1;
 			//String s;
 			int c;
 			//int d;
 			
 			int b[];
 			//boolean flag;
 			while(a-->0)
 			{
 					//flag=true;
 					c=sc.scanInt();
 					b=new int[c];sc.scanInt(b);
 					//s=sc.scanString();
 					//d=sc.scanInt();
 					for(int i=0;i<c;i++)
 					{
 						for(int j=c-1;j>=i+1;j--)
 						{
 							if(b[j]<b[j-1])b[j]=b[j]+b[j-1]-(b[j-1]=b[j]);
 						}
 					}
 					int count=0;
 					int sum=0;
 					for(int i=0;i<c;i++)sum+=b[i];
 						int temp=0;
 					for(int i=c-1;i>=0;i--)
 					{
 						temp+=b[i];
 						count++;
 						if(sum-temp<temp)break;
 					}
 					out(count+"\n");

 					
 			}

 			
 			
 			
 			
 		

 			

 		}
 }
 class Scanreader{
 		private byte[] buf=new byte[4*1024];   
		private int index;
		private BufferedInputStream in;
		private int total;
		public Scanreader(){in=new BufferedInputStream(System.in);}
		public int scan()throws IOException{if(total<0)throw new InputMismatchException("in scan");if(index>=total){index=0;total=in.read(buf);if(total<=0)return -1;}return buf[index++];}
		public int scanInt()throws IOException{int integer=0;int n=scan();while(isWhiteSpace(n)) n=scan();int neg=1;if(n=='-'){neg=-1;n=scan();}while(!isWhiteSpace(n)){if(n>='0'&&n<='9'){integer*=10;integer+=n-'0';n=scan();}else throw new InputMismatchException("scan int");}return neg*integer;}
		public String scanString() throws IOException{int c=scan();while(isWhiteSpace(c))c=scan();StringBuilder res = new StringBuilder();do{res.appendCodePoint(c);c = scan();}while(!isWhiteSpace(c));return res.toString();}
		private boolean isWhiteSpace(int n){if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)return true;else return false;}
		public long scanLong()throws IOException{long integer=0;int n=scan();while(isWhiteSpace(n)) n=scan();int neg=1;if(n=='-'){neg=-1;n=scan();}while(!isWhiteSpace(n)){if(n>='0'&&n<='9'){integer*=10;integer+=n-'0';n=scan();}else throw new InputMismatchException("scan long");}return neg*integer;}
		public void scanLong(long[] A)throws IOException{for(int i=0;i<A.length;i++)A[i] = scanLong();}
		public void scanInt(int[] A)throws IOException{for(int i=0;i<A.length;i++)A[i] = scanInt();}
		public double readDouble() throws IOException{int c=scan();while(isWhiteSpace(c))c=scan();int sgn = 1;if(c == '-'){sgn=-1;c=scan();}double res=0;while(!isWhiteSpace(c)&&c!='.'){if(c=='e'||c =='E'){return res*Math.pow(10,scanInt());}if(c<'0'||c>'9'){throw new InputMismatchException();}res*=10; res+=c-'0';c=scan();}if(c=='.'){c=scan();double m=1;while(!isWhiteSpace(c)){if(c=='e'||c=='E'){return res*Math.pow(10,scanInt());}if(c<'0'||c>'9'){throw new InputMismatchException();}m/=10;res+=(c-'0')*m;c=scan();}}return res*sgn;}
 }
 