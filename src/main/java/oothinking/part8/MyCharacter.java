package oothinking.part8;

public class MyCharacter {
    private char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public char charValue(){
        return value;
    }
    public int compareTo(MyCharacter anotherCharacter){
        if(this.value > anotherCharacter.value){
            return 1;
        } else if(this.value < anotherCharacter.value){
            return -1;
        }
        return 0;
    }
    public boolean equals(MyCharacter anotherCharacter){
        return this.value == anotherCharacter.value;
    }
    public boolean isDigit() {
        if (this.value >= 48 && this.value <= 57){
            return true;
        }
        return false;
    }
    public static boolean isDigit(char ch) {
        return ch >= 48 && ch <= 57;
    }
    public static boolean isLetter(char ch) {
        return (ch >= 65 && ch <= 90)
                || (ch >= 97 && ch <= 122);
    }
    public static boolean isLetterOrDigit(char ch) {
        if (ch >= 48 && ch <= 57){
            return true;
        } else return (ch >= 65 && ch <= 90)
                || (ch >= 97 && ch <= 122);
    }
    public static boolean isLowerCase(char ch) {
        return (ch >= 97 && ch <= 122);
    }

    public static boolean isUpperCase(char ch) {
        return (ch >= 65 && ch <= 90);
    }
    public static char toUpperCase(char ch) {
        if(isDigit(ch)){
            return ch;
        } else return (char) (ch & 0x5f);
    }
    public static char toLowerCase(char ch) {
        if(isDigit(ch)){
            return ch;
        } else return (char) (ch ^ 0x20);
    }
}
