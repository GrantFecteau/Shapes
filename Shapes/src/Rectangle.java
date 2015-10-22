
public class Rectangle extends Quadrilateral
	{

		private double length;
		
		private double width;
		
		public Rectangle (double w, double l)
		{
			length = l;
			
			width = w;
		}
		
		public double findArea()
		{
			return length * width;
		}
		
		public double findPerimeter()
		{
			return ((length*2) + (width*2));
		}
		
	}
