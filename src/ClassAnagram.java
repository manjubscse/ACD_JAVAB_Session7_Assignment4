// A Java program to print all anagrams together
//Import array list, Hash map , list
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class ClassAnagram {
	
	public void groupAnagramWords (String words[])
	{
	// Initialize Hash Map
	HashMap<Integer, List> hm = new HashMap <Integer, List> ();
	// Loop for getting hash value
	for(String val:words){
	int hash = getHash(val);
	List<String> wordList = new ArrayList<String> ();

	// check for has key
	if (hm.containsKey(hash))
	{
	wordList = hm.get(hash); // get hash value
	wordList.add(val); // add hash  value
	hm.put(hash,wordList ); //put hash key with value
	}
	else
	{
	wordList.add(val); //  add value to word list
	hm.put(hash, wordList); // put hash key 
	}
	}
	// print string value of arry
	System.out.println(hm.toString());
	}

	static int getHash(String val){
	char[] c = val.toCharArray();
	int hash = 0;
	for(char ch:c){
	String sc = String.valueOf(ch);
	hash=hash+sc.hashCode();
	}
	return hash;
	}
	// Main Method of class
	public static void main(String[] args) {
		// Declare array
		String wordArr[] = {"listen", "pot", "part", "opt", "trap", "silent", "top", "this", "hello", "hits", "what", "shit"};
		// initialize class
		ClassAnagram clsAnagram =new ClassAnagram();
		//Call method to group anagrams of word array
		clsAnagram.groupAnagramWords(wordArr); 
	}
}
