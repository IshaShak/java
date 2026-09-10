package strings;
class ByteArrayString {
    public static void main(String[] args) {
        byte[] b = {65, 66, 67};
        String str = new String(b);
        System.out.println(str);
    }
}