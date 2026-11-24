class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> opStack = new Stack<>();
        

        for(String tok : tokens ){

            if (tok.equals("+") || tok.equals("-") || tok.equals("*")||
            tok.equals("/")){

                int b = opStack.pop();
                int a = opStack.pop();

                switch(tok){

                    case "+":
                    opStack.push(a+b);
                    break;
                    case "-":
                    opStack.push(a-b);
                    break;
                    case "/":
                    opStack.push(a/b);
                    break;
                    case "*":
                    opStack.push(a*b);
                    break;
                }

            }

            else {
                opStack.push(Integer.parseInt(tok));
            }
        }


        return opStack.pop();
    }
}
