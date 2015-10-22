
public class EquilateralTriangle extends Triangle
	{

		
		public EquilateralTriangle(double b, double h)
		{
			
			base = b;
			
			height = h;
		}
		
		@Override
		public double findPerimeter()
		{
			return base*3;
		}
		@Override
		public double findArea()
		{
			return base * height/2;
		}


	}
