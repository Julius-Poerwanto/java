import java.util.Scanner;
public class tp2 {

    //DECLARE VARIABLE
    static int tanggal = 0;
    static int tahun = 0;
    static int menu = 0;
    static int status2 = 0;
    static String nama = "-";
    static String bulan = "-";
    static String no_hp = "-";
    static String alamat = "-";
    static String status = "-";
    static String no_ktp = "-";
    static Scanner input = new Scanner(System.in);

    public static void input_data() {

        //INPUT DATA
        System.out.println("\n============ SELAMAT DATANG ============");
        System.out.println("========== Masukkan Data Diri ==========");
        System.out.print("Nama Lengkap: ");
        nama = input.nextLine();
        
        try {
        do {
        System.out.print("Tanggal Lahir (contoh: 15): ");
        tanggal = Integer.parseInt(input.nextLine());
        if (tanggal < 1 || tanggal > 31) {
            System.out.println("ERROR! Masukkan tanggal antara 1-31");
        }
        } while (tanggal < 1 || tanggal > 31);

        System.out.print("Bulan Lahir (contoh: Desember): ");
        bulan = input.nextLine();
        
        do {
        System.out.print("Tahun Lahir (contoh: 1990): ");
        tahun = Integer.parseInt(input.nextLine());
        if (tahun < 1900 || tahun > 2021) {
            System.out.println("ERROR! Masukkan tahun antara 1900-2021");
        }
        } while (tahun < 1900 || tahun > 2021);
        }

        catch (Exception ex) {
            System.out.println("ERROR! Masukkan data dengan benar");
            input_data();
        }

        System.out.print("Nomor Handphone (contoh: 08xxxxxxxxxx): ");
        no_hp = input.nextLine();

        datafix();
    }

    //KONFIRMASI DATA
    public static void datafix() {
        System.out.println("\n========== Konfirmasi Data ==========");
        System.out.println("Nama Lengkap: " + nama);
        System.out.println("Tanggal Lahir: " + tanggal + " " + bulan + " " + tahun);
        System.out.println("No. Handphone: " + no_hp);

        konfirmasi_menu();
    }

    //MENU KONFIRMASI
    public static void konfirmasi_menu() {

        try {
        do{
        System.out.println("\nApakah Anda yakin dengan data tersebut? [Y|N]");
        char menu = input.nextLine().charAt(0);
        
        if (menu == 'Y' || menu == 'y') {
            menu();
        }
        else if (menu == 'N' || menu == 'n') {
            input_data();
        }
        } while (menu != 'Y' || menu !='y' || menu != 'N' || menu != 'n');
        }
        
        catch (Exception ex) {
            System.out.println("ERROR! Pilih [Y|N]");
            konfirmasi_menu();
        }
    }

    //MENU
        public static void menu() {
            int pilih_menu = 0;

            try {
            do {
            System.out.println("\n1. Lihat Data Diri");
            System.out.println("2. Update Data Diri");
            System.out.println("3. Keluar");
            System.out.println("\nPilih menu: [1|2|3]");
            pilih_menu = Integer.parseInt(input.nextLine());

            switch (pilih_menu) {
                case 1 : menu1(); break;
                case 2 : menu2(); break;
                case 3 : menu3(); break;
                default : System.out.println("ERROR! Pilih menu 1-3");
            }
            } while (pilih_menu < 1 || pilih_menu > 3);
            }
            
            catch (Exception ex) {
                System.out.println("ERROR! Pilih menu 1-3");
                menu();
        }   
        }

    //MENU 1
    public static void menu1() {
        int menu_utama = 0;

        try {
        System.out.println("\n========== Data Diri ==========");
        System.out.println("Nama Lengkap: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Tanggal Lahir: " + tanggal + " " + bulan + " " + tahun);
        System.out.println("No. Handphone: " + no_hp);
        System.out.println("Status: " + status);
        System.out.println("No. KTP: " + no_ktp);

        do {
            System.out.println("\nKembali ke menu utama: [0]");
            menu_utama = Integer.parseInt(input.nextLine());
            if (menu_utama == 0) {
                menu();
            }

        } while (menu_utama != 0);
    }
        catch (Exception ex) {
            System.out.println("ERROR! Kembali ke menu utama: [0]");
            menu1();
    }
    }

