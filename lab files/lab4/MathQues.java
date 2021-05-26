interface MyMath {
    public int addition(int x, int y);
}

class Math implements MyMath {
    public int addition(int x, int y) {
        int z = x + y;
        return z;
    }
}

class AdvancedMath extends Math {
    void myAdd(int x, int y) {
        System.out.println(super.addition(x, y));
    }
}

class MathQues {
    public static void main(String[] args) {
        AdvancedMath a1 = new AdvancedMath();
        a1.myAdd(5, 6);
    }
}