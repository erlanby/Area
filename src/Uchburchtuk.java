public class Uchburchtuk {
     int a;
    int b;
    int c;

    void area(){
        double q = (a + b + c) / 2;
        double find = Math.sqrt(q * (q - a) * (q - b) * (q - c));
        System.out.println(find);
    }
}
