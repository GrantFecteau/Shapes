
public class EquilateralTriangle extends Triangle
	{

		private double sideLength;
		
		public EquilateralTriangle(double b, double h, double s)
		{
			sideLength = s;
			
			base = b;
			
			height = h;
		}
		
		@Override
		public double findPerimeter()
		{
			return sideLength*3;
		}
		@Override
		public double findArea()
		{
			return Math.pow(sideLength, 2)/2;
		}


	}
