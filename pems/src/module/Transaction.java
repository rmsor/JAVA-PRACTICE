package module;

public class Transaction {
	private String transId;
	private String categoryId;
	private String amount;
	private String incExp;
	private String transType;
	private String transDate;
	private String userId;
	private String status;
	private String catName;
	private String userName;
	
	public Transaction(String transId, String categoryId, String amount,String incExp,
			String transType, String transDate, String userId, String status,
			String catName, String userName) {
		this.transId = transId;
		this.categoryId = categoryId;
		this.amount = amount;
		this.incExp=incExp;
		this.transType = transType;
		this.transDate = transDate;
		this.userId = userId;
		this.status = status;
		this.catName = catName;
		this.userName = userName;
	}
	public Transaction(String amount,String catName) {
		this.amount = amount;
		this.catName = catName;
	}
	public String getIncExp() {
		return incExp;
	}
	public void setIncExp(String incExp) {
		this.incExp = incExp;
	}
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getTransDate() {
		return transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
