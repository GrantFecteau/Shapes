
public class RightTriangle extends Triangle
	{
		
		
		
		public RightTriangle (double b, double h)
		{
			base = b;
			
			height = h;
			
		}
		
		
		public double getHypotenuse(double b1, double h1)
		{
			return Math.sqrt(Math.pow(b1, 2)+Math.pow(h1, 2));			
		}
		@Override
		public double findPerimeter()
		{
			return getHypotenuse(base,height) + base + height;
		}
		
		@Override
		public double findArea()
		{
			return base*height/2;
		}
		
		
		
		
	}
