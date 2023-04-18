public class DemoMain {
    public static void main(String[] args){
        if (args[0].equals("add")){
            int sum = 0;
            for (int i = 1; i < args.length; i++){
                sum += Integer.parseInt(args[i]);
            }
            System.out.println(sum);        
        }else if (args[0].equals("subtract")){
            int subtract = Integer.parseInt(args[1]);
            for (int i = 1; i < args.length-1; i++){
                subtract -= Integer.parseInt(args[i+1]);
            }
            System.out.println(subtract);
        }else if (args[0].equals("multiply")){
            int product = 1;
            for (int i = 1; i < args.length; i++){
                product *= Integer.parseInt(args[i]);
            }
            System.out.println(product);
        }else if (args[0].equals("divide")){
            int quotient = Integer.parseInt(args[1]);
            for (int i = 1; i < args.length-1; i++){
                quotient /= Integer.parseInt(args[i+1]);
            }
            System.out.println(quotient);
        }else {
            try{
                Integer.parseInt(args[0]);
                System.out.println("You have to specify the operator");
            }catch(NumberFormatException e){
                System.out.println("Operator not supported");
            }
        }
}
}
