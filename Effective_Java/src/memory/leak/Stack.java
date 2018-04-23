package memory.leak;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

	
	private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push("one");
		stack.push("two");
		
		System.out.println(stack.pop());
		System.out.println(stack.getClass());
	}

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        /*this makes the code not to retain memory once an object is removed from stack. 
         * if (size == 0)
            throw new EmptyStackException();
        return elements[--size];
        
        */
    	//below is the code to eliminate reference once an object reference is popped up from stack
    	 if (size == 0)
    	        throw new EmptyStackException();
    	    Object result = elements[--size];
    	    elements[size] = null; // Eliminate obsolete reference
    	    return result;
    }

    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

}
