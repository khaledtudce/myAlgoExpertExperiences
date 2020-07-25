package algoExpertProblems.Tries;

import static org.junit.Assert.*;

import org.junit.Test;

import algoExpertProblems.Tries.SuffixTrieConstruction;
import algoExpertProblems.Tries.SuffixTrieConstruction.SuffixTrie;

public class SuffixTrieConstructionTest {

	@Test
  public void TestCase1() {
	SuffixTrie trie = new SuffixTrieConstruction.SuffixTrie("babc");
    assertTrue(trie.contains("abc"));
    assertTrue(trie.contains("bc"));
    assertFalse(trie.contains("bcb"));
  }

}
