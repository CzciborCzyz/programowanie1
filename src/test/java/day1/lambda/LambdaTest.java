package day1.lambda;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {
    List<String> list = new ArrayList<>();

    public LambdaTest() {
        list.add("Anna");
        list.add("Marta");
        list.add("Hanna");
        list.add("Ula");
        list.add("Ala");
    }

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();
        Consumer<String> cons = new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.print(s + "-");
            }
        };
        lambdaTest.list.forEach(x-> System.out.print(x+"-"));
    }
    private void method2(){
        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.list.forEach(System.out::println);
        Comparator<String> comparator =new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
    }
}

