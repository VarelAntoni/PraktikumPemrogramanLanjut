import java.util.Scanner;

public class DataBukuPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Object Buku Teknologi
        Buku Buku1 = new Buku("Teknologi Informasi dan Komunikasi (TIK)","Deepublish","Hamdan Husein",542,2017);
        Buku Buku2 = new Buku("Teknologi Pengolahan dan Pengawetan Daging","Universitas Brawijaya Press","Hari Purnomo",216,2012);
        Buku Buku3 = new Buku("Dasar Logika Pemrograman Komputer","Elex Media Komputindo","Abdul Kadir",331,2017);
        Buku Buku4 = new Buku("10 Juta Pertama dari Google AdSense","Elex Media Komputindo","Jefferly Helianthusonfri",184,2022);
        Buku Buku5 = new Buku("Marketing 5.0: Teknologi untuk Kemanusiaan","Gramedia Pustaka Utama","Philip Kotler, Hermawan Kartajaya, Iwan Setiawan",256,2022);

        // Object Buku Filsafat
        Buku Buku6 = new Buku("Filsafat Moral: Pergumulan Etis Keseharian Hidup Manusia","Pt Kanisius","Dr. Agustinus W. Dewantara, S.S.,M.Hum",128,2017);
        Buku Buku7 = new Buku("Buku Filsafat Manusia Untuk Psikologi","Pt Remaja Rosdakarya","FATTAH HANURAWAN, PROF., DR.",144,2021);
        Buku Buku8 = new Buku("Mengenal Filsafat Islam","Yrama Widya","Dr.asep Sulaiman M.ag.,m.pd",160,2017);
        Buku Buku9 = new Buku("FILSAFAT UMUM","RajaGrafindo Persada","ASMORO ACHMADI",152,2001);
        Buku Buku10 = new Buku("Filsafat Pendidikan","Prenada Media","Muhammad Anwar",193,2017);

        // Object Buku Sejarah
        Buku Buku11 = new Buku("Sejarah Penyalinan Kitab Suci Perjanjian Baru","Andi Offset","REV. CHRISTOPHER LUTHY, PH.D",120,2021);
        Buku Buku12 = new Buku("Sejarah Perang Salib Paling Membara: Dari Perebutan Yerusale", "Anak Hebat Indonesia","Jati Pamungkas, M.A.",244,2018);
        Buku Buku13 = new Buku("Sejarah dan Peradaban Mesir Kuno","Andi Offset","Jonar T.h Situmorang, M.a",214,2021);
        Buku Buku14 = new Buku("Sejarah Lengkap Perang Dunia 1 (1914-1918)","Sociality","Alfi Arifian",336,2020);
        Buku Buku15 = new Buku("Asal Usul Peradaban dan Sejarah Eropa","C-KLICK MEDIA","AMIR UBAIDILLAH",204,2021);

        // Object Buku Agama
        Buku Buku16 = new Buku("Sahih Bukhari Muslim Takhrij & Syarah Hadis","Gramedia Widiasarana Indonesia","Muhammad Fuad Abdul Baqi",1448,2018);
        Buku Buku17 = new Buku("Z1 Sma/Ma/Smk/Mak Kl.X Pend Agama Islam&Bd Pekerti K/13 Rev.", "DIKNAS","Kemendikbud",202,2016);
        Buku Buku18 = new Buku("English For Islamic Studies","Pt Rajagrafindo Persada","DJAMALUDDIN",230,2019);
        Buku Buku19 = new Buku("Menjadi Muslim Berakhlak Mulia Bersama Gus Baha","Anak Hebat Indonesia","Ipnu R. Nugroho",192,2023);
        Buku Buku20 = new Buku("Muslim Produktif","Elex Media Komputindo","Mohammed Faris",320,2017);

        // Object Buku Psikologi
        Buku Buku21 = new Buku("The Psychology of Money","PENERBIT BACA","MORGAN HOUSEL",268,2021);
        Buku Buku22 = new Buku("Psychology Of Selling", "Bhuana Ilmu Populer","Brian Tracy",304,2021);
        Buku Buku23 = new Buku("Psikologi Kesehatan – Konsep, Masalah, dan Pemikiran Untuk Indonesia","Penerbit Buku Kompas","Eunike Sri Tyas Suci",516,2022);
        Buku Buku24 = new Buku("Psikologi Suatu Pengantar (Edisi Terbaru)","Andi Publisher","Drs. M Dimyati Mahmud",352,2018);
        Buku Buku25 = new Buku("Psikologi Islam: Rujukan Utama Ilmu Psikologi Dunia", "Rene Turos Indonesia Pt","Ibnu Sina",348,2022);

        // Object Buku Politik
        Buku Buku26 = new Buku("Politik dan Ideologi PDI Perjuangan 1987–1999: Penemuan dan Kemenangan", "Kepustakaan Populer Gramedia","Djarot Saiful Hidayat dan Endi Haryono",334,2023);
        Buku Buku27 = new Buku("Etika Politik", "Gramedia Pustaka Utama","Franz Magnis-suseno",556,2016);
        Buku Buku28 = new Buku("POLITIK HUKUM PERTANAHAN (Suatu Kajian Historis dan Yuridis)","Celebes Media Perkasa","Prof. Dr. H. Abd. Rahman, SH., MH.",205,2018);
        Buku Buku29 = new Buku("Psikologi Politik","Pbk","WHINDA YUSTISIA, MOH. ABDUL HAKIM, RAHMAN ARDI",150,2021);
        Buku Buku30 = new Buku("Politik Hukum Narkotika", "lex Media Komputindo","Dr. Anang Iskandar, S.IK, SH, MH",120,2022);

        // Object Buku Fiksi
        Buku Buku31 = new Buku("Itikurih: Kumpulan 101 Fiksimini Sunda", "Bitread Digital Publishing","Andrie Kustria Wardana",106,2018);
        Buku Buku32 = new Buku("Laut Bercerita (The Sea Speaks His Name)", "Paperback","Leila S. Chudori",330,2017);
        Buku Buku33 = new Buku("Kekasih Musim Gugur","Gramedia Pustaka Utama","Laksmi Pamuntjak",452,2020);
        Buku Buku34 = new Buku("Keajaiban Toko Kelontong Namiya","Kadokawa Shoten","Keigo Higashino",400,2012);
        Buku Buku35 = new Buku("Fiksi Lotus (Volume 1)", "Gramedia Pustaka Utama","Maggie Tiojakin",198,2013);


        // Display
        System.out.println("Data Buku Perpustakaan \n======================");
        System.out.println("1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi\n======================");
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
