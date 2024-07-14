package overriding.variable;

public class MainClass {
    public static void main(String[] args) {
        VParent vp = new VChild();
        System.out.println(vp.a);
        System.out.println(vp.b);
        System.out.println(vp.c);
        System.out.println(vp.e);
        System.out.println(vp.f);
    }
}
