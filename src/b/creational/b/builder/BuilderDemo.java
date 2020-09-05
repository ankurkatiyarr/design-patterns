package b.creational.b.builder;

public class BuilderDemo {
	public static void main(String[] args) {
		MysqlQueryBuilder mysqlQueryBuilder = new MysqlQueryBuilder();
		mysqlQueryBuilder.fromEntity("payment_status");
		mysqlQueryBuilder.where("P-MF-0123");
		Query mysqlQuery = mysqlQueryBuilder.getQuery();
		mysqlQuery.execute();
		
		MongoDBQueryBuilder mongoDBQueryBuilder = new MongoDBQueryBuilder();
		mongoDBQueryBuilder.fromEntity("payment_audit_logs");
		mongoDBQueryBuilder.where("P-MF-0123");
		Query mongoDBQuery = mongoDBQueryBuilder.getQuery();
		mongoDBQuery.execute();
	}
}
