
public abstract class Shape
	{

		protected int area;
		
		protected int perimeter;
		
		public abstract double findArea();
		
		public abstract double findPerimeter();

		@Override
		
		public String toString()
			{
				return "Shape [area=" + findArea() + ", perimeter=" + findPerimeter() + "]";
			}
	}
