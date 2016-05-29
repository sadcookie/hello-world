
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		int room[] = new int[num];
		String a[] = new String[6];
		for (int i = 0; i < num; i++) {
			String val = new Scanner(System.in).nextLine();
			int length = val.length();
			a = (val.split(" "));
			int b = (Integer.valueOf(a[2])+Integer.valueOf(a[5]))*
					(Integer.valueOf(a[2])+Integer.valueOf(a[5]));
			int c = (Integer.valueOf(a[2])-Integer.valueOf(a[5]))*
					(Integer.valueOf(a[2])-Integer.valueOf(a[5]));
			if (Integer.valueOf(a[0]) != Integer.valueOf(a[3]) || Integer.valueOf(a[1]) != Integer.valueOf(a[4])) {
				int len = ((Integer.valueOf(a[0]) - Integer.valueOf(a[3]))
						* (Integer.valueOf(a[0]) - Integer.valueOf(a[3])))
						+ ((Integer.valueOf(a[1]) - Integer.valueOf(a[4]))
								* (Integer.valueOf(a[1]) - Integer.valueOf(a[4])));
				if(len==b){
					room[i]=1;
				}else if(len>b){
					if(len==c){
					room[i]=1;
	
				}else
					room[i]=0;
				}else if(len<b){
					if(len==c){
					room[i]=1;
					
				}else
					room[i]=2;
				}
				
			}else {
				if(Integer.valueOf(a[2])==Integer.valueOf(a[5])){
					room[i]=-1;
				}else{
					room[i]=0;
				}
			}
		}
		for(int i=0;i<num;i++)
		System.out.println(room[i]);
	}

}
