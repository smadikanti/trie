public class Main {

	public static void main(String[] args) {
        
        // Create a Trie Data Structure
        Trie trie = new Trie();
        

		trie.insert("Am");
		trie.insert("America");
		trie.insert("Americano");
		trie.insert("Pro");
        trie.insert("Professional");
        
        boolean result = trie.search("Pro");
        
		System.out.println(result);
	}

}