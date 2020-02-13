package Test;

public class balldown {
    public static void main(String[] args) {
        System.out.println(ball());
    }
    public static double ball(){
        double h = 100;
        for(int i = 0; i<10; i++){
            h = h/2;
        }
        return h;
    }
}
