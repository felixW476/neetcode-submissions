class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num_stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || 
                token.equals("*") || token.equals("/")) {

                int b = num_stack.pop();
                int a = num_stack.pop(); // pop the two token when doing first operation

                switch (token) {
                    case "+": num_stack.push(a + b); break;
                    case "-": num_stack.push(a - b); break;
                    case "*": num_stack.push(a * b); break;
                    case "/": num_stack.push(a / b); break;
                }

            } else {
                num_stack.push(Integer.parseInt(token));
            }
        }
        return num_stack.peek();
    }
}
