/**
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

    MinStack() initializes the stack object.
    void push(int val) pushes the element val onto the stack.
    void pop() removes the element on the top of the stack.
    int top() gets the top element of the stack.
    int getMin() retrieves the minimum element in the stack.

 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2

**/


class MinStack 
{
   //instantiate the two stacks 
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() 
    {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) 
    {
        //push val into min stack if it's less than current val at peek of minstack
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);  
        }
        //push all values into main stack
        stack.push(val); 
    }
    
    public void pop() 
    {
        
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() 
    {
        return minStack.peek();
    }
    
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
