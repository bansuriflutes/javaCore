package now.homework.hw1;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Alex","Makarov","23.04.1978",
                new Application(23,14, Type.PURCHASE),
                new Passport("MO", 456789, "Kherson city"));

        System.out.println(client);

}
}
