public class ObjParam {
    int a, b;

    ObjParam(int i, int j) {
        a = i;
        b = j;
    }

    boolean isEqual(ObjParam o1) {
        if (o1.a == a && o1.b == b)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        ObjParam o1 = new ObjParam(50, 50);
        ObjParam o2 = new ObjParam(50, 50);
        ObjParam o3 = new ObjParam(70, 90);
        System.out.println(o1.isEqual(o2));
        System.out.println(o1.isEqual(o3));
    }
}
