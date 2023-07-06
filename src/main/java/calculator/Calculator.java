package calculator;

public class Calculator {
    public static int sum(String input) {
        if (isEmpty(input)) {
            return 0;
        }

        Text text = Text.from(input);
        Numbers numbers = Numbers.of(text.getNames());

//        Numbers numbers = Numbers.of(Parser.parse(text));

        return numbers.sumAll();
    }

    private static boolean isEmpty(String text) {
        return text == null || text.isEmpty();
    }
}
