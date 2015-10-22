import java.util.*;
public class ShapeRunner
	{

		public static void main(String[] args)
			{
				
				EquilateralTriangle et = new EquilateralTriangle(5,8);
				System.out.print("This is the area of the Equilateral Triangle : ");
				System.out.printf("%1.2f", et.findArea());		
				System.out.println();
				System.out.print("This is the Perimeter of the Equilateral Triangle : ");
				System.out.printf("%1.2f", et.findPerimeter());		
				System.out.println();
				
				RightTriangle rt = new RightTriangle(5,10);
				System.out.print("This is the area of the Right triangle : ");
				System.out.printf("%1.2f", rt.findArea());
				System.out.println();
				System.out.print("This is the Perimeter of the Right triangle : ");  
				System.out.printf("%1.2f", rt.findPerimeter());	
				System.out.println();
				
				Rectangle rc = new Rectangle(3,15);
				System.out.print("This is the area of the Rectangle : ");
				System.out.printf("%1.2f", rc.findArea());
				System.out.println();
				System.out.print("This is the Perimeter of the Rectangle : ");  
				System.out.printf("%1.2f", rc.findPerimeter());	
				System.out.println();
				
				Trapezoid t = new Trapezoid(5, 10, 12, 6);
				System.out.print("This is the area of the Trapezoid : ");
				System.out.printf("%1.2f", t.findArea());
				System.out.println();
				System.out.print("This is the Perimeter of the Trapezoid : ");  
				System.out.printf("%1.2f", t.findPerimeter());	
				System.out.println();
				
				ArrayList <Shape> shapes = new ArrayList <Shape>();
				
				shapes.add(new EquilateralTriangle(3,9));
				shapes.add(new RightTriangle(2,10));
				shapes.add(new Rectangle(3,7));
				shapes.add(new Trapezoid(3,9,5,10));
				
				for (int i = 0; i < shapes.size(); i ++)
				{
					System.out.println(shapes.get(i));
				}
				
				
				
				
				

			}

	}
