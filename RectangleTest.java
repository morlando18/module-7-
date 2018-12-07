
//9.1
public class RectangleTest {
	public static void main(String[] args){
		//Rectangle r1 = new Rectangle();
		//making objects of class rectangle
		Rectangle rectangle1 = new Rectangle(4,40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		// printing
		System.out.println("Rectangle with width = "+ rectangle1.width + " and height = " + rectangle1.height +
							" has an area = " + rectangle1.getArea(rectangle1.width,rectangle1.height) + 
							" and a perimeter = " + rectangle1.getPerimeter(rectangle1.width,rectangle1.height));
		System.out.println("Rectangle with width = "+ rectangle2.width + " and height = " + rectangle2.height +
							" has an area = " + rectangle2.getArea(rectangle2.width, rectangle2.height) + 
							" and a perimeter = " + rectangle2.getPerimeter(rectangle2.width, rectangle2.height ));
	}
	
}

class Rectangle {
	
	double width;
	double height;
	
	public Rectangle(){
		width = 1;
		height = 1;
	}
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	public double getArea(double width, double height){
		return width * height;
	}
	public double getPerimeter(double width, double height){
		return (width + height) * 2;
	}
}
