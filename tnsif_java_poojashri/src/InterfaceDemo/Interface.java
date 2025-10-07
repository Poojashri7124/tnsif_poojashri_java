package InterfaceDemo;
interface Shape{
	 
	 //declaration
	void draw();
}

public class Interface implements Shape{
	public void draw() {
		System.out.println("Drawing a circle in an interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface id = new Interface();
		id.draw();
		

		
	}

}
