package b.creational.b.builder;

/**
 * 
 * The ConreteBuilder in builder design pattern
 *
 */
public class MysqlQueryBuilder implements QueryBuilder {
	private MysqlQuery mysqlQuery = new MysqlQuery();
	
	@Override
	public void fromEntity(String entityName) {
		mysqlQuery.setFromEntity(entityName);
	}

	@Override
	public void where(String condition) {
		mysqlQuery.setWhere(condition);
	}

	@Override
	public Query getQuery() {
		return mysqlQuery;
	}

}
