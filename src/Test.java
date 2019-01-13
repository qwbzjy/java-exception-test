/**
 * @author created by qwb on 2019/1/9 9:05
 */
public class Test {
    public static void main(String[] args) throws Exception{
//        String a = "";
//        if("".equals(a)){
////            throw new RuntimeException("---------");//抛出运行时异常时，程序终止，不再往下执行
////            throw new Exception("-----------");  //不能抛出授检查异常，编译报错。 如果抛出了checked异常，必须向上抛出异常，不然编译报错，但是程序不会往下执行。
//            throw new RuntimeException("==========");
//        }
//        System.out.println("==========");


        Test object = new Test();
//        try {
//            object.Test1(0);
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        //数组越界
        try {
            object.Test1(1);
        } catch (Exception e) {//catch是如何处理异常的
//            System.out.println("数组越界异常:" + e);//程序还会往下继续执行，如果上面抛出的时运行时异常，则程序不会往下执行。
//            return;
            new RuntimeException("0000000000");
        }
//        new RuntimeException("0000000000");
        System.out.println("-----------------");

        //算术异常
//        try {
//            object.Test1(2);
//        } catch (Exception e) {
//            System.out.println("算术异常：" + e);
//        }
//
//        try {
//            ArrayIndexOutOfBoundsException exception = new ArrayIndexOutOfBoundsException();
//            throw exception;
//        } catch (Exception e) {
//            System.out.println("throw抛出异常:" + e);
//        }


    }

    public void Test1(int x) throws ArrayIndexOutOfBoundsException, ArithmeticException {

        System.out.println(x);

        if (x == 0) {
            System.out.println("没有异常");
            return;
        } else if (x == 1) {
            int[] a = new int[3];
            a[3] = 5;
        } else if (x == 2) {
            int i = 0;
            int j = 5 / 0;
        }

    }
}
