package b.creational.b.builder;

/**
 * 
 * The Product implementation in builder design pattern
 *
 */
public class MongoDBQuery implements Query {
	private String fromEntity;
	private String where;

	@Override
	public void execute() {
		String query = "db." + fromEntity + ".find({'field:'" + where + "'})"; 
		System.out.println("Executing following query: " + query);
	}

	public String getFromEntity() {
		return fromEntity;
	}

	public void setFromEntity(String fromEntity) {
		this.fromEntity = fromEntity;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	@Override
	public String toString() {
		return "MongoDBQuery [fromEntity=" + fromEntity + ", where=" + where + "]";
	}

}
