package programmer1.chapter6;

import java.util.List;

public class LambdaVariableDeclaration {
    public void remove(List<Character> chars) {
        char end = 'z';
//        char c = '1';
        chars = null;
//        char start = '1';
        chars.removeIf(c -> {
            char start = 'a';
            return start <= c && c <= end;
        });
//        end = '1';
    }
}
