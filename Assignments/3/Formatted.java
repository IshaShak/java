package strings;
class FormattedString {
    public static void main(String[] args) {
        String name = "Sufiyy";

        String str = String.format("Hello %s", name);

        System.out.println(str);
    }
}