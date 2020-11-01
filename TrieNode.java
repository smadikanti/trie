import java.util.HashMap;

public class TrieNode {
	private char c; // current character
	private HashMap<Character, TrieNode> children = new HashMap<>(); // hashmap that has children
	private boolean isLeaf; // boolean that says if this node is the end of the word

	public TrieNode(){}
	
	public TrieNode(char c){
		this.c = c;
	}
	
	public HashMap<Character, TrieNode> getChildren(){
		return children;	
	}

	public void setChildren(HashMap<Character, TrieNode> children){
		this.children = children;	
	}

	public void setLeaf(boolean isLeaf){
		this.isLeaf = isLeaf;
	}

	public boolean isLeaf(){
		return isLeaf;
	}
	
}