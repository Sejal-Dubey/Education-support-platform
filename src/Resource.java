public class Resource {
    private int resourceId;
    private String name;
    private String type;
    private int quantity;
    private itemCategory category; // Reference to ItemCategory abstract class

    public int getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public itemCategory getCategory() {
        return this.category;
    }

    public void setCategory(itemCategory category) {
        this.category = category;
    }

    // Constructor, getters, and setters
}
