class Product {

    private String code;
    private String name;
    private double unitPrice;
    private int quantity;
    private static int productCount = 0;

    public Product(String code, String name, double unitPrice) {
        this(code, name, unitPrice, 0);
    }

    public Product(String code, String name, double unitPrice, int quantity) {
        if (unitPrice <= 0) {
            throw new IllegalArgumentException("Unit price must be positive");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        productCount++;
    }

    public void restock(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Restock amount cannot be negative");
        }
        quantity += amount;
    }

    public boolean sell(int amount) {
        if (amount < 0 || amount > quantity) {
            return false;
        }
        quantity -= amount;
        return true;
    }

    public double getInventoryValue() {
        return unitPrice * quantity;
    }

    public static int getProductCount() {
        return productCount;
    }

    public String toString() {
        return "Product[" + code + " " + name + ", $" + unitPrice
                + " x " + quantity + "]";
    }
}

public class ProductInventory {

    public static void main(String[] args) {
        Product pen = new Product("P001", "Pen", 10.0);
        Product notebook = new Product("P002", "Notebook", 45.0, 20);
        Product eraser = new Product("P003", "Eraser", 5.0, 50);

        System.out.println(pen);
        System.out.println(notebook);
        System.out.println(eraser);
        System.out.println("Shared product count: " + Product.getProductCount());

        pen.restock(100);
        System.out.println("Pen after restock(100): " + pen);

        System.out.println("Sell 5 pens: " + pen.sell(5));
        System.out.println("Pen after selling 5: " + pen);
        System.out.println("Try selling 1000 pens (rejected): " + pen.sell(1000));
        System.out.println("Pen unchanged: " + pen);

        System.out.println("Notebook inventory value: "
                + notebook.getInventoryValue());
        System.out.println("Independent quantities: pen=" + pen
                + ", notebook=" + notebook);
    }
}
