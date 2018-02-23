Connection connection;
public loginModel(){
        try {
        this.connection = dbConnection.getConnection();
        } catch (SQLException ex) {
        ex.printStackTrace();
        }
        if (this.connection == null) {
        System.exit(1);
        }
        }
public boolean isDatabaseConnection(){
        return this.connection != null;
