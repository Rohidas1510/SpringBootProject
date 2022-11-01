package rohidas3;

		// TODO Auto-generated method stub
		interface Drawable{
			void draw();
			public static int cube(int x) {return x*x*x;}
		}
		class Rectangle implements Drawable{
			public void draw()
			{
				System.out.println("Drawing rectangle :");
			}
		}
		public class hello {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Rectangle ob=new Rectangle();
		ob.draw();
		System.out.println(Drawable.cube(5));
			}

		}


