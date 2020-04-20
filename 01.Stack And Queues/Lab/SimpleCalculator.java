import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> calculator = new ArrayDeque<>();
        String exp = scanner.nextLine();

        String [] els = exp.split("\\s+");
        for (int i = els.length-1; i>=0; i--) {
                calculator.push(els[i]);
        }

        while (calculator.size()>1){
            Integer firstNum =  Integer.parseInt(calculator.pop());
            String op = calculator.pop();
            Integer secondNum = Integer.parseInt(calculator.pop());

            if ("+".equalsIgnoreCase(op)){
                calculator.push (firstNum+secondNum + "");
            }
            else {
               calculator.push(firstNum-secondNum + "");
            }
        }
        System.out.println(calculator.peek());

    }
}
