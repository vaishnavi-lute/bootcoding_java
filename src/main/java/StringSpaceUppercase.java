public class StringSpaceUppercase {
    public static void main(String[] args) {
        String input = "java"; // J A V A
        char[] chars2 = input.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            System.out.print((chars2[i] + " ").toUpperCase());
        }
    }
}