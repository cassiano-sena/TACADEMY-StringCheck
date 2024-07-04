public class Main {
    public static void main(String[] args) {
        StringCheck checker = new StringCheck();
        //se passar true, sera ultimo com primeiro
        //se passar false, sera ultimo com ultimo
        checker.characterCheck("programação", "ão",false);
        System.out.println("\n");
        checker.characterCheck("olá", "mundo",false);
        System.out.println("\n");
        checker.characterCheck("", "abc",false);
    }
}