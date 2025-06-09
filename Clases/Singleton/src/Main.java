public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        DBConnection dbConnection2 = DBConnection.getInstance();

        System.out.println("DB Connection 1: " + dbConnection.getDbConfiguration());
        System.out.println("DB Connection 2: " + dbConnection2.getDbConfiguration());

        // Verify that both instances are the same
       dbConnection2.setDbConfiguration("Probando...");
        System.out.println("DB Connection 1 after change: " + dbConnection.getDbConfiguration());


    }
}
