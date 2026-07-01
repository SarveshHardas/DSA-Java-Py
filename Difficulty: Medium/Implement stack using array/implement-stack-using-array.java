class myStack {
    int[] arr;
    int size;
    int top;
    
    public myStack(int n) {
        // Define Data Structures
        arr = new int[n];
        size = n;
        top = -1;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return top == -1;
    }

    public boolean isFull() {
        // check if the stack is full
        return top == size - 1;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(isFull()){
            // System.out.println("Stack overflow.");
            return;
        }
        arr[++top] = x;
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(isEmpty()){
            // System.out.println("Stack underflow.");
            return ;
        }
        top--;
    }

    public int peek() {
        // Returns the top element of the stack
        if(isEmpty()){
            // System.out.println("Stack underflow.");
            return -1;
        }
        return arr[top];
    }
}