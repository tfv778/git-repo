
public class StringBuff {

public String makeSentence (String[] words)
{ StringBuffer sentence = new StringBuffer();
for (String w : words) {
	sentence.append(w);sentence.append(" "); 
}
return sentence.toString();
}
	public static void main(String[] args) {
		StringBuff sb = new StringBuff ();
		String[] stringArray = {"i","am","super"};
		String s = sb.makeSentence(stringArray);
		System.out.println(s);
	}

}
