package strings;

public class ReverseExamword {
	 	
		public static String reverseEachWord(String str) {
			String ans = "";
			String str2 = "";
			int currentWordStart =0;
			int i = 0;
			for(;i<str.length();i++) {
				if(str.charAt(i)==' ') {
					//reverse current word
					int currentWordend = i-1;
					String reversedWord = "";
					for(int j =currentWordStart; j<=currentWordend;j++) {
						reversedWord = str.charAt(j) + reversedWord;
					}
					
					// add it final string(ans)
					ans +=reversedWord + " ";
					currentWordStart = i+1;
					
				}
				
				
				
			}
			
			int currentWordend = i-1;
			String reversedWord = "";
			for(int j =currentWordStart; j<=currentWordend;j++) {
				reversedWord = str.charAt(j) + reversedWord;
			}
			
			// add it final string(ans)
			ans +=reversedWord ;
			return ans;
		}
		
		public static void main(String[] args) {
			String str = "abc def ghi";
			System.out.println(reverseEachWord(str));
			
			
		}
}
