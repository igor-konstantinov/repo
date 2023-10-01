public class Main {
    public static void main(String[] args) {
        // Create a PostgreSQL query builder
        QueryBuilder postgreSQLQueryBuilder = new PostgreSQLQueryBuilder();
        String postgreSQLQuery = postgreSQLQueryBuilder.select("column1", "column2")
                .where("column3 = 'value'")
                .limit(10)
                .getSQL();
        System.out.println("PostgreSQL Query: " + postgreSQLQuery);

        // Create a MySQL query builder
        QueryBuilder mySQLQueryBuilder = new MySQLQueryBuilder();
        String mySQLQuery = mySQLQueryBuilder.select("columnA", "columnB")
                .where("columnC = 'value'")
                .limit(5)
                .getSQL();
        System.out.println("MySQL Query: " + mySQLQuery);
    }
}