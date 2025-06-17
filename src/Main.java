public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; // 0번일 경우 catch 예외처리 2번일 경우 트라이 처리

        try{
            int result = a/ b;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.toString());

            System.out.println("Error: Division by zero.");
        }
    }
}