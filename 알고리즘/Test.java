import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		String[] words = { "hello", "one", "even", "never", "now", "world", "draw" };
		int n = 2;
		int[] answer = solution(n, words);
		System.out.println(Arrays.toString(answer));
	}

	public static int[] solution(int n, String[] words) {
		int[] answer = { 0, 0 };
		List<String> list = new LinkedList<>();
		list.add(words[0]);
		int wrong = -1;
		for (int i = 0; i < words.length - 1; i++) {
			char[] firstWord = words[i].toCharArray();
			char[] secondWord = words[i + 1].toCharArray();
			if (firstWord[firstWord.length - 1] != secondWord[0]) {
				wrong = i + 2;
				break;
			} // 다른거 말함 틀림

			if (list.contains(words[i + 1])) { // 같은거 말함
				wrong = i + 2;
				break;
			} else {
				list.add(words[i + 1]);
			}
		}
		if (wrong == -1)
			return answer;
		else {
			answer[0] = wrong % n == 0 ? n : wrong % n;
			answer[1] = wrong % n == 0 ? wrong / n : wrong / n + 1;
			return answer;
		}
	}

}
