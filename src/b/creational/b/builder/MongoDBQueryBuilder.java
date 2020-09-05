package b.creational.b.builder;

/**
 * 
 * The ConreteBuilder in builder design pattern
 *
 */
public class MongoDBQueryBuilder implements QueryBuilder {
	private MongoDBQuery mongoDBQuery = new MongoDBQuery();
	
	@Override
	public void fromEntity(String entityName) {
		mongoDBQuery.setFromEntity(entityName);
	}

	@Override
	public void where(String condition) {
		mongoDBQuery.setWhere(condition);
	}

	@Override
	public Query getQuery() {
		return mongoDBQuery;
	}

}
