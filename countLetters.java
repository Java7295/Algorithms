import java.util.HashMap;
import java.util.Map;

public class countLetters {

	public static void main(String[] args) {
		String inputStr = "AABCD2LL";
		System.out.println("Input string = " + inputStr);

		HashMap <Character, Integer> hashmap = new HashMap <Character, Integer> ();

		for (int i = 0; i < inputStr.length(); i++)
			if (hashmap.containsKey(inputStr.charAt(i)))
				hashmap.put(inputStr.charAt(i), hashmap.get(inputStr.charAt(i)) + 1);
			else
				hashmap.put(inputStr.charAt(i), 1);

		for (Map.Entry<Character, Integer> entry : hashmap.entrySet())
			if (Character.isLetter(entry.getKey()))
				System.out.print(entry.getValue() + "" + entry.getKey() + " ");

	}
}
