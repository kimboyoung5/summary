package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 *  산술연산
		 *  - 사칙연산 : +, -, *, /, %(나머지)
		 *  - 복합연산자 : +=, -+, *=, /=, %=
		 *  - 증감연산자 : ++, --
		 *  
		 */

		int result = 10 + 20 - 30 * 40 / 50 % 60;
		
		//나머지 연산
		result = 10 / 3;
		System.out.println(result);
		result = 10 % 3;
		System.out.println(result);
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 출력해주세요.
		result = 1 + 2;
		System.out.println(result);
		result = 1 - 2;
		System.out.println(result);
		result = 1 * 2;
		System.out.println(result);
		result = 1 / 2;
		System.out.println(result);
		result = 1 % 2;
		System.out.println(result);
		
		//복합연산자
		result = result + 3;
		
		result += 3;
		
		result -= 5;
		
		result *= 2;
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result + 10;
		
		result += 10;
		
		//result =result % 5;
		
		result %= 5;
		
		//result = result - 2 * 3 ;
		
		result -= 2 * 3;
		
		//증감연산자
		//증가연산자(++) : 변수의 값을 1증가시킨다.
		//감소연산자(--) : 변수의 값을 1감소시킨다.
		
		int i = 0;
		++i; //전위형 : 변수의 값을 읽어오기 전에 1증가된다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1증가된다. 
		--i;
		i--;
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		
		int _int = 10;
		double _double = 3.14;
		double result2 = (double)_int + _double;
		System.out.println(result2);
		
		long _long = 100L;
		_long = _int + _long;
		_int = _int + (int)_long;
		
		
		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short; //int보다 작은 타입은 int로 형변환된다.
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2;
		System.out.println(_int);
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 떄 발생하는 현상
		byte b = 127;
		b++;
		System.out.println(b);
		
		b--;
		System.out.println(b);
		
		//00000000 -2^7 ~ 2^7 - 1
		//2^7 = 128
		//short: -2^15 ~ 2^15 - 1
		//int : -2^31 ~ 2^31 - 1
		//long : -2^63 ~ 2^63 - 1
		//char : 0 ~ 2^16
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값  * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		long kby = 123456 + 654321;
		kby *= 123456;
		kby /= 123456;
		kby -= 654321;
		kby %= 123456;
		System.out.println(kby);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 출력해주세요.
		int num1 = 15;
		int num2 = 34;
		int num3 = 49;
		int sum = num1 + num2 + num3;
		double avg = sum / 3.0; //둘 중 하나 double typed으로 입력 (3.0)
		System.out.println("sum : " + sum + " / avg : " + avg);  
		
		//반올림
		avg = Math.round(avg * 10) /10.0;
		System.out.println(avg);
		
		
		//랜덤
//		Math.random() : 0.0 ~ 1.0 미만 (0.99999...)
		int random = (int)(Math.random() * 100) + 1; //1부터 100사이의 랜덤한 값
		System.out.println(random);
		
		
		
		
		
		
		
	}

}
