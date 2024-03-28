public abstract class itemCategory {
    private int categoryId;
    private String name;

    public int getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Abstract method
    public abstract void displayCategoryInfo();
}
