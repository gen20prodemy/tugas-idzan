package ChildClass;

import Operations.CrudOperationsMap;
import Pojo.ProductMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CrudMap implements CrudOperationsMap {
    private Map<Integer, ProductMap> productMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addElement(int id, String name) {
        if (productMap.containsKey(id)) {
            System.out.println("Error: Element dengan ID " + id + " sudah ada dalam map");
        } else {
            ProductMap product = ProductMap.createProduct(id, name);
            productMap.put(id, product);
            System.out.println("Element berhasil ditambahkan.");
        }
    }

    @Override
    public void deleteElement(int id) {

        if (productMap.containsKey(id)) {
            productMap.remove(id);
            System.out.println("Element berhasil dihapus.");
        } else {
            System.out.println("ID tidak di temukan.");
        }
    }

    @Override
    public void displayElement() {

            System.out.print("Masukan Id element yang ingin ditampilkan: ");
            int id = scanner.nextInt();

            if (productMap.containsKey(id)) {
                ProductMap product = productMap.get(id);
                System.out.println("ID : " + product.getId() + ", Nama: " + product.getName());
            } else {
                System.out.println("ID tidak ditemukan.");
            }

    }

    @Override
    public  void displayAllElements(){
        System.out.println("Seluruh Element pada map: ");
        for (Map.Entry<Integer, ProductMap> entry : productMap.entrySet()) {
            ProductMap product = entry.getValue();
            System.out.println("ID: " + product.getId() +" Nama: "+product.getName());
        }
    }

    @Override
    public void updateElement(int id, String newName) {
        if (productMap.containsKey(id)) {
            ProductMap product = productMap.get(id);
            product.setName(newName);
            System.out.println("Element berhasil di update.");
        } else {
            System.out.println("ID tidak ditemukan.");
        }
    }


}
