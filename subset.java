import java.util.*;
public class subset {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,n,n1,a;
		n=sc.nextInt();
		n1=sc.nextInt();
		ArrayList<Integer> l=new ArrayList<Integer>();
		ArrayList<Integer> l1=new ArrayList<Integer>();
		for(i=0;i<n;i++){
			a=sc.nextInt();
			l.add(a);
		}
		for(i=0;i<n1;i++){
			a=sc.nextInt();
			l1.add(a);
		}
		if(l.containsAll(l1)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
}
}
