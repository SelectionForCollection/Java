import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Step {
    public static int counter = 0;
    public Step(Stack<Integer> player1, Stack<Integer> player2){
        while(!player1.empty() & !player2.empty()) {

            if(player1.peek() == 9 & player2.peek() == 0){
                player1.push(player2.pop());
                Collections.reverse(player2);
                player2.push(player1.pop());
                player2.push(player1.pop());
                Collections.reverse(player2);
            }else if(player1.peek() == 0 & player2.peek() == 9){
                player2.push(player1.pop());
                Collections.reverse(player1);
                player1.push(player2.pop());
                player1.push(player2.pop());
                Collections.reverse(player1);
                Collections.reverse(player2);
            }else if (player1.peek() > player2.peek()) {
                player2.push(player1.pop());
                Collections.reverse(player1);
                player1.push(player2.pop());
                player1.push(player2.pop());
                Collections.reverse(player1);
            }else {
                player1.push(player2.pop());
                Collections.reverse(player2);
                player2.push(player1.pop());
                player2.push(player1.pop());
                Collections.reverse(player2);
            }

            counter++;
            if(counter > 106){
                System.out.println("botva");
                System.exit(0);
            }
        }
        if(player1.empty()){
            System.out.println("second " + counter);
        }else{
            System.out.println("first " + counter);
        }
    }

}

