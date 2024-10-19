public class ClassObjects {
    // object - entity / instance of the class
    public static void main (String[] args) {
        Vehicle Car = new Vehicle();
        Car.Speed = 200;
        Car.Color = "White";
        System.out.println(Car.getColor());
        System.out.println(Car.getSpeed());
        Car.Start();
        Car.Stop();
    }
}
class Vehicle {
    // 1. Variables - data members
    // 2. Methods - member functions
      public String Color;
      public int Speed;
      // getters and setters
      public String getColor(){
        return Color;
      }
public int getSpeed(){
    return Speed;
    }
    public void setColor(String Color) {
        this.Color = Color;
        }
    public void setSpeed(int Speed) {
            this.Speed = Speed;       
             }
    public void Start() {
        System.out.println("I am in motion");   
         }
         public void Stop() {
            System.out.println("I have stopped");
         }
};