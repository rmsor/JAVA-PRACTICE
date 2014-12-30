package lib;

public class Magazine extends Publication {
    private String issueNo;

    public Magazine(String title,String issueNo) {
        super(title);
        this.issueNo = issueNo;
    }

    public String getIssueNo() {
        return issueNo;
    }
    
}
