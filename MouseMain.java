
public class MouseMain {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		mouse.leftClick();
		mouse.rightClick();
		
		
		wheelMouse mouse2 = new wheelMouse();
		mouse2.leftClick();
		mouse2.rightClick();
		mouse2.scroll();
		
		//업캐스팅 -> 하위 클래스의 객체가 상위 클래스의 객체 타입으로 형변환 하는 것.
		Mouse mouse3 = mouse2;
		mouse3.rightClick();
		//오버라이딩 했으면 업캐스팅시 자식의 기능을 가져간다.
		mouse3.leftClick();
		
		
	}

}
