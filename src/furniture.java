abstract class furniture {
    abstract void somth();
}
class chair extends furniture {
    void somth() {
        System.out.println("yay");
    }
    private int x;
}
class table extends chair {

    void somth() {
        System.out.println("tt");
    }
    private int x;

}
class myProg {
    public static void main(String[] args) {
        furniture f = new chair();
        table d = new table();
        //d.x = 8;
        //System.out.println(d.x);
    }
}
