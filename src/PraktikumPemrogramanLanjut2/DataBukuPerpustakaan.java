package PraktikumPemrogramanLanjut2;

import java.util.Scanner;

public class DataBukuPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Object PraktikumPemrogramanLanjut.Buku Teknologi
        Buku Buku1 = new Buku("Teknologi Informasi dan Komunikasi (TIK)","Deepublish","Hamdan Husein",542,2017,                                                                           "PraktikumPemrogramanLanjut.Buku ajar Teknologi, Informasi, dan Komunikasi (Prinsip dan Aplikasi dalam Studi Pemikiran Islam) ini membantu\nmahasiswa memahami sistem informasi komputer, karenan saat ini kehidupan manusia tidak bisa lepas dari perkembangan komputer. ");
        Buku Buku2 = new Buku("Teknologi Pengolahan dan Pengawetan Daging","Universitas Brawijaya Press","Hari Purnomo",216,2012,                                                         "Sejalan dengan perkembangan ilmu dan teknologi serta peningkatan pendapatan masyarakat dan kesadaran masyarakat akan kaitan makanan dan  \nkesehatan, maka pola konsumsi makana juga berubah yaitu dari makan asal kenyang menjadi makan aman, sehat dan enak. Perubahan ini membawa akibat bukan saja \nmeningkatnya kesadaran konsumen untuk memilih bahan pangan yang lebih baik mutunya serta aman dan bermanfaat bagi kesehatan, tetapi juga berpengaruh pada\nteknologi pengolahan, pengawetan serta penyajiannya.");
        Buku Buku3 = new Buku("Dasar Logika Pemrograman Komputer","Elex Media Komputindo","Abdul Kadir",331,2017,                                                                         "PraktikumPemrogramanLanjut.Buku ini dapat di gunakan oleh siapa saja yang bermaksud mendalami penyusunan algoritma untuk menyelesaikan   \nmasalah dengan komputer. PraktikumPemrogramanLanjut.Buku ini menekan kan pada penyusunan logika yang berbasis diagram alir (flowchart), yang menjadi fondasi pada pembuatan program komputer.");
        Buku Buku4 = new Buku("10 Juta Pertama dari Google AdSense","Elex Media Komputindo","Jefferly Helianthusonfri",184,2022,                                                          "Mau meraih pendapatan dari Google AdSense? Ingin membangun channel YouTube atau blog yang sukses dan bisa menghasilkan pendapatan dari   \ninternet? Jika ya, Google AdSense bisa jadi salah satu solusinya. Melalui Google AdSense, kita bisa menampilkan iklan guna menghasilkan pendapatan dari     \nwebsite/blog/channel YouTube/konten kita di internet.");
        Buku Buku5 = new Buku("Marketing 5.0: Teknologi untuk Kemanusiaan","Gramedia Pustaka Utama","Philip Kotler, Hermawan Kartajaya, Iwan Setiawan",256,2022,                          "");

        // Object PraktikumPemrogramanLanjut.Buku Filsafat
        Buku Buku6 = new Buku("Filsafat Moral: Pergumulan Etis Keseharian Hidup Manusia","Pt Kanisius","Dr. Agustinus W. Dewantara, S.S.,M.Hum",128,2017,                                 "");
        Buku Buku7 = new Buku("PraktikumPemrogramanLanjut.Buku Filsafat Manusia Untuk Psikologi","Pt Remaja Rosdakarya","FATTAH HANURAWAN, PROF., DR.",144,2021,                          "Filsafat banyak memengaruhi psikologi, termasuk pemikiran mengenai hakikat manusia. Untuk memahami esensi yang kompleks dalam diri       \nmanusia kita butuh acuan yang teruji dan tepercaya");
        Buku Buku8 = new Buku("Mengenal Filsafat Islam","Yrama Widya","Dr.asep Sulaiman M.ag.,m.pd",160,2017,                                                                             "Ketika kata “filsafat” disebut, terbayanglah permainan kata-kata sulit nan ruwet—kadang-kadang absurd dan mengada-ada—hanya untuk        \nberbicara tentang soal-soal yang tidak jelas kegunaannya. Paling bagus, orang akan menganggapnya sebagai “ilmu tinggi” yang hanya dipahami oleh segelintir  \norang yang memiliki selera agak aneh. Kenyataannya, filsafat adalah ibu kandung perkembangan paradigma atau perkembangan dunia yang—disadari atau       \ntidak—selalu mendasari perkembangan ilmu-ilmu. Di dalam filsafat, konsep-konsep tentang Tuhan, alam (ciptaan), manusia, etika, kebahagiaan, bahkan politik dan \nberbagai konsep lain yang sentral bagi kehidupan manusia diperbincangkan dan dirumuskan.");
        Buku Buku9 = new Buku("FILSAFAT UMUM","RajaGrafindo Persada","ASMORO ACHMADI",152,2001,                                                                                           "Untuk mengetahui seberapa besar filsafat mempengaruhi kehidupan manusia, di dalam buku ini disajikan sejarah filsafat, mulai dari        \nFilsafat Yunani, Filsafat Barat Abad Pertengahan, hingga pemikiran Filsafat di Timur. Di jelaskan juga filsafat modern, seperti rasionalisme, empirisme,    \nmaterialisme, eksistensialisme, dan sebagainya, serta filsafat yang populer akhir - akhir ini, yaitu filsafat analitis dan struktualisme.               \nPraktikumPemrogramanLanjut. Buku ini penting untuk mahasiswa Fakultas Ushuluddin, Fakultas Filsafat di UIN dan perguruan tinggi islam lainnya, serta masyarakat\numum yang ingin mempelajari filsafat.");
        Buku Buku10 = new Buku("Filsafat Pendidikan","Prenada Media","Muhammad Anwar",193,2017,                                                                                           "Tujuan berfilsafat adalah sebagai upaya menjawab pertanyaan pertanyaan yang timbuul dalam berbagai bidang kehidupan manusia. Nerfilsafat \npada prinsipnya menempatkan kebenaran filsafat tergantung pada kemampuan nalar manusia.");

        // Object PraktikumPemrogramanLanjut.Buku Sejarah
        Buku Buku11 = new Buku("Sejarah Penyalinan Kitab Suci Perjanjian Baru","Andi Offset","REV. CHRISTOPHER LUTHY, PH.D",120,2021,                                                     "");
        Buku Buku12 = new Buku("Sejarah Perang Salib Paling Membara: Dari Perebutan Yerusalem", "Anak Hebat Indonesia","Jati Pamungkas, M.A.",244,2018,                                   "Perang Salib merupakan periode sejarah paling dahsyat untuk dikaji. Sebabnya, perang ini melibatkan dua kekuatan ideologi untuk          \nmempertahankan dominasi mereka di kawasan Mediterania, yakni antara Islam dan Kristen.");
        Buku Buku13 = new Buku("Sejarah dan Peradaban Mesir Kuno","Andi Offset","Jonar T.h Situmorang, M.a",214,2021,                                                                     "Peradaban Mesir Kuno adalah peradaban kuno di sebelah timur laut benua Afrika, yang berpusat di daerah hilir sungai Nil, yakni kawasan   \nyang kini menjadi wilayah negara Mesir. Peradaban ini dimulai dengan unifikasi Mesir Hulu dan Hilir sekitar 3150 SM, dan selanjutnya berkembang selama      \nkurang lebih tiga milenium.");
        Buku Buku14 = new Buku("Sejarah Lengkap Perang Dunia 1 (1914-1918)","Sociality","Alfi Arifian",336,2020,                                                                          "Perang Dunia I (WW1) adalah kontes gladiator terbesar sepanjang sejarah umat manusia yang melibatkan para hegemon Eropa serta koloninya. \nVladimir Lenin, sang tokoh komunis Rusia yang dijuluki ‘virus' oleh para hegemon Eropa menyebut perang ini sebagai ”perangnya bangsawan”, bukan ”perang     \nrakyat”.");
        Buku Buku15 = new Buku("Asal Usul Peradaban dan Sejarah Eropa","C-KLICK MEDIA","AMIR UBAIDILLAH",204,2021,                                                                        "Benua Eropa memiliki banyak kisah dan kunci lahirnya peradaban manusia di dunia. Tidak heran jika akhirnya Benua Eropa dikenal sebagai   \nbenua tertua yang pernah ada. Sebab, banyak bukti sejarah yang dicatat pada benua ini. ");

        // Object PraktikumPemrogramanLanjut.Buku Agama
        Buku Buku16 = new Buku("Sahih Bukhari Muslim Takhrij & Syarah Hadis","Gramedia Widiasarana Indonesia","Muhammad Fuad Abdul Baqi",1448,2018,                                       "Belajar hadits itu berlimpah kebaikan. Selain mampu memahami ajaran Islam dengan dan terbebas dari pemahaman Islam yang salah, belajar   \nhadits juga menjadikan wajah bercahaya dan berseri-seri. Lalu, haruskah kita mempelajari bertumpuk-tumpuk kitab hadits yang berhalaman tebal? Jawabannya ya,\njika kita memiliki kemampuan. Bagaimana bagi yang hanya memiliki kemampuan pas-pasan? Tentu membutuhkan buku yang praktis dan mudah dipelajari. Nah buku \nyang berisi 100 hadits pilihan dari dua kitab hadits yang paling shahih (Bukhari-Muslim) ini akan memberikan kemudahan. ");
        Buku Buku17 = new Buku("Z1 Sma/Ma/Smk/Mak Kl.X Pend Agama Islam&Bd Pekerti K/13 Rev.", "DIKNAS","Kemendikbud",202,2016,                                                           "");
        Buku Buku18 = new Buku("English For Islamic Studies","Pt Rajagrafindo Persada","DJAMALUDDIN",230,2019,                                                                            "English for Islamic Studies is written to fulfill students’ needs to learn English as a preparatory for job communication. This book is  \ndesigned to provide an opportunity to develop students’ English skills more communicatively and meaningfully.");
        Buku Buku19 = new Buku("Menjadi Muslim Berakhlak Mulia Bersama Gus Baha","Anak Hebat Indonesia","Ipnu R. Nugroho",192,2023,                                                       "Sebenernya semua akar dari permasalahan itu sederhana, yaitu kita sendiri yang mempersempit pencarian. Kita kerap dipusingkan oleh       \nkriteria kita sendiri. Sebagai contoh, ada orang yang kriteria pasangan hidupnya adalah orang cantik, kaya raya, berpendidikan, dan sebagainya. Coba kita   \nmempersempit ruang pencarian kita, seperti misalnya Aku mencari calon istri yang rajin beribadah kepada Allah. Potongan ceramah Gus Baha memang kerap    \ndibumbui dengan candaan tetapi tetap sarat makna. Selain itu, materi-materi ceramah ulama asal Rembang ini juga sangat related dengan problem-problem yang   \nkerap dihadapi oleh masyarakat islam masa kini--yang dibanjiri oleh penceramah yang menampilkan islam sebagai sesuatu yang kuno dan kaku.");
        Buku Buku20 = new Buku("Muslim Produktif","Elex Media Komputindo","Mohammed Faris",320,2017,                                                                                      "Islam memandang produktivitas sebagai alat untuk mencapai tujuan, dan produktif adalah sebuah proses untuk mendapatkan hasil. Seorang    \nmuslim diharuskan menjadi produktif, sesuai dengan peranan yang telah ditetapkan ataupun dipilih. Rumus produktif yang dijelaskan oleh penulis adalah energi\nx fokus x waktu dengan tambahan untuk tujuan yang bermanfaat.");

        // Object PraktikumPemrogramanLanjut.Buku Psikologi
        Buku Buku21 = new Buku("The Psychology of Money","PENERBIT BACA","MORGAN HOUSEL",268,2021,                                                                                        "atanya uang bukan segalanya. Ada orang yang punya banyak uang dan harta, tapi hidupnya tak bahagia. Namun, tanpa uang, hidup pun bisa    \nmakin rumit dan membuat kita mudah mencemaskan banyak hal. Uang tetaplah kita butuhkan. Kehidupan dan keseharian kita tak akan pernah terpisahkan dari      \nperkara uang. Uang bisa menghadirkan kesejahteraan, tapi di sisi lain bisa juga menghadirkan kesengsaraan.");
        Buku Buku22 = new Buku("Psychology Of Selling", "Bhuana Ilmu Populer","Brian Tracy",304,2021,                                                                                     "Aktivitas menjual sangat penting dalam sebuah organisasi bisnis. Produk sehebat apapun, kalau tidak dapat dijual, tidak akan menghasilkan\nlaba. Adakah cara menjual yang efektif dan mudah dipelajari? Demikian menurut Brian Tracy dalam bukunya The Psychology of Selling. Brian Tracy pernah meniti\nkarir menjadi wiraniaga dan kini menjadi pembicara terkenal di dunia.");
        Buku Buku23 = new Buku("Psikologi Kesehatan – Konsep, Masalah, dan Pemikiran Untuk Indonesia","Penerbit PraktikumPemrogramanLanjut.Buku Kompas","Eunike Sri Tyas Suci",516,2022,  "PraktikumPemrogramanLanjut.Buku Psikologi Kesehatan: Konsep, Masalah, dan Pemikiran untuk Indonesia membahas berbagai masalah kesehatan  \ndari perspektif biopsikososiokultural. Diawali dengan pemahaman dasar psikologi kesehatan, buku ini melihat dimensi sosial kesehatan, masalah kesehatan     \nsosial di Indonesia, serta beberapa pemikiran tentang psikologi kesehatan Indonesia di masa depan.");
        Buku Buku24 = new Buku("Psikologi Suatu Pengantar (Edisi Terbaru)","Andi Publisher","Drs. M Dimyati Mahmud",352,2018,                                                             "PraktikumPemrogramanLanjut.Buku ini berisikan bermacam telaah teoritis tentang gejala-gejala dan fungsi kejiwaan, peristiwa-peristiwa    \npsikis terutama pada manusia,serta berbagai faktor yang mempengaruhinya. Selain hadir sebagai sumber pengajaran bagi mahasiswa bidang studi terkait, buku   \nini sekaligus hadir untuk menambah jumlah kepustakaan psikologi berbahasa Indonesia di tanah air. PraktikumPemrogramanLanjut.Buku ini terutama           \ndiperuntukkan bagi mahasiswa Fakultas Ilmu Pendidikan semua jurusan dan program studi yang menempuh mata kuliah Dasar-Dasar Psikologi sebagai bekal untuk    \nmempelajari bidang-bidang psikologi yang lain, seperti psikologi perkembangan, psikologi pendidikan, psikologi abnormal dan psikologi kepribadian");
        Buku Buku25 = new Buku("Psikologi Islam: Rujukan Utama Ilmu Psikologi Dunia", "Rene Turos Indonesia Pt","Ibnu Sina",348,2022,                                                     "Psikologi Islam – Hidup di dunia yang semakin bergerak cepat dan menuntut banyak hal seperti sekarang, kita menghadapi banyak sekali     \ngangguan mental yang bermunculan sebagai respons atas kondisi yang terjadi. Misalnya ada gangguan kecemasan (anxiety), psikosomatis, dan banyak istilah     \nlainnya yang menggambarkan tentang beragamnya kondisi jiwa atau mental manusia modern yang tidak baik-baik saja.");

        // Object PraktikumPemrogramanLanjut.Buku Politik
        Buku Buku26 = new Buku("Politik dan Ideologi PDI Perjuangan 1987–1999: Penemuan dan Kemenangan", "Kepustakaan Populer Gramedia","Djarot Saiful Hidayat dan Endi Haryono",334,2023,"");
        Buku Buku27 = new Buku("Etika Politik", "Gramedia Pustaka Utama","Franz Magnis-suseno",556,2016,                                                                                  "ola kenegaraan modern berkembang bersamaan dengan revolusi ekonomi, sosial, dan budaya, yang berlangsung di Eropa Barat tiga ratus tahun \nyang lalu dan mendapat ungkapan yang paling mengesankan dalam perwujudan masyarakat industrial dan pasca-industrial masa kini.");
        Buku Buku28 = new Buku("POLITIK HUKUM PERTANAHAN (Suatu Kajian Historis dan Yuridis)","Celebes Media Perkasa","Prof. Dr. H. Abd. Rahman, SH., MH.",205,2018,                      "");
        Buku Buku29 = new Buku("Psikologi Politik","Pbk","WHINDA YUSTISIA, MOH. ABDUL HAKIM, RAHMAN ARDI",150,2021,                                                                       "PraktikumPemrogramanLanjut.Buku ini secara keseluruhan berisi tentang pandangan psikologi tentang masalah kebangsaan, mulai dari         \nPancasila, krisis kepemimpinan,konflik antarkelompok, rekonsiliasi, partisipasi politik, dan gerakan sosial.Kajian ini tidak hanya didesain bagi para       \npenggelut diskursus psikologi, namun juga bagi para pemerhati politik, akademisi cabang keilmuan lain, aktivis-aktivis gerakan sosial, dan juga khalayak \numum yang mempunyai minat dan tekadterhadap penyelesaian masalah kebangsaan dan kenegaraan.");
        Buku Buku30 = new Buku("Politik Hukum Narkotika", "lex Media Komputindo","Dr. Anang Iskandar, S.IK, SH, MH",120,2022,                                                             "");

        // Object PraktikumPemrogramanLanjut.Buku Fiksi
        Buku Buku31 = new Buku("Itikurih: Kumpulan 101 Fiksimini Sunda", "Bitread Digital Publishing","Andrie Kustria Wardana",106,2018,                                                  "");
        Buku Buku32 = new Buku("Laut Bercerita (The Sea Speaks His Name)", "Paperback","Leila S. Chudori",330,2017,                                                                       "Laut Bercerita menceritakan terkait perilaku kekejaman dan kebengisan yang dirasakan oleh kelompok aktivis mahasiswa di masa Orde Baru.  \nTidak hanya itu, novel ini pun merenungkan kembali akan hilangnya 13 aktivis, bahkan sampai saat ini belum juga ada yang mendapatkan petunjuknya.");
        Buku Buku33 = new Buku("Kekasih Musim Gugur","Gramedia Pustaka Utama","Laksmi Pamuntjak",452,2020,                                                                                "kisah dua perempuan, Srikandi (Siri) dan Dara. Yang satu seorang seniman cosmopolitan dan satunya lagi seorang aktivis politik.");
        Buku Buku34 = new Buku("Keajaiban Toko Kelontong Namiya","Kadokawa Shoten","Keigo Higashino",400,2012,                                                                            "bercerita tentang tiga berandal, yaitu Atsuya, Shota, dan Kohei yang menjadikan toko kelontong tidak berpenghuni sebagai tempat          \npersembunyian setelah melakukan aksi pencurian.");
        Buku Buku35 = new Buku("Fiksi Lotus (Volume 1)", "Gramedia Pustaka Utama","Maggie Tiojakin",198,2013,                                                                             "Cerita klasik adalah cerita yang tidak kenal batasan waktu (Maggie Tiojakin, Fiksi Lotus Hal viii). Tetapi karya klasik terkadang        \nmenjadi momok bacaan yang cukup menakutkan bagi sebagian besar orang. Bukan karena isi ceritanya, tetapi lebih sering karena bahasa yang dipakai untuk      \nmenuturkan-lah yang cukup njelimet sampai kadang membuat pembaca lelah.");

        // Display
        System.out.println("Data PraktikumPemrogramanLanjut.Buku Perpustakaan \n======================");
        System.out.println("1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi\n======================");
        System.out.print("Masukkan pilihan anda: ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1 : {
                Buku1.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku1.HitungKata(Buku1.Sinopsis));
                Buku2.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku2.HitungKata(Buku2.Sinopsis));
                Buku3.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku3.HitungKata(Buku3.Sinopsis));
                Buku4.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku4.HitungKata(Buku4.Sinopsis));
                Buku5.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku5.HitungKata(Buku5.Sinopsis));
                System.out.println("");
                System.out.println("Buku Yang di Copy");
                Buku1.display();
                Buku2.display();
                Buku3.display();
                Buku4.display();
                Buku5.display();
                break;
            }
            case 2 : {
                Buku6.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku6.HitungKata(Buku6.Sinopsis));
                Buku7.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku7.HitungKata(Buku7.Sinopsis));
                Buku8.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku8.HitungKata(Buku8.Sinopsis));
                Buku9.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku9.HitungKata(Buku9.Sinopsis));
                Buku10.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku10.HitungKata(Buku10.Sinopsis));
                System.out.println("");
                System.out.println("Buku Yang di Copy");
                Buku6.display();
                Buku7.display();
                Buku8.display();
                Buku9.display();
                Buku10.display();
                break;
            }
            case 3 : {
                Buku11.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku11.HitungKata(Buku11.Sinopsis));
                Buku12.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku12.HitungKata(Buku12.Sinopsis));
                Buku13.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku13.HitungKata(Buku13.Sinopsis));
                Buku14.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku14.HitungKata(Buku14.Sinopsis));
                Buku15.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku15.HitungKata(Buku15.Sinopsis));
                System.out.println("");
                System.out.println("Buku Yang di Copy");
                Buku11.display();
                Buku12.display();
                Buku13.display();
                Buku14.display();
                Buku15.display();
                break;
            }
            case 4 : {
                Buku16.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku16.HitungKata(Buku16.Sinopsis));
                Buku17.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku17.HitungKata(Buku17.Sinopsis));
                Buku18.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku18.HitungKata(Buku18.Sinopsis));
                Buku19.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku19.HitungKata(Buku19.Sinopsis));
                Buku20.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku20.HitungKata(Buku20.Sinopsis));
                System.out.println("");
                System.out.println("Buku Yang di Copy");
                Buku16.display();
                Buku17.display();
                Buku18.display();
                Buku19.display();
                Buku20.display();
                break;
            }
            case 5 : {
                Buku21.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku21.HitungKata(Buku21.Sinopsis));
                Buku22.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku22.HitungKata(Buku22.Sinopsis));
                Buku23.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku23.HitungKata(Buku23.Sinopsis));
                Buku24.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku24.HitungKata(Buku24.Sinopsis));
                Buku25.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku25.HitungKata(Buku25.Sinopsis));
                System.out.println("");
                System.out.println("Buku Yang di Copy");
                Buku21.display();
                Buku22.display();
                Buku23.display();
                Buku24.display();
                Buku25.display();
                break;
            }
            case 6 : {
                Buku26.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku26.HitungKata(Buku26.Sinopsis));
                Buku27.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku27.HitungKata(Buku27.Sinopsis));
                Buku28.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku28.HitungKata(Buku28.Sinopsis));
                Buku29.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku29.HitungKata(Buku29.Sinopsis));
                Buku30.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku30.HitungKata(Buku30.Sinopsis));
                System.out.println("");
                System.out.println("Buku Yang di Copy");
                Buku26.display();
                Buku27.display();
                Buku28.display();
                Buku29.display();
                Buku30.display();
                break;
            }
            case 7 : {
                Buku31.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku31.HitungKata(Buku31.Sinopsis));
                Buku32.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku32.HitungKata(Buku32.Sinopsis));
                Buku33.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku33.HitungKata(Buku33.Sinopsis));
                Buku34.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku34.HitungKata(Buku34.Sinopsis));
                Buku35.display();
                System.out.println("Jumlah kata dari Sinopsis\t: " + Buku35.HitungKata(Buku35.Sinopsis));
                System.out.println("");
                System.out.println("Buku Yang di Copy");
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
