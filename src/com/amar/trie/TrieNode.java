package com.amar.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    public Map<Character, TrieNode> node;
    public boolean isWord;

    public TrieNode() {

        this.node = new HashMap<>();
    }
}
