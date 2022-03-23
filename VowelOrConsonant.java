import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Character:");
		char ch= sc.next().charAt(0);
		if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			System.out.print("Enter character is vowel");
		else if (ch>='a'&& ch<='z' || ch>='A'&& ch<='Z')
			System.out.print("Enter character is consonant");
		else
			System.out.print("An error message");
	}

}
