public class Item {
    protected int location;
    protected String description;

    // Constructor with arguments
    public Item(int location, String description) {
        this.location = location;
        this.description = description;
    }

    // Getters and setters for location
    protected int getLocation() {
        return location;
    }

    protected void setLocation(int location) {
        this.location = location;
    }

    // Getters and setters for description
    protected String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }
}
