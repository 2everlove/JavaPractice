package abstractsex.shop;

public class Shop1 extends Headshop{
	
	public Shop1() {
		System.out.println("���а� �����Դϴ�.");
	}

	@Override //method ������ - �ֳ����̼�(@)
	public void sellDoenJangJjiGae() {
		System.out.println("���� ��� : 5,000��");
	}

	@Override
	public void sellKimChiJjiGae() {
		System.out.println("��ġ ��� : 5,500��");
	}

	@Override
	public void sellBiBimBap() {
		System.out.println("����� : 6,000��");
	}
	
}
