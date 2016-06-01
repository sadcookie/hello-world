
import java.util.Scanner;

public class TurretProblem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int TestCase = Integer.valueOf(scan.nextLine());
		int ResultValue[] = new int[TestCase];
		int TwoCircleValue[] = new int[6];
		for (int i = 0; i < TestCase; i++) {
			String s = scan.nextLine();
			String[] e = s.split(" ");
			for (int x = 0; x < 6; x++) {
				TwoCircleValue[x] = Integer.valueOf(e[x]);
			}
			// 두 중심 사이 거리
			int DistanceByCircles = ((((TwoCircleValue[0] - TwoCircleValue[3]) * (TwoCircleValue[0] - TwoCircleValue[3])) + ((TwoCircleValue[1] - TwoCircleValue[4]) * (TwoCircleValue[1] - TwoCircleValue[4]))));

			int MergeTwoRadius = ((TwoCircleValue[2] + TwoCircleValue[5]) * (TwoCircleValue[2] + TwoCircleValue[5]));
			// c는 두개의 반지름 길이 뺀거 제곱
			int DiveTwoRadius = ((TwoCircleValue[2] - TwoCircleValue[5]) * (TwoCircleValue[2] - TwoCircleValue[5]));
			if (DistanceByCircles == 0) {
				if (TwoCircleValue[2] == TwoCircleValue[5]) {
					ResultValue[i] = -1;
				} else {
					ResultValue[i] = 0;
				}

			} else {
				if (DistanceByCircles > MergeTwoRadius) {
					ResultValue[i] = 0;
				} else if (DistanceByCircles == MergeTwoRadius) {
					ResultValue[i] = 1;
				} else {
					if (DistanceByCircles == DiveTwoRadius) {
						ResultValue[i] = 1;
					} else if (DistanceByCircles < DiveTwoRadius) {
						ResultValue[i] = 0;
					} else
						ResultValue[i] = 2;
				}
			}
		}
		for (int i = 0; i < TestCase; i++)
			System.out.println(ResultValue[i]);
	}

}
