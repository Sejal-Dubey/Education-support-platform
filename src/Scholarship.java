public class Scholarship implements donationCategory {
    private int scholarshipId;
    private String name;
    private String description;

    public int getScholarshipId() {
        return this.scholarshipId;
    }

    public void setScholarshipId(int scholarshipId) {
        this.scholarshipId = scholarshipId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
        // Implementation for displaying scholarship category information
    }
}
