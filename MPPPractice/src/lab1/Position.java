package lab1;

/**
 *
 * @author rmsor_000
 */
public class Position {
    private String title;
    private String description;

    public Position(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void print(){
        System.out.println("=================Position Details====================");
        System.out.println("Title: "+title);
        System.out.println("Description: "+description);
        System.out.println("=======================================================");
    }
    
}
