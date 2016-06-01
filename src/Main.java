
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		int room[] = new int[num];
		int val[] = new int[6];
		for (int i = 0; i < num; i++) {
			String s = new Scanner(System.in).nextLine();
			String[] e=s.split(" ");
			
			for(int x=0;x<6;x++){
				val[x]=Integer.valueOf(e[x]);
			}
			//두 중심 사이 거리
			int len = ((((val[0]-val[3])*(val[0]-val[3]))
					+ ((val[1]-val[4])*(val[1]-val[4]))));
			
			int b = ((val[2] + val[5])*(val[2] + val[5]));
			//c는 두개의 반지름 길이 뺀거 제곱
			int c = ((val[2] - val[5])*(val[2] - val[5]));
			if (len==0){
				if (val[2]==val[5]) {
					room[i] = -1;
				} else {
					room[i] = 0;
				}

			} else {
				if (len >b) {
					room[i]=0;
				}else if(len==b){
					room[i]=1;
				}else{
					if(len==c){
						room[i]=1;
					}else if(len<c){
						room[i]=0;
					}else if(len>2){
						room[i]=2;
					}else
						room[i]=2;
				}
			}
		}
		for (int i = 0; i < num; i++)
			System.out.println(room[i]);
	}

}
