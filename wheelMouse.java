
public class wheelMouse extends Mouse {
	
	
	int a =123;
	
	public void a() {
		System.out.println(a);
	}
	
	public void scroll() {
		System.out.println("스크로오오오올");
	}
	@Override
	public void leftClick() {
		System.out.println("왼쪽클릭");
		System.out.println("드래그");
	}
	
}
