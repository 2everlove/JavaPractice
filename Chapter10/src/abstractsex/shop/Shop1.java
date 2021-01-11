package abstractsex.shop;

public class Shop1 extends Headshop{
	
	public Shop1() {
		System.out.println("대학가 매장입니다.");
	}

	@Override //method 재정의 - 애너테이션(@)
	public void sellDoenJangJjiGae() {
		System.out.println("된장 찌게 : 5,000원");
	}

	@Override
	public void sellKimChiJjiGae() {
		System.out.println("김치 찌게 : 5,500원");
	}

	@Override
	public void sellBiBimBap() {
		System.out.println("비빔밥 : 6,000원");
	}
	
}
