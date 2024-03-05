import java.util.Scanner;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukan Umur: ");
        int umur = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Masukan Email: ");
        String email = input.nextLine();
        /* Seharusnya tidak perlu menggunakan try dan catch lagi karena method validasiDataUser
         sudah menggunakan throw dan catch hanya menampilkan pesan error */
        try {
            validasiDataUser(nama, umur, email);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    public static void validasiDataUser(String nama, int umur, String email) {
        // Validasi nama tidak boleh kosong atau null
        if (nama.trim().isEmpty()) {
            throw new InvalidInputException("Nama tidak valid");
        }

        // Validasi umur harus lebih dari 0
        if (umur <= 0) {
            throw new InvalidInputException("Umur tidak valid");
        }

        // Validasi email harus sesuai format email pada umumnya
        if (email == null || !email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$")) {
            throw new InvalidInputException("Email tidak valid");
        }

        // Proses lainnya jika input valid
        System.out.println("Data pengguna valid: Nama=" + nama + ", Umur=" + umur + ", Email=" + email);
    }
}

