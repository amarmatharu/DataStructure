package com.amar.trie;

public class TrieX {

    private TrieNode root;

    public TrieX() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char letter = word.charAt(i);
            TrieNode node = current.node.get(letter);
            if (node == null) {
                node = new TrieNode();
                current.node.put(letter, node);
            }
            current = node;
        }
        current.isWord = true;
    }

    public boolean isCompleteWord(String word) {
        TrieNode current = root;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char letter = word.charAt(i);
            TrieNode node = current.node.get(letter);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.isWord;
    }

    public boolean isValidPrefix(String word) {
        TrieNode current = root;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char letter = word.charAt(i);
            TrieNode node = current.node.get(letter);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current != null;
    }

}
