package test2;

public class Ex4_test2 {

	public static void main(String[] args) {
		char alphas [] = {'J', 'a', 'v', 'a', 'B', 'a', 'c', 'k', 'E', 'n', 'd'};
		System.out.println(alphas);
		char results [] = new char[alphas.length] ;
	
		for(int i=0; i<alphas.length; i++) {
			results[i]=alphas[i];
			if(alphas[i] >= 'A' && alphas[i] <= 'Z') {
			char a=alphas[i];
		 	int aa = (int)a;
		 	int aaa= aa+32;
		 	char aaaa = (char)aaa;
		 	results[i]=aaaa; //results[i] =(char)((int)alphas[i]+32);
			}
		 	else if (alphas[i] >= 'a' && alphas[i] <= 'z') {
		 		char a=alphas[i];
			 	int aa = (int)a;
			 	int aaa= aa-32;
			 	char aaaa = (char)aaa;
			 	results[i]=aaaa; //results[i] =(char)((int)alphas[i]-32);
		 	}
		}
		System.out.println(results);
	}
}
/*		char a='Z';
		int aa = (int)a;
		System.out.println(aa);
		A-65 Z-90 a-97 z-122  대소문자 32차이*/
/* 4. 
알파벳 대문자는 소문자로, 소문자는 대문자로 변환 출력하기
단, alphas 배열의 요소는 반드시 갯수가 샘플 동일하지 않을 수 있고 results 배열은 alphas 배열의 갯수와 동일하다.
(int)'a' --> 97
(int)'A' --> 65
(int)'z' -->???
(int) 'Z' --> ??
char alphas [] = {'J', 'a', 'v', 'a',  'B', 'a', 'c', 'k', 'E', 'n', 'd'}; //한글, 숫자, 특수문자 없다
char results [] ;*/