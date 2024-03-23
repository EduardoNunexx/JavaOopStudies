public class Calculator {
    public static String calc(String[] args) {
        if(args.length>3){
            throw new IllegalArgumentException("Illegal argument");
        }
        Double n1 = Double.valueOf(args[1]);
        Double n2 = Double.valueOf(args[2]);
        String response;
        return switch (args[0]) {
            case "add" -> response = String.valueOf(n1 + n2);
            case "sub" -> response = String.valueOf(n1 - n2);
            case "mult" -> response = String.valueOf(n1 * n2);
            case "div" -> response = String.valueOf(n1 / n2);
            default -> throw new IllegalArgumentException("Illegal operation");
        };

    }
}
