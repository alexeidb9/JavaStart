package Tasks.OrderSystem;

import java.util.Scanner;

public class ShopManager {

        public static void main (String[]args){
            Order[] orders = createOrders();
            OrderStatus orderStatus = readStatus();
            Order[] filteredOrders = filterOrdersByStatus(orders, orderStatus);
            printOrders(filteredOrders, orderStatus);
        }

        private static void printOrders (Order[] filteredOrders, OrderStatus orderStatus){
            System.out.println("Order list with status " + orderStatus);
            for (Order order : filteredOrders) {
                System.out.println(order);
            }
        }

        private static Order[] createOrders () {
            Order[] orders = new Order[10];
            orders[0] = new Order("Apple MacBook Pro 2018", 4999, OrderStatus.PAID);
            orders[1] = new Order("Samsung Galaxy s10", 2499, OrderStatus.SHIPPED);
            orders[2] = new Order("Apple iPhone X", 2999, OrderStatus.PAID);
            orders[3] = new Order("Beko X2000", 1499, OrderStatus.DELIVERED);
            orders[4] = new Order("Samsung AT200", 1199, OrderStatus.DELIVERED);
            orders[5] = new Order("JBL z100", 199, OrderStatus.NEW);
            orders[6] = new Order("Yamaha XBC900", 3499, OrderStatus.CANCELLED);
            orders[7] = new Order("Sony Playstation 4", 1499, OrderStatus.SHIPPED);
            orders[8] = new Order("USBC - HDMI", 149, OrderStatus.PAID);
            orders[9] = new Order("Zelmer PRIMO", 99.99, OrderStatus.SHIPPED);
            return orders;
        }

        private static OrderStatus readStatus () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Provide order status to display (");
            for (OrderStatus os : OrderStatus.values()) {
                System.out.print(os.name() + " ");
            }
            System.out.println("):");
            String status = scanner.nextLine();
            return OrderStatus.valueOf(status);
        }

        private static Order[] filterOrdersByStatus (Order[]orders, OrderStatus orderStatus){
            int size = countOrderByStatus(orders, orderStatus);
            Order[] orderByStatus = new Order[size];
            int counter = 0;
            for (Order order : orders) {
                if (order.getStatus() == orderStatus) {
                    orderByStatus[counter] = order;
                    counter++;
                }
            }
            return orderByStatus;
        }

        private static int countOrderByStatus (Order[]orders, OrderStatus orderStatus){
            int count = 0;
            for (Order order : orders) {
                if (order.getStatus() == orderStatus)
                    count++;
            }
            return count;
        }


    }


