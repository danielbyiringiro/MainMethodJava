public class DemoMain {
    public static void main(String[] args){
        if (args[0].equals("add")){
            int sum = Integer.parseInt(args[1]) + Integer.parseInt(args[2]);
            System.out.println(sum);
        }else if (args[0].equals("subtract")){
            int difference = Integer.parseInt(args[1]) - Integer.parseInt(args[2]);
            System.out.println(difference);
        }else if (args[0].equals("multiply")){
            int product = Integer.parseInt(args[1]) * Integer.parseInt(args[2]);
            System.out.println(product);
        }else if (args[0].equals("divide")){
            int quotient = Integer.parseInt(args[1]) / Integer.parseInt(args[2]);
            System.out.println(quotient);
        }else{
            System.out.println("Not enough arguments provided.");
        }
}
}
