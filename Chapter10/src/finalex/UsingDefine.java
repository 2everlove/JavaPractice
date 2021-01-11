package finalex;

public class UsingDefine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Define.GOOD_MORNING); //static이 붙은 상수라 new없이 바로 출력가능
		System.out.println("최소값은 "+Define.MIN+"입니다.");
		System.out.println("최대값은 "+Define.MAX+"입니다.");
		System.out.println("PI값은 "+Define.PI+"입니다.");
		System.out.println("수학과목 코드값은 "+Define.MATH+"입니다.");
		System.out.println("영어과목 코드값은 "+Define.ENG+"입니다.");
		
	}

}
