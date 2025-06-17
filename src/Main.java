public class Main {
    public static void main(String[] args) {
        String input = "123a";

        try {
            int number = Integer.parseInt(input);

            System.out.println("당신이 입력한 숫자는 " + number + "입니다.");
        } catch(NumberFormatException e) {
            System.out.println("숫자 포맷이 아닙니다.");
        }

    }
}