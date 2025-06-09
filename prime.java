import java.util.*;
public class prime{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
int n=in.nextInt();
int count=0;
for(int i=2;i<=n;i++){
if(n%i==0)
	count++;
}
if(count==1)
	System.out.println(n+" is prime Number");
else
	System.out.println("Not prime");
}
}
