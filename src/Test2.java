/**
 * @author created by qwb on 2019/1/9 16:13
 */
public class Test2 {
    public static void main(String[] args) {
        Test2 object = new Test2();
        object.test2();
        //当发生运行时异常，希望程序停止，由程序员对代码进行修改。
    }

    public void test2(){
        try{
            test1();//捕获异常
        }catch (CustomException e){//处理异常
            RuntimeException exception = new RuntimeException(e);
            throw exception;
        }
    }

    public void test1()throws CustomException{
        throw new CustomException("巴巴快巴");
    }
}
