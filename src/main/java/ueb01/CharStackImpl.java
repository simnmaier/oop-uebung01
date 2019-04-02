package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {

    private Elements top;

    public void push (char c){

        top = new Elements(c, top);
    }

    public char pop () {
        if (top == null)
            throw new NoSuchElementException("Der Stack ist leer");

        char v = top.value;
        top = top.next;
        return v;
    }

    public int size (){
        int counter = 0;
        Elements it = top;
        while (it != null){
            counter++;
            it=top.next;
        }
        return counter;
    }
}
