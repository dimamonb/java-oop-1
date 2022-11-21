package inhetitance;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object result = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return result;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    /** Переопределяет метод toString класса Object */
    public String toString() {
        return "стек: " + list.toString();
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(11);

        System.out.println(myStack);
    }

}
