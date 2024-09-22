public class App2 {
    public static void main(String[] args) {
       Box box1 = new Box(3.5f, 4.0f, 5.0f, 'M', 12.5);
        Box box2 = new Box(3.5f, 4.0f, 5.0f, 'P', 8.0);
        Box box3 = new Box(0f, 4.0f, 0f, 'X', -1.0);
        System.out.println(box1.calculateVolume());
        

        Rec rec1= box1.toRec();
        System.out.println(rec1.calculateArea());
        System.out.println(rec1.getColorCode());
      
    }
    
}
