package datastructures.usingArray;

public class Stack {
/*
    All Implemented Interfaces:

    Serializable: It is a marker interface that classes must implement if they are to be serialized and deserialized.
            Cloneable: This is an interface in Java which needs to be implemented by a class to allow its objects to be cloned.
    Iterable<E>: This interface represents a collection of objects which is iterable — meaning which can be iterated.
            Collection<E>: A Collection represents a group of objects known as its elements. The Collection interface is used to pass around collections of objects where maximum generality is desired.
    List<E>: The List interface provides a way to store the ordered collection. It is a child interface of Collection.
    RandomAccess: This is a marker interface used by List implementations to indicate that they support fast (generally constant time) random access.

    Supported Actions

    Push
    Pull
    Search
    Peek

*/

    private int[] arr;
    private int top;
    private int capacity;


    public Stack (int size){
        arr = new int[size];
        capacity= size;
        top=-1;
    }


    public void push(int num){
        if(isFull()){
            throw new Error("Capacity full");
        }
        arr[++top]=num;
    }

    public int pop(){
        if(isEmpty()){
            throw new Error("Stack is empty");
        }
        return arr[top--];
    }

    public int peek(){
        if(isEmpty()){
            throw new Error("Stack is empty");
        }
        return arr[top];
    }

    public int search(int num){
        if(isEmpty()){
            throw new Error("Stack is empty");
        }

        for(int i=0;i<top;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    public boolean isFull(){
        return capacity<top+1;
    }

    public boolean isEmpty(){
        return top==-1;
    }
    public int size() {
        return top + 1;
    }


}
