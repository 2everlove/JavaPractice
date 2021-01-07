package overide.headshop;

public class Shop2 extends Headshop{
	
	public Shop2() {
		System.out.println("역세권 매장입니다.");
	}

	@Override //method 재정의 - 애너테이션(@)
	public void sellDoenJangJjiGae() {
		System.out.println("된장 찌게 : 6,000원");
	}

	@Override
	public void sellKimChiJjiGae() {
		System.out.println("김치 찌게 : 6,500원");
	}

	@Override
	public void sellBiBimBap() {
		System.out.println("비빔밥 : 7,000원");
	}
	
}
