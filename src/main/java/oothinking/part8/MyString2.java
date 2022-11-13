package oothinking.part8;

public class MyString2 {
    private char[] chars;

    public MyString2(char[] chars) {
        this.chars = chars;
    }

    public MyString2 substring(int begin){
        char[] newChars = new char[chars.length-begin+1];
        System.arraycopy(chars, begin-1, newChars, 0, chars.length-begin+1);
        return new MyString2(newChars);
    }

    public MyString2 toUpperCase() {
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length-1; i++) {
            char c = Character.toUpperCase(chars[i]);
            newChars[i] = c;
        }
        return new MyString2(newChars);
    }
    public char[] toChars() {
        char[] dst = new char[chars.length];
        System.arraycopy(chars, 0, dst, 0, chars.length);
        return dst;
    }
    public static MyString2 valueOf(boolean b){
        int x = b ? 1 : 0;
        return new MyString2(new char[]{(char)x});
    }
}
