public class Main {
    public static void main(String[] args){
    String str = null;
    try {
        str.length(); //処理したいコード
    } catch (NullPointerException e) {
        System.out.println("NullPointerExceptionが発生しました");//Exceptionが起きたときの処理
        System.out.println("Exception message: " + e.getMessage());
    } 
    }
}