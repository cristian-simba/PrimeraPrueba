public class Menu {
    public static void main(String[] args) {
        //Creación de las instancias de 5 diferentes videojuegos
        Videojuegos game1 = new Videojuegos("Super Mario Bros","Nintendo", "Plataformas", 2002, 1500000);
        Videojuegos game2 = new Videojuegos("The legend of Zelda", "Nintendo","Aventura",2023, 2000000);
        Videojuegos game3 = new Videojuegos("Call of Duty","Activision","Acción y Shotter", 2019, 1589032);
        Videojuegos game4 = new Videojuegos("Halo 5", "Microsoft", "Shotter FPS", 2022, 15978341);
        Videojuegos game5 = new Videojuegos("Fornite", "Epic Games", "Shotter", 2018, 159753152);

        // Impresión de los datos que tienen los videojuegos
        System.out.println("Primer Videojuego");
        game1.imprimirDatos();
        System.out.println("Segundo Videojuego");
        game2.imprimirDatos();
        System.out.println("Tercer Videojuego");
        game3.imprimirDatos();
        System.out.println("Cuarto Videojuego");
        game4.imprimirDatos();
        System.out.println("Quinto Videojuego");
        game5.imprimirDatos();

    }
}
