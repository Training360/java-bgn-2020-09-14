package attrs;

public class TrainerMain {

    public static void main(String[] args) {
        System.out.println("Main kezdete");

//        Trainer firstTrainer = new Trainer();

        System.out.println("Trainer kész");

//        firstTrainer.setName("John Doe");
//        firstTrainer.setYearOfBirth(2003);

        Trainer firstTrainer = new Trainer("John Doe", 2005);


        System.out.println(firstTrainer.getName());
        System.out.println(firstTrainer.getYearOfBirth());

//        firstTrainer.setName("John Doe");
//        firstTrainer.setYearOfBirth(2000);
//
//        System.out.println(firstTrainer.getName());
//        System.out.println(firstTrainer.getYearOfBirth());
//
//        Trainer secondTrainer = new Trainer();
//        System.out.println(secondTrainer.getName());
//
//        System.out.println(firstTrainer);
    }

}
