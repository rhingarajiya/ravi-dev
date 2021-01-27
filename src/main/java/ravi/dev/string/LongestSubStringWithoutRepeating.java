package ravi.dev.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeating {

    //sliding window problem solving using map
    int lengthOfLongestSubstring(String input) {
        int n = input.length();
        Map<Character, Integer> characterAndIndexMap = new HashMap<>();
        int answer = 0;
        int i = 0;
        for (int j=0; j<n; j++) {
            if (characterAndIndexMap.containsKey(input.charAt(j))) {
                i = Math.max(characterAndIndexMap.get(input.charAt(j)), i);
            }
            characterAndIndexMap.put(input.charAt(j), j + 1);
            answer = Math.max(answer, j - i + 1);
        }
        return answer;
    }

}
