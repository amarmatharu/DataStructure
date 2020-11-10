package com.amar.trie;

public class TrieRunner {

    public static void main(String[] args){
        TrieX trie = new TrieX();
        trie.insert("amar");
        trie.insert("Kabir");
        System.out.println(trie.isCompleteWord("amardeep"));
        System.out.println(trie.isCompleteWord("Kabir"));
        System.out.println(trie.isValidPrefix("amar"));
        System.out.println(trie.isValidPrefix("Kab"));
    }
}
