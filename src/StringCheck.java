//8) Crie um código em Java capaz de verificar se os dois últimos caracteres de uma string são iguais aos dois primeiros de outra string.
//Encaminhar link github.
public class StringCheck {
    public void characterCheck(String firstString, String secondString, boolean firstOrLast) {
        if (firstString == null || secondString == null || firstString.length() < 2 || secondString.length() < 2) {
            System.out.println("One of the words is smaller than two characters or is null.");
            return;
        }
        String char1;
        String char2;
        if (firstOrLast) {
            char1 = firstString.substring(firstString.length() - 1);
            char2 = secondString.substring(0, 1);
        } else {
            char1 = firstString.substring(firstString.length() - 2);
            char2 = secondString.substring(secondString.length() - 2);
        }
        System.out.println("First string: " + firstString + ", Second string: " + secondString + ", Equal?");
        if (char1.equals(char2)) {
            System.out.println("Equal.");
        } else {
            System.out.println("Not equal.");
        }
    }
}