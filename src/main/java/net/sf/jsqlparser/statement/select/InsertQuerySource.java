package net.sf.jsqlparser.statement.select;

/**
 * A query source for an insert statement
 */
public class InsertQuerySource extends SubSelect {

	@Override
	public String toString() {
		return getSelectBody().toString();
	}

}
