public class Try {
    void action(int x) {
        System.out.println("number 1");
    }
}
class second extends Try {
    void action(int x) {
         x = 5;
        System.out.println(x);
    }

    public static void main(String[] args) {
        e\
        Try ob1 = new Try();
        ob1.action(4);
        second ob2 = new second();
        ob2.action(2);
        Try ob3 = new second();
        ob3.action(5);

    }
}
public class Garbagec{

}