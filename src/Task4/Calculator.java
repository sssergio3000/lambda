package Task4;

public class Calculator {
    public static void main(String[] args) {
        CalcFunc plus = (x,y) -> x+y;
        CalcFunc minus = (x,y) -> x-y;
        CalcFunc mal = (x,y) -> x*y;
        CalcFunc div = (x,y) -> x/y;

        System.out.println(plus.calc(10,6));
        System.out.println(minus.calc(5,6));
        System.out.println(mal.calc(5,6));
        System.out.println(div.calc(10,6));

    }
}
interface CalcFunc{
    int calc(int a, int b);
}
