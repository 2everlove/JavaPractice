package overide.headshop;

public class ShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("본점입니다.");
		Headshop shopm = new Headshop();
		shopm.sellBiBimBap();
		shopm.sellDoenJangJjiGae();
		shopm.sellKimChiJjiGae();
		
		System.out.println("=================");
		
		Headshop shop1 = new Shop1();
		shop1.sellBiBimBap();
		shop1.sellDoenJangJjiGae();
		shop1.sellKimChiJjiGae();
		
		System.out.println("=================");
		
		Shop1 shop = new Shop1();
		shop.sellBiBimBap();
		shop.sellDoenJangJjiGae();
		shop.sellKimChiJjiGae();
		
		System.out.println("=================");
		
		Headshop shop2 = new Shop2();
		shop2.sellBiBimBap();
		shop2.sellDoenJangJjiGae();
		shop2.sellKimChiJjiGae();
	}

}
