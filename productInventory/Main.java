import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AdminControl adminControl = new AdminControl();
        UserControl userControl = new UserControl(adminControl.getAllProducts());

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add product");
            System.out.println("2. Update product");
            System.out.println("3. Remove product");
            System.out.println("4. Display all products");
            System.out.println("5. Search product");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add product
                    System.out.print("Enter product ID: ");
                    String productId = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int productQuantity = scanner.nextInt();
                    adminControl.addProduct(new Product(productId, productName, productPrice, productQuantity));
                    break;
                case 2:
                    // Update product
                    System.out.print("Enter product ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    adminControl.updateProduct(updateId, newPrice, newQuantity);
                    break;
                case 3:
                    // Remove product
                    System.out.print("Enter product ID to remove: ");
                    String removeId = scanner.nextLine();
                    adminControl.removeProduct(removeId);
                    break;
                case 4:
                    // Display all products
                    adminControl.displayAllProducts();
                    break;
                case 5:
                    // Search product
                    System.out.print("Enter product ID to search: ");
                    String searchId = scanner.nextLine();
                    Product searchedProduct = userControl.searchProduct(searchId);
                    if (searchedProduct != null) {
                        System.out.println("Found: " + searchedProduct);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
