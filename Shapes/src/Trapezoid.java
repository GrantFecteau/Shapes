
public class Trapezoid extends Quadrilateral
	{
		private double base1;
		private double base2;
		private double height;
		private double side;
		
		
		public Trapezoid(double b1, double b2, double h, double s)
		{
			base1 = b1;
			base2 = b2;
			height = h;
			side = s;
			
		}
		
		@Override
		public double findArea()
		{
			return ((base1+base2)/2)*height;
		}
		
		@Override
		public double findPerimeter()
		{
			
			return base1+base2+(side*2);
		}
		

	}
