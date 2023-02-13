public class Main {
    public static void main(String[] args) {

        Developer backend = new Backend();
        Developer frontend = new Frontend();
        Developer devops = new Devops();

        Developer[] developers = {backend,frontend,devops};
        for (Developer a:developers) {
            a.coding();
        }
    }
}