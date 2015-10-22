
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
				
				Rectangle rc = new Rectangle(5,10);
				System.out.print("This is the area of the Right triangle : ");
				System.out.printf("%1.2f", rc.findArea());
				System.out.println();
				System.out.print("This is the Perimeter of the Right triangle : ");  
				System.out.printf("%1.2f", rc.findPerimeter());	
				System.out.println();
				
				Trapezoid t = new Trapezoid(5,10, 12, 6);
				System.out.print("This is the area of the Right triangle : ");
				System.out.printf("%1.2f", t.findArea());
				System.out.println();
				System.out.print("This is the Perimeter of the Right triangle : ");  
				System.out.printf("%1.2f", t.findPerimeter());	
				System.out.println();
				
				
				
				

			}

	}
