package algo_solution;

public class Topic2 {
	public static void main(String[] args) {
		String a = "babaa";
		String b = "bbbab";
		String c = "bbbaaabbb";
		System.out.println("result a:" + solution(a));
		System.out.println("result a:" + solution(b));
		System.out.println("result a:" + solution(c));
	}

	public static int solution(String S) {
		int result = 0;
		int countDuplicateTemporary = 0;
		int countDuplicateFinal = 0;
		int lengthBlock = 0;
	;
		for (int i = 0; i < S.length() - 1; i++) {
			if (S.charAt(i) == S.charAt(i + 1)) {
				countDuplicateTemporary++;
			}
			if (countDuplicateTemporary > countDuplicateFinal) {
				countDuplicateFinal = countDuplicateTemporary;
			}
			if (S.charAt(i) != S.charAt(i + 1)) {
				lengthBlock++;
				countDuplicateTemporary = 0;
			}
		}
		result = (lengthBlock + 1) * (countDuplicateFinal + 1) - S.length();
		return result;
	}
}
