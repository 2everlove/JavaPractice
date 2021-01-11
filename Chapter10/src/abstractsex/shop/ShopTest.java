package abstractsex.shop;

public class ShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Headshop unishop = new Shop1();
		unishop.sellBiBimBap();
		unishop.sellDoenJangJjiGae();
		unishop.sellKimChiJjiGae();
		
		System.out.println();
		
		Headshop subshop = new Shop2();
		subshop.sellBiBimBap();
		subshop.sellDoenJangJjiGae();
		subshop.sellKimChiJjiGae();
	}

}
