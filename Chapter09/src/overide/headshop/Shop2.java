package overide.headshop;

public class Shop2 extends Headshop{
	
	public Shop2() {
		System.out.println("������ �����Դϴ�.");
	}

	@Override //method ������ - �ֳ����̼�(@)
	public void sellDoenJangJjiGae() {
		System.out.println("���� ��� : 6,000��");
	}

	@Override
	public void sellKimChiJjiGae() {
		System.out.println("��ġ ��� : 6,500��");
	}

	@Override
	public void sellBiBimBap() {
		System.out.println("����� : 7,000��");
	}
	
}
