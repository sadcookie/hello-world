import java.util.Scanner;

public class LittlePrince {
	public static int X_Y[] = new int[4];
	public static int count=0;

	static int TwoDotDistance(int x1, int y1, int x2, int y2) {
		return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
	}

	static void CompareLength(int x, int y, int r, int a[]) {
		int DistanceStartToCircleCenter = (a[0] - x) * (a[0] - x) + (a[1] - y) * (a[1] - y);
		int DistanceEndToCircleCenter = (a[2] - x) * (a[2] - x) + (a[3] - y) * (a[3] - y);
		;
		int radius = r * r;
		//시작점과 끝점이 원안에 있을 떄
		if (DistanceStartToCircleCenter < radius && DistanceEndToCircleCenter < radius) {
			return;
		//시작점과 끝점이 원에 포함되 지 않을때
		} else if (DistanceStartToCircleCenter > radius && DistanceEndToCircleCenter > radius) {
			return;
		//시작점 또는 끝점이 원에 포함될 때
		} else {
			count++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int DistanceByDotCircleCenter;
		int TestCase=sc.nextInt();
		for(int i=0;i<TestCase;i++){
			for(int b=0;b<4;b++){
				X_Y[b]=sc.nextInt();
			}
			int XYCase=sc.nextInt();//원좌표 입력 횟수
			for(int a=0;a<XYCase;a++){
				CompareLength(sc.nextInt(),sc.nextInt(),sc.nextInt(),X_Y);//원좌표 넣기
			}
			System.out.println(count);
			count=0;
		}

	}
}
