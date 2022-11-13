package oothinking.part8;

import java.util.Arrays;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }
    public char charAt(int index){
        return chars[index-1];
    }
    public int length(){
       return this.chars.length;
    }

    public MyString1 substring(int begin, int end){
        char[] newChars = new char[end-begin+1];
        System.arraycopy(chars, begin-1, newChars, 0, end-begin+1);
        return new MyString1(newChars);
    }

    public MyString1 toLowerCase(){
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length-1; i++) {
            char c = Character.toLowerCase(chars[i]);
            newChars[i] = c;
        }
        return new MyString1(newChars);
    }
    public static MyString1 valueOf(int i){
        return new MyString1(new char[]{(char)i});
    }

    public char[] toChars() {
        char[] dst = new char[chars.length];
        System.arraycopy(chars, 0, dst, 0, chars.length);
        return dst;
    }

    public boolean equals(MyString1 obj) {
        return Arrays.equals(chars, obj.chars);
    }

    @Override
    public String toString() {
        return "MyString1{" +
                "chars=" + Arrays.toString(chars) +
                '}';
    }
}
