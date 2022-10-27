
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 3};
		int solution = new Solution().solution(A);
		System.out.println(solution);
	}

	public int solution(int[] A) {
		// write your code in Java SE 8
		int positiveInt = 1;
		for (int j = 1; j < A.length; j++) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] == positiveInt) {
					positiveInt++;
				}
			}
		}
		return positiveInt;
	}
}
