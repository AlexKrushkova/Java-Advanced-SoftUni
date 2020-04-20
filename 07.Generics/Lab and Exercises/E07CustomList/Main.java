package E07CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        String input = scanner.nextLine();

        while(!input.equalsIgnoreCase("END")){
            String[] tokens = input.split("\\s+");
            switch (tokens[0]){
                case"Add":
                    list.add(tokens[1]);
                    break;
                case"Remove":
                    list.remove(Integer.parseInt(tokens[1]));
                    break;
                case"Contains":
                    System.out.println(list.contains(tokens[1]));
                    break;
                case"Swap":
                    list.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case"Greater":
                    System.out.println( list.counterGreaterThan(tokens[1]));
                    break;
                case"Max":
                    list.getMax();
                    System.out.println(list.getMax());
                    break;
                case"Min":
                    System.out.println(list.getMin());
                    break;
                case"Sort":
                    list.sort();
                    break;
                case"Print":
                    list.print();
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
