
public class Trapezoid extends Quadrilateral
	{
		private double base1;
		private double base2;
		private double side;
		private double height;
		
		public Trapezoid(double b1, double b2, double s, double h)
		{
			base1 = b1;
			base2 = b2;
			side = s;
			height = h;
		}
		
		@Override
		public double findArea()
		{
			return (base1+base2/2)+height;
		}
		
		@Override
		public double findPerimeter()
		{
			//notfinised
			return (base1+base2/2)+height;
		}
		

	}
