
public class MouseMain {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		mouse.leftClick();
		mouse.rightClick();
		
		
		wheelMouse mouse2 = new wheelMouse();
		mouse2.leftClick();
		mouse2.rightClick();
		mouse2.scroll();
		
		//��ĳ���� -> ���� Ŭ������ ��ü�� ���� Ŭ������ ��ü Ÿ������ ����ȯ �ϴ� ��.
		Mouse mouse3 = mouse2;
		mouse3.rightClick();
		//�������̵� ������ ��ĳ���ý� �ڽ��� ����� ��������.
		mouse3.leftClick();
		
		
	}

}
