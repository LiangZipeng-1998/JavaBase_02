package 自动类型转换;

public class AutoConvert01 {
    public static void main(String[] args) {
        //演示自动转换
        int num = 'a'; //ok char -> int
        double d1 = 80;//ok int -> double
        System.out.println(num);//97
        System.out.println(d1); //80.0
    }
}
