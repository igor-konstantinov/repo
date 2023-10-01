class MySQLQueryBuilder implements QueryBuilder {
    private StringBuilder query;

    public MySQLQueryBuilder() {
        this.query = new StringBuilder();
    }

    @Override
    public QueryBuilder select(String... fields) {
        query.append("SELECT ");
        for (String field : fields) {
            query.append(field).append(", ");
        }
        query.setLength(query.length() - 2); // Remove the trailing comma and space
        return this;
    }

    @Override
    public QueryBuilder where(String condition) {
        query.append(" WHERE ").append(condition);
        return this;
    }

    @Override
    public QueryBuilder limit(int limit) {
        query.append(" LIMIT ").append(limit);
        return this;
    }

    @Override
    public String getSQL() {
        return query.toString();
    }
}