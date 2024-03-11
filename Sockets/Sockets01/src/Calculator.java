public class Calculator {
    public static String calc(String x) {
        String[] args= x.split(",");
        if(args.length>3){
            throw new IllegalArgumentException("Illegal argument");
        }
        Double n1 = Double.valueOf(args[1]);
        Double n2 = Double.valueOf(args[2]);
        String response;
        switch (args[0]){
            case"add":
                return response = String.valueOf(n1+n2);
            case"sub":
                return response = String.valueOf(n1-n2);
            case"mult":
                return response = String.valueOf(n1*n2);
            case"div":
                return response = String.valueOf(n1/n2);
            default:
                throw new IllegalArgumentException("Illegal operation");
        }

    }
}
