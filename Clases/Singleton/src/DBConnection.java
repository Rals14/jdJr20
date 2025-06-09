public class DBConnection {
    private static DBConnection instance;
    private String dbConfiguration;

    public DBConnection() {
        dbConfiguration = "Provider=VFPOLEDB.1;Data Source=E:\\MYDB;";
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public String getDbConfiguration() {
        return dbConfiguration;
    }


    public void setDbConfiguration(String dbConfiguration) {
        this.dbConfiguration = dbConfiguration;
    }
}
