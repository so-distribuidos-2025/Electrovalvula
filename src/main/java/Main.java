public class Main {

    public static void main(String[] args) {

        Electrovalvula ev = new Electrovalvula();

        System.out.println(ev.toString());

        ev.abrir();

        System.out.printf(ev.toString());

    }
}
