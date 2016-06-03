import java.util.Scanner;

public class Three_Num {
	static void GetSecondNum(int x[]){
		int savenum;
		if(x[0]>x[1]){
			if(x[0]>x[2]){
				if(x[1]>x[2]){
					System.out.println(x[1]);
				}else
					System.out.println(x[2]);
			}else
				System.out.println(x[0]);
		}else if(x[0]==x[2]){
			System.out.println(x[0]);
		}else{
			if(x[0]<x[2]){
				if(x[1]>x[2]){
					System.out.println(x[2]);
				}else
					System.out.println(x[1]);
			}else
				System.out.println(x[0]);
		}
	}

	public static void main(String[] args) {
		int ThreeNum[]= new int[3];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<3; i++){
			ThreeNum[i]=sc.nextInt();
			}
		GetSecondNum(ThreeNum);
	}

}
