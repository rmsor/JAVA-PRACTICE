package module;

public class CategoryTitle {

	private String categoryId;
	private String catName;
	private String catType;
	private String status;
	private String userId;
	private String userName;
	public CategoryTitle(String categoryId, String catName, String catType,
			String status, String userId, String userName) {
		this.categoryId = categoryId;
		this.catName = catName;
		this.catType = catType;
		this.status = status;
		this.userId = userId;
		this.userName = userName;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatType() {
		return catType;
	}
	public void setCatType(String catType) {
		this.catType = catType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
