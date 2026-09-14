import java.util.Stack;

class MinStack {

    private Stack<Long> s;
    private long min;

    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int val) {
        long value = val;
        
        if (s.isEmpty()) {
            s.push(value);
            min = value;
        } else if (value < min) {
            // Store encoded value (always < value) and update min
            s.push(2 * value - min);
            min = value;
        } else {
            // Store unencoded value when it's >= current min
            s.push(value);
        }
    }
    
    public void pop() {
        if (s.isEmpty()) return;

        long x = s.pop();
        
        // Only restore previous min if x was an encoded value
        if (x < min) {
            min = 2 * min - x;
        }
    }
    
    public int top() {
        long topElement = s.peek();
        
        // If topElement < min, the actual pushed value is the current min
        if (topElement < min) {
            return (int) min;
        }
        return (int) topElement;
    }
    
    public int getMin() {
        return (int) min;
    }
}