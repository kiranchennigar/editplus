class Addition {
    void add(int a) {
        int b = 30;
        int c = a + b;
        System.out.println(c);
    }
}

public class Demo {
    public static void main(String[] args) {
        Addition a = new Addition();
        int x = 40;
        a.add(x);    
    }
}
