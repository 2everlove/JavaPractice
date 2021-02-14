package lambda.functionalinterface;

@FunctionalInterface //error를 막기 위해서 람다식 형태를 쓸 경우 먼저 정의 해줌
public interface MyFunctionalInterface {
	public void method(); //매개 변수 없는 추상 메서드
//	public void method2(); //람다식에서는 추상 메서드가 한개만 적용되므로 사용불가
}
