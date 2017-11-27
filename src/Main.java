public class Main {
    public static void main(String[] args){
        try {
            String str = "3．14";
            Double value = Double.parseDouble(str);
        }catch(NullPointerException e){
            System.out.println("ぬるぽ");
            System.out.println(e.getMessage());
        }
    }
}
