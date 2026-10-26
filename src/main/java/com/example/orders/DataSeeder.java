package com.example.orders;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;
/*
@Component
public class DataSeeder implements CommandLineRunner {

    private final OrderRepository seederRepository;

    public DataSeeder(OrderRepository seederRepository) {
        this.seederRepository = seederRepository;
    }


    @Override
    public void run(String... args) {

        Random random = new Random();
        String[] productNames = {"Asus Monitor", "Gigabyte Monitor", "Msi Monitor", "Gaming Keyboard", "Razer Mouse", "Attack Shark Mouse", "Glorius Mouse", "Logitech Mouse", "Mouse Pad", "Graphics Card", "8 GB Ram", "16gb Ram", "AMD Processor", "Intel Processor", "Nvidia Graphics Card", "AMD Graphics card", "Gigabyte Mother board", "MSI Motherboard", "Power supply", "Mid tower", "Large tower", "Cables",};

        String[] firstNames = {"Ahmed", "Mohamed", "Mahmoud", "Omar", "Youssef", "Mostafa", "Karim", "Hassan", "Ali", "Khaled", "Fatma", "Mariam", "Nour", "Salma", "Aya", "Habiba", "Rana", "Yasmin", "Hana", "Jana", "Hoda", "Hanaa", "Jody", "Ganna", "Alaa"};

        String[] lastNames = {"Hassan", "Ali", "Saeed", "Khaled", "Ibrahim", "Adel", "Nabil", "Mansour", "Salah", "Tarek", "Ashraf", "Hany", "Mahmoud", "Samir", "Fathy", "Gamal", "Farouk", "Sherif", "Abdelrahman", "Mostafa", "Mohamed", "Kareem", "Sayed", "Amin", "Youssef"};

        ArrayList<OrderItem> orders= new ArrayList<>();

        for (int i = 0; i < 2000; i++) {

            OrderItem order = new OrderItem();
            double price = random.nextDouble(10, 500);
            price = Math.round(price * 100) / 100.0;
            order.setPrice(price);
            order.setQuantity(random.nextInt(1, 6));
            order.setCustomerName(firstNames[random.nextInt(firstNames.length)] + " " + lastNames[random.nextInt(lastNames.length)]);
            order.setProductName(productNames[random.nextInt(productNames.length)]);

            orders.add(order);
        }
        seederRepository.saveAll(orders);
    }
}
*/