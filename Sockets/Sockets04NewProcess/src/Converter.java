public class Converter {
    public static String brlConvert(String[] args){

        return switch (args[0]) {
            case "USD" -> String.valueOf(Integer.parseInt(args[1]) * 4.97);
            case "GBP" -> String.valueOf(Integer.parseInt(args[1])* 6.35);
            case "EUR" -> String.valueOf(Integer.parseInt(args[1]) * 5.43);
            default -> {
                throw new IllegalArgumentException("Unknown currency");
            }
        };
    }
}
