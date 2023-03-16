import java.util.Scanner;

public class DataBukuPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Object Buku Teknologi
        Teknologi Buku1 = new Teknologi("Teknologi Informasi dan Komunikasi (TIK)","Deepublish","Hamdan Husein",542,2017);
        Teknologi Buku2 = new Teknologi("Teknologi Pengolahan dan Pengawetan Daging","Universitas Brawijaya Press","Hari Purnomo",216,2012);
        Teknologi Buku3 = new Teknologi("Dasar Logika Pemrograman Komputer","Elex Media Komputindo","Abdul Kadir",331,2017);
        Teknologi Buku4 = new Teknologi("10 Juta Pertama dari Google AdSense","Elex Media Komputindo","Jefferly Helianthusonfri",184,2022);
        Teknologi Buku5 = new Teknologi("Marketing 5.0: Teknologi untuk Kemanusiaan","Gramedia Pustaka Utama","Philip Kotler, Hermawan Kartajaya, Iwan Setiawan",256,2022);

        // Object Buku Filsafat
        Filsafat Buku6 = new Filsafat("Filsafat Moral: Pergumulan Etis Keseharian Hidup Manusia","Pt Kanisius","Dr. Agustinus W. Dewantara, S.S.,M.Hum",128,2017);
        Filsafat Buku7 = new Filsafat("Buku Filsafat Manusia Untuk Psikologi","Pt Remaja Rosdakarya","FATTAH HANURAWAN, PROF., DR.",144,2021);
        Filsafat Buku8 = new Filsafat("Mengenal Filsafat Islam","Yrama Widya","Dr.asep Sulaiman M.ag.,m.pd",160,2017);
        Filsafat Buku9 = new Filsafat("FILSAFAT UMUM","RajaGrafindo Persada","ASMORO ACHMADI",152,2001);
        Filsafat Buku10 = new Filsafat("Filsafat Pendidikan","Prenada Media","Muhammad Anwar",193,2017);

        // Object Buku Sejarah
        Sejarah Buku11 = new Sejarah("Sejarah Penyalinan Kitab Suci Perjanjian Baru","Andi Offset","REV. CHRISTOPHER LUTHY, PH.D",120,2021);
        Sejarah Buku12 = new Sejarah("Sejarah Perang Salib Paling Membara: Dari Perebutan Yerusale", "Anak Hebat Indonesia","Jati Pamungkas, M.A.",244,2018);
        Sejarah Buku13 = new Sejarah("Sejarah dan Peradaban Mesir Kuno","Andi Offset","Jonar T.h Situmorang, M.a",214,2021);
        Sejarah Buku14 = new Sejarah("Sejarah Lengkap Perang Dunia 1 (1914-1918)","Sociality","Alfi Arifian",336,2020);
        Sejarah Buku15 = new Sejarah("Asal Usul Peradaban dan Sejarah Eropa","C-KLICK MEDIA","AMIR UBAIDILLAH",204,2021);

        // Object Buku Agama
        Agama Buku16 = new Agama("Sahih Bukhari Muslim Takhrij & Syarah Hadis","Gramedia Widiasarana Indonesia","Muhammad Fuad Abdul Baqi",1448,2018);
        Agama Buku17 = new Agama("Z1 Sma/Ma/Smk/Mak Kl.X Pend Agama Islam&Bd Pekerti K/13 Rev.", "DIKNAS","Kemendikbud",202,2016);
        Agama Buku18 = new Agama("English For Islamic Studies","Pt Rajagrafindo Persada","DJAMALUDDIN",230,2019);
        Agama Buku19 = new Agama("Menjadi Muslim Berakhlak Mulia Bersama Gus Baha","Anak Hebat Indonesia","Ipnu R. Nugroho",192,2023);
        Agama Buku20 = new Agama("Muslim Produktif","Elex Media Komputindo","Mohammed Faris",320,2017);

        // Object Buku Psikologi
        Psikologi Buku21 = new Psikologi("The Psychology of Money","PENERBIT BACA","MORGAN HOUSEL",268,2021);
        Psikologi Buku22 = new Psikologi("Psychology Of Selling", "Bhuana Ilmu Populer","Brian Tracy",304,2021);
        Psikologi Buku23 = new Psikologi("Psikologi Kesehatan – Konsep, Masalah, dan Pemikiran Untuk Indonesia","Penerbit Buku Kompas","Eunike Sri Tyas Suci",516,2022);
        Psikologi Buku24 = new Psikologi("Psikologi Suatu Pengantar (Edisi Terbaru)","Andi Publisher","Drs. M Dimyati Mahmud",352,2018);
        Psikologi Buku25 = new Psikologi("Psikologi Islam: Rujukan Utama Ilmu Psikologi Dunia", "Rene Turos Indonesia Pt","Ibnu Sina",348,2022);

        // Object Buku Politik
        Politik Buku26 = new Politik("Politik dan Ideologi PDI Perjuangan 1987–1999: Penemuan dan Kemenangan", "Kepustakaan Populer Gramedia","Djarot Saiful Hidayat dan Endi Haryono",334,2023);
        Politik Buku27 = new Politik("Etika Politik", "Gramedia Pustaka Utama","Franz Magnis-suseno",556,2016);
        Politik Buku28 = new Politik("POLITIK HUKUM PERTANAHAN (Suatu Kajian Historis dan Yuridis)","Celebes Media Perkasa","Prof. Dr. H. Abd. Rahman, SH., MH.",205,2018);
        Politik Buku29 = new Politik("Psikologi Politik","Pbk","WHINDA YUSTISIA, MOH. ABDUL HAKIM, RAHMAN ARDI",150,2021);
        Politik Buku30 = new Politik("Politik Hukum Narkotika", "lex Media Komputindo","Dr. Anang Iskandar, S.IK, SH, MH",120,2022);

        // Object Buku Fiksi
        Fiksi Buku31 = new Fiksi("Itikurih: Kumpulan 101 Fiksimini Sunda", "Bitread Digital Publishing","Andrie Kustria Wardana",106,2018);
        Fiksi Buku32 = new Fiksi("Laut Bercerita (The Sea Speaks His Name)", "Paperback","Leila S. Chudori",330,2017);
        Fiksi Buku33 = new Fiksi("Kekasih Musim Gugur","Gramedia Pustaka Utama","Laksmi Pamuntjak",452,2020);
        Fiksi Buku34 = new Fiksi("Keajaiban Toko Kelontong Namiya","Kadokawa Shoten","Keigo Higashino",400,2012);
        Fiksi Buku35 = new Fiksi("Fiksi Lotus (Volume 1)", "Gramedia Pustaka Utama","Maggie Tiojakin",198,2013);


        // Display
        System.out.println("Data Buku Perpustakaan");
        System.out.println("1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi");
        System.out.print("Masukkan pilihan anda: ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1 : {
                Buku1.display();
                Buku2.display();
                Buku3.display();
                Buku4.display();
                Buku5.display();
                break;
            }
            case 2 : {
                Buku6.display();
                Buku7.display();
                Buku8.display();
                Buku9.display();
                Buku10.display();
                break;
            }
            case 3 : {
                Buku11.display();
                Buku12.display();
                Buku13.display();
                Buku14.display();
                Buku15.display();
                break;
            }
            case 4 : {
                Buku16.display();
                Buku17.display();
                Buku18.display();
                Buku19.display();
                Buku20.display();
                break;
            }
            case 5 : {
                Buku21.display();
                Buku22.display();
                Buku23.display();
                Buku24.display();
                Buku25.display();
                break;
            }
            case 6 : {
                Buku26.display();
                Buku27.display();
                Buku28.display();
                Buku29.display();
                Buku30.display();
                break;
            }
            case 7 : {
                Buku31.display();
                Buku32.display();
                Buku33.display();
                Buku34.display();
                Buku35.display();
                break;
            }
        }
    }
}
