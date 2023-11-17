package algo_solution;

public class Topic2 {
	public static void main(String[] args) {
		int result = solution("bbbabb");
		System.out.println("result :" + result);
	}

	public static int solution(String S) {
		int result = 0;
		int countDuplicateTemporary = 0;
		int countDuplicateFinal = 0;
		int lengthBlock = 0;
		char[] charArray = S.toCharArray();
		for (int i = 0; i < charArray.length - 1; i++) {
			if (charArray[i] == charArray[i + 1]) {
				countDuplicateTemporary++;
			}
			if (countDuplicateTemporary > countDuplicateFinal) {
				countDuplicateFinal = countDuplicateTemporary;
			}
			if (charArray[i] != charArray[i + 1]) {
				lengthBlock++;
				countDuplicateTemporary = 0;
			}
		}
		result = (lengthBlock + 1) * (countDuplicateFinal + 1) - charArray.length;
		return result;
	}
}
