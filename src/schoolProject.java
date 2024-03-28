public class schoolProject implements donationCategory {
    private int projectId;
    private String schoolName;
    private String projectName;
    private String description;

    public int getProjectId() {
        return this.projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getprojectName() {
        return this.projectName;
    }

    public void setprojectName(String name) {
        this.projectName = name;
    }

    public String getSchoolName() {
        return this.schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Constructor, getters, and setters

    @Override
    public void displayCategory() {
        // Implementation for displaying school project category information
    }
}
