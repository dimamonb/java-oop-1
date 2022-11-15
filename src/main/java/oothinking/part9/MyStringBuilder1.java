package oothinking.part9;

public class MyStringBuilder1 {

    private int capacity;
    private char[] stringrepr;

    public MyStringBuilder1(char[] chars) {
        this.capacity = chars.length;
        this.stringrepr = new char[capacity];
        System.arraycopy(chars, 0, stringrepr, 0, capacity);
    }

    public MyStringBuilder1(String s) {
        capacity = s.length();
        stringrepr = new char[capacity];
        for (int i = 0; i < capacity; i++) {
            stringrepr[i] = s.charAt(i);
        }
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        char[] tmp = new char[capacity + s.length()+1];
        System.arraycopy(stringrepr, 0, tmp, 0, capacity);
        for (int i = 0; i < s.length(); i++) {
            tmp[i + capacity] = s.charAt(i);
        }
        capacity += s.length();
        stringrepr=tmp;
        return this;
    }

    public MyStringBuilder1 append(int i) {
        if(stringrepr.length < capacity) {
            capacity++;
            stringrepr[capacity-1] = (char) i;
        }
        return this;
    }

    public int length() {

        return capacity;
    }

    public char charAt(int index) {
        return stringrepr[index];
    }

    public MyStringBuilder1 toLowerCase() {
        char[] tmp = new char[capacity];
        for (int i = 0; i < capacity; i++) {
            if (isDigit(stringrepr[i])) {
                tmp[i] = stringrepr[i];
            } else {
                tmp[i] = (char) (stringrepr[i] | 0x20);
            }
        }
        stringrepr = tmp;
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        char[] tmp = new char[end-begin+1];
        System.arraycopy(stringrepr, begin, tmp, 0, end-begin+1);
        stringrepr = tmp;
        return this;
    }

    public boolean isDigit(char c) {
        if (c >= 48 && c <= 57) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(stringrepr);
    }
}
