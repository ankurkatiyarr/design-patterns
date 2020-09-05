package b.creational.b.builder;

/**
 * 
 * The Builder in builder design pattern
 *
 */
public interface QueryBuilder {
	void fromEntity(String entityName);
	void where(String condition);
	Query getQuery();
}
