package homework3.src.problem2;

public class sql {
    private String select;
    private String from;
    private String where;
    private String groupBy;
    private String orderBy;
    private int limit;
    private String having;

    private sql(Builder builder) {
        this.select = builder.SELECT;
        this.from = builder.FROM;
        this.where = builder.WHERE;
        this.groupBy = builder.GROUP_BY;
        this.orderBy = builder.ORDER_BY;
        this.limit = builder.LIMIT;
        this.having = builder.HAVING;
    }

    public static class Builder {
        private String SELECT;
        private String FROM;
        private String WHERE;
        private String GROUP_BY;
        private String ORDER_BY;
        private int LIMIT;
        private String HAVING;

        public Builder select(String select) {
            this.SELECT = select;
            return this;
        }

        public Builder from(String from) {
            this.FROM = from;
            return this;
        }

        public Builder where(String where) {
            this.WHERE = where;
            return this;
        }

        public Builder groupBy(String groupBy) {
            this.GROUP_BY = groupBy;
            return this;
        }

        public Builder orderBy(String orderBy) {
            this.ORDER_BY = orderBy;
            return this;
        }

        public Builder limit(int limit) {
            this.LIMIT = limit;
            return this;
        }

        public Builder having(String having) {
            this.HAVING = having;
            return this;
        }

        public sql build() {

            if (this.SELECT == null || this.SELECT.trim().isEmpty()) {
                throw new IllegalStateException("SELECT clause is mandatory");
            }

            if (this.FROM == null || this.FROM.trim().isEmpty()) {
                throw new IllegalStateException("FROM clause is mandatory");
            }

            return new sql(this);
        }
    }

    @Override
    public String toString() {
        return "SQL Query: SELECT " + select + " FROM " + from +
                (where != null ? " WHERE " : "") +
                (groupBy != null ? " GROUP BY " : "") +
                (orderBy != null ? " ORDER BY " : "") +
                (limit > 0 ? " LIMIT " + limit : "") +
                (having != null ? " HAVING " + having : "");
    }
}