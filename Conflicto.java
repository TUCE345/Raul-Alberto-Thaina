public class Conflicto {

    static void metodoRaul() {

        System.out.println("Hola desde el método de Raul.");
    }
        

    static void metodoAlberto() {
        System.out.println("Hola desde metodoAlberto");
    }

    public static void main(String[] args) {
        metodoAlberto();
        metodoRaul();
    }
}