import java.util.Stack;


class StockSpanner {

    Stack<int []> stack;


    public StockSpanner() {
        stack=new Stack<>();


    }

    public int next(int price) {
        int span=1;

        while(!stack.isEmpty() && stack.peek()[0]<price)
        {
            span=span+stack.peek()[1];
            stack.pop();


        }
        stack.push(new int[]{price,span});
        return span;



    }
}
//Input
//["StockSpanner", "next", "next", "next", "next", "next", "next", "next"]
//        [[], [100], [80], [60], [70], [60], [75], [85]]
//Output
//[null, 1, 1, 1, 2, 1, 4, 6]