    //MENU 2
    public static void menu2() {
        int pilih_menu = 0;

        try {
        do {
        System.out.println("\n========== Update Data Diri ==========");
        System.out.println("1. Nama Lengkap");
        System.out.println("2. Alamat");
        System.out.println("3. Tanggal Lahir");
        System.out.println("4. No. Handphone");
        System.out.println("5. Status");
        System.out.println("6. No. KTP");
        System.out.println("7. Keluar");

            System.out.println("\nPilih data yang akan di update: [1-6]");
            System.out.println("Kembali ke menu utama: [7]");
            pilih_menu = Integer.parseInt(input.nextLine());

            switch (pilih_menu) {
                case 1 : data_1(); break; 
                case 2 : data_2(); break;
                case 3 : data_3(); break;
                case 4 : data_4(); break;
                case 5 : data_5(); break;
                case 6 : data_6(); break;
                case 7 : menu(); break;
                default : System.out.println("ERROR! Pilih menu 1-7");
            }
            } while (pilih_menu < 1 || pilih_menu > 7);
            }

            catch (Exception ex) {
                System.out.println("ERROR! Pilih menu 1-7");
                menu2();
            }
    }

            //DATA_1
            public static void data_1() {
                System.out.println("\n========== Update Nama Lengkap ==========");
                System.out.print("Masukkan Nama Lengkap: ");
                nama = input.nextLine();
                
                menu2();
            }

            //DATA_2
            public static void data_2() {
                System.out.println("\n========== Update Alamat ==========");
                System.out.print("Masukkan Alamat: ");
                alamat = input.nextLine();

                menu2();
            }

            //DATA_3
            public static void data_3() {

                System.out.println("\n========== Update Tanggal Lahir ==========");
                try {
                do {
                    System.out.print("Masukkan Tanggal Lahir (contoh: 15): ");
                    tanggal = Integer.parseInt(input.nextLine());
                    if (tanggal < 1 || tanggal > 31) {
                        System.out.println("ERROR! Masukkan tanggal antara 1-31");
                    }
                    } while (tanggal < 1 || tanggal > 31);
            
                    System.out.print("Masukkan Bulan Lahir (contoh: Desember): ");
                    bulan = input.nextLine();
                    
                    do {
                    System.out.print("Masukkan Tahun Lahir (contoh: 1990): ");
                    tahun = Integer.parseInt(input.nextLine());
                    if (tahun < 1900 || tahun > 2050) {
                        System.out.println("ERROR! Masukkan tahun yang benar");
                    }
                    } while (tahun < 1900 || tahun > 2021);
                }
                catch (Exception ex) {
                    System.out.println("ERROR! Masukkan data dengan benar");
                    data_3();
                }
            }

            //DATA_4
            public static void data_4() {
                System.out.println("\n========== Update No. Handphone ==========");
                System.out.print("Masukkan No. Handphone (contoh: 08xxxxxxxxxx): ");
                no_hp = input.nextLine();
                menu2();
            }

            //DATA_5
            public static void data_5() {

                try {
                do {
                System.out.println("\n========== Update Status ==========");
                System.out.println("Pilih Status: [1|2]");
                System.out.println("1. Menikah");
                System.out.println("2. Belum Menikah");
                status2 = Integer.parseInt(input.nextLine());

                switch (status2) {
                    case 1 : status = "Menikah"; menu2(); break;
                    case 2 : status = "Belum Menikah"; menu2(); break;
                    default : System.out.println("ERROR! Pilih nomor 1 atau 2");
                }
                } while (status2 < 1 || status2 > 2);
                }

                catch (Exception ex) {
                    System.out.println("ERROR! Pilih nomor 1 atau 2");
                    data_5();
            }
        }

            //DATA_6
            public static void data_6() {
                System.out.println("\n========== No. KTP ==========");
                System.out.print("Masukkan No. KTP: ");
                no_ktp = input.nextLine();

                menu2();
            }

    public static void menu3() {
        input.close();
        System.out.println("========== Anda telah keluar ==========");
        System.out.println("============ TERIMA KASIH ============");
        System.exit(0);
    }

    public static void main(String[] args) {
        try {
        input_data();
        }
        catch  (Exception ex) {
            System.out.println("ERROR! Masukkan data dengan benar");
            input_data();
        }
    }
}