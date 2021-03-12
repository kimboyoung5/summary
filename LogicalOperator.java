package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * - &&(AND), ||(OR), !(NOT)
		 * - 피연산자로 boolean만 허용한다.
		 * 
		 */
		int x = 10;
		int y = 20;
		boolean b = 0 < x && x <10 || x < y;
		
		b = !(x < y);
		
		//효율적 연산
		b = true && true; //true 
		b = true && false; //false
		b = false && true; //false
		b = false && false; //false
		
		b = true || true; //true
		b = true || false; //true
		b = false || true; //false
		b = false || false; //false
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다. 확인하지 않은 것은 노란줄로 표시되어있다.
		
		int a = 10;
		b = a < 5 && 0 < a++;
		System.out.println(a);
		//효율적 연산을 하다보니 의도한 것과 다른 결과를 얻을 수 있다. 
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고 x가  10보다 작다.
		b = x > y && x < 10;
		//2. x가 짝수이고 y보다 작거나 같다.
		b = x % 2 == 0 && x <= y;
		//3. x가 3의 배수이거나 5의 배수이다.
		b = x % 3 == 0 || x % 5 == 0;
		
	}

}
