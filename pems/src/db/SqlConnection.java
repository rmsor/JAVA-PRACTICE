package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import module.CategoryTitle;
import module.Transaction;
import module.User;

public class SqlConnection {

	private Connection conn = null;

	public SqlConnection() throws ClassNotFoundException {
		try {

			String dbURL = "jdbc:sqlserver://127.0.0.1;databaseName=pems;";
			String user = "sa";
			String pass = "pathak@123";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(dbURL, user, pass);

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public List<CategoryTitle> getCategoryTitle(String cond) {
		String SQL = "select cat.category_id,cat.cat_name,cat.cat_type,cat.status,cat.user_id,usr.user_name from pems.dbo.category_title cat left join pems.dbo.users usr on (cat.user_id=usr.user_id) where 1=1 ";
		if (cond.length() > 0) {
			SQL += cond;
		}
		List<CategoryTitle> catTitleList = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				CategoryTitle ct = new CategoryTitle(rs.getString(1),
						rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6));
				catTitleList.add(ct);
			}
			rs.close();
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return catTitleList;
	}

	public List<User> getUser(String cond) {
		String SQL = "select * from users where 1=1 ";
		if (cond.length() > 0) {
			SQL += cond;
		}
		//System.out.println(SQL);
		List<User> userList = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				User usr = new User(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
				userList.add(usr);
			}
			rs.close();
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}

	public List<Transaction> getTransactions(String cond) {
		String SQL = "select trns.trans_id,trans.category_id,trans.amount,trans.inc_exp,trans.trans_type,trans.trans_date,trans.user_id,trans.status,cat.cat_name,usr.user_name from pems.dbo.transactions trns left join pems.dbo.category_title cat on (trns.category_id=cat.category_id) left join pems.dbo.users usr on (trns.user_id=usr.user_id) where 1=1 ";
		if (cond.length() > 0) {
			SQL += cond;
		}
		List<Transaction> transList = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				Transaction trns = new Transaction(rs.getString(1),
						rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getString(9), rs.getString(10));
				transList.add(trns);
			}
			rs.close();
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return transList;
	}
	public List<Transaction> getIncomeSummary(String cond) {
		String SQL = "select sum(trans.amount) total_amount,cat.cat_name from transactions trans left join category_title cat on(trans.category_id=cat.category_id)	where 1=1 ";
		if (cond.length() > 0) {
			SQL += cond;
		}
		SQL+=" group by trans.category_id,cat.cat_name";
		
		List<Transaction> transList = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				Transaction trns = new Transaction(rs.getString(1),rs.getString(2));
				transList.add(trns);
			}
			rs.close();
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return transList;
	}

	public Map<String, List<Object>> executeOld(String SQL) {
		Map<String, List<Object>> resultMap = new HashMap<String, List<Object>>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			resultMap = resultSetToArrayList(rs);
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultMap;
	}

	public Map<String, List<Object>> resultSetToArrayList(ResultSet rs)
			throws SQLException {
		ResultSetMetaData md = rs.getMetaData();
		int columns = md.getColumnCount();
		System.out.println(columns);
		Map<String, List<Object>> map = new HashMap<>(columns);
		for (int i = 1; i <= columns; ++i) {
			map.put(md.getColumnName(i), new ArrayList<>());
		}
		while (rs.next()) {
			for (int i = 1; i <= columns; ++i) {
				map.get(md.getColumnName(i)).add(rs.getObject(i));
			}
		}

		return map;
	}
	public int executeUpdateStatement(String SQL) {
	   int rowsAffected=0;
		try {
	      Statement stmt = conn.createStatement();
	      rowsAffected = stmt.executeUpdate(SQL);
	      stmt.close();
	   }
	   catch (Exception e) {
	      e.printStackTrace();
	   }
	   return rowsAffected;
	}
	public Connection get() {
		return conn;
	}

	public void close() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
