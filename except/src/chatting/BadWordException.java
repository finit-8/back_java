package chatting;

// Exception를 상속 받으면 컴파일러가 try ~ catch를 강제한다. 검사한다. 그래서 예외가 발견되면 강제종료 시켜버림  ==> 쓸 일 없다.

// RuntimeException: 컴파일러가 검사하지 않는다. 예외 발견되어도 강제종료 시키지 않는다.	==> 이거만 쓰면 됨
public class BadWordException extends RuntimeException{
	public BadWordException() {;}
	public BadWordException(String message) {
		super(message);
	}
}
