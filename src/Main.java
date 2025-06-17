public class Main {
    public static void main(String[] args) {
        String input = "3*4";

        try {
            int result = multiply(input);
            System.out.println("결과: " + result);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int multiply(String input) throws NumberFormatException {
        String[] tokens = input.split("\\*");

        if (tokens.length != 2) {
            throw new NumberFormatException("입력은 숫자 2개여야 합니다.");
        }

        int a = Integer.parseInt(tokens[0].trim());
        int b = Integer.parseInt(tokens[1].trim());

        return a * b;
    }
}
