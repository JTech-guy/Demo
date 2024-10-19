
public class Bicycle {

	public static void main(String[] args) {
		Bicycle Road = new Bicycle();
		Road.Speed = 56;
		Road.Color = "Black";
		System.out.println(Road.getColor());
		System.out.println(Road.getSpeed());
		
		class Vehicle {
		      public String Color;
		      public int Speed;
		      // getters and setters
		      public String getColor(){
		        return Color;
		      }
		
		}
	}
}


