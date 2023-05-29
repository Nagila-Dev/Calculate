public class Calculate {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);

        if (args[0].equals("somar")){
            sum(x,y);
        } else if(args[0].equals("subtrair")){
            minus(x,y);
        } else if(args[0].equals("mult")){
            multiply(x,y);
        } else if(args[0].equals("dividir")){
            todivide(x,y);
        } else {
            System.out.println("Defina uma instrucao correta, por favor!");
        }

    }
    static void sum(double x, double y){
        System.out.println(x + y);
    }

    static void minus(double x, double y){
        System.out.println(x - y);
    }

    static void multiply(double x, double y){
        System.out.println(x * y);
    }

    static void todivide(double x, double y){
        System.out.println(x / y);
    }
}