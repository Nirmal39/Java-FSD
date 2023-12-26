
	class Ainner
	{
		
		public void display()
		{ 
			System.out.println("In Show");
		}
		
	}

	public class Anonymous{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Ainner obj=new Ainner()
			{
				public void show()
				{
					//Ananymous class
					System.out.println("In New Show");
				}
			};
			obj.display();
		}

}