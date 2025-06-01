import enums.Condition;

public class Main {

    public static void main(String[] args) {
        // Intanciamos: creamos un objeo de tipo game
        StreamingGame eldenRing = new StreamingGame("Elden Ring", "All", 0, "http");
        //System.out.println("eldenRing.title = " + eldenRing.getTitle());

        eldenRing.setReleaseYear(2022);
        //System.out.println("eldenRing release year = " + eldenRing.getReleaseYear());
        System.out.println(eldenRing);

        // Creemos otros juegos
        DigitalDownload dokiDoki = new DigitalDownload("Doki Doki", "XBOX", 2021, 1);
        DigitalDownload theLastOfUs = new DigitalDownload("The last of us","PS4", 2016, 2 );
        DigitalDownload cookingMama2 = new DigitalDownload("Cocking Mama 2", "NSwitch", 2025, 3);

        PhysicalCopy marioKart = new PhysicalCopy("Mario Kart", "NSwitch", 2023, Condition.NUEVO);

        VRGame beatSaber = new VRGame("Beat Saber", "PSVR", 2020, true);

        Gamer eduardo = new Gamer("Eduardo Calles");

        //Asignemos unos juegos a eduardo
        eduardo.borrow(eldenRing);
        eduardo.borrow(dokiDoki);
        eduardo.borrow(beatSaber);

        //Veamos los juegos prestados de eduardo
        System.out.printf("El jugador: %s ha prestado:\n%s",
                eduardo.getName(), eduardo.borrowedGames() );

    }
}
