public class InterfaceEx {
    
    public interface Main1 {
        default void printLocal(){
            System.out.println("This is from Interface method ");
        }
        public void inform(); 
    }
    public static class Main2 implements Main1 {
         public void inform(){
            System.out.println("This is from Main2 class ");
         }
    }
    public static void main(String[] args) {
        Main2 Ob = new Main2();
        Ob.inform();
        Ob.printLocal();
    }
}

