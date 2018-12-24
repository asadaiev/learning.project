import java.util.LinkedHashMap;
import java.util.Map;

public class CountNumberOfLetters {
    public static final String input = "sdgfasghdfasqrrtyolaghtrwqmcs";

    public static void main(String[] args){
        Map<Character, Integer> out = new LinkedHashMap<>(input.length());

        for (char c: input.toCharArray()){
            if(out.containsKey(c)){
                out.put(c, out.get(c) + 1);
                continue;
            }
            out.put(c, 1);
        }

        for(Character character : out.keySet()){
            System.out.print(character + " = " + out.get(character) + " | ");
        }
    }
}
