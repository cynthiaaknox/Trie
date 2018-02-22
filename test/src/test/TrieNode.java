package test;

import java.util.HashMap;

/**
 * https://www.programcreek.com/2014/05/leetcode-implement-trie-prefix-tree-java/
 */
public class TrieNode {
    
    char c;
    HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
}
