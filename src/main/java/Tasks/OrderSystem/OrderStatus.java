package Tasks.OrderSystem;

public enum OrderStatus {
    NEW("New"),
    PAID("Paid"),
    SHIPPED ("Shipped"),
    DELIVERED ("Delivered"),
    CANCELLED ("Cancelled");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "description='" + description + '\'' +
                '}';
    }
}
