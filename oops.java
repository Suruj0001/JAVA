class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write");
        System.out.println(this.color);
        System.out.println(this.type);
    }
    Pen(String color , String type){
        this.color = color;
        this.type = type;
    }
}
public class oops{
    public static void main(String args[]){
        Pen pen1 = new Pen("blue" , "gel");
        // pen1.color = "blue";
        // pen1.type = "gel";
        // pen1.write();
        // pen1.Printcolor();
        pen1.write();
    }
}