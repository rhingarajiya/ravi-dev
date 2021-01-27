package ravi.dev.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubStringWithoutRepeatingTest {

    @Test
    public void testLongestSubStringWithoutRepeating() {
        LongestSubStringWithoutRepeating repeating = new LongestSubStringWithoutRepeating();
        assertEquals(3, repeating.lengthOfLongestSubstring("pwwkew"));
        assertEquals(1, repeating.lengthOfLongestSubstring("aaaaa"));
        assertEquals(3, repeating.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(2, repeating.lengthOfLongestSubstring("ababab"));
        assertEquals(6, repeating.lengthOfLongestSubstring("adefbzeab"));
        assertEquals(2, repeating.lengthOfLongestSubstring("aab"));
        assertEquals(4, repeating.lengthOfLongestSubstring("aababcabcd"));
        assertEquals(1, repeating.lengthOfLongestSubstring("a"));
        assertEquals(1, repeating.lengthOfLongestSubstring(" "));
        assertEquals(1, repeating.lengthOfLongestSubstring("  "));
        assertEquals(3, repeating.lengthOfLongestSubstring("dvdf"));
    }

}