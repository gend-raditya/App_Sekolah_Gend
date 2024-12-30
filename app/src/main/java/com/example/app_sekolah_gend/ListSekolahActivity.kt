package com.example.app_sekolah_gend

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_sekolah_gend.adapter.AdapterSekolah
import com.example.app_sekolah_gend.model.ModelSekolah

class ListSekolahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_sekolah)

        val listSekolah = listOf(
            ModelSekolah("SMAN 1 Lubuk Alung",R.drawable.sma1la,"Lubuk alung","Sekolah ini didirikan pada tahun 2003 dengan siswa pertama 2 kelas karena bangunan belum ada, maka sementara waktu proses pembelajaran dilaksanakan di SMPN 1 Banuhampu pada sore hari. Pada tahun 2004 dibangun 3 ruang belajar di Nagari Pakan Sinayan dengan dana APBD Kabupaten Agam, maka pembelajaran mulai dilaksankan di lokasi baru yaitu di Nagari Pakan Sinayan pada tanggal 1 Juli 2004 Pada tanggal 26 Maret 2005 sekolah ini diresmikan bersama 5 sekolah lain yang ada di Sumatera Barat oleh Menteri Pendidikan Nasional Bapak Dr. Bambang Sudibyo, MBA Pada acara peresmian itu dihadiri oleh pejabat tinggi Sumatera Barat dan Mantan Ketua MPR RI Amien Rais yang juga telah menjadi sesepuh masyarakat Banuhampu",
                "0812-3456-7890",
                -0.6672592,
                100.285771),
            ModelSekolah("SMAN 2 Lubuk Alung",R.drawable.sma2la,"Lubuk Alung","SMAN 1 Sumatera Barat adalah buah pemikiran dari Bapak Zainal Bakar semasa beliau menjabat sebagai Gubernur Sumatera Barat. Beliau prihatin dengan semakin minimnya putra Minangkabau yang berkecimpung di tingkat nasional. Berbeda jauh dengan zaman revolusi dimana putra-putri Minangkabau selalu memegang peranan penting. Maka dicanangkanlah pembangunan sekolah-sekolah unggul yang akan dikelola langsung oleh Pemerintah provinsi Sumatera Barat. Sekolah-sekolah tersebut direncanakan akan dibangun di Padang Panjang, Solok, Padang dan Lubuk Sikaping. Karena gedungnya belum ada, maka untuk melaksanakan misi ini dipilihlah SMAN 1 Padang Panjang untuk menyaring siswa-siswa terbaik tamatan SMP/MTs dari seluruh Sumatera Barat sebanyak 1 (satu) kelas yang dibiayai oleh Pemerintah Provinsi.",
                "0812-3456-7890",
                -0.6577068,
                100.2886457),
            ModelSekolah("SMA Negeri 1 Enam Lingkung", R.drawable.sma6lingkung,"6 Lingkung","SMA Negeri 1 Bukittinggi berasal dari pecahan SMA Negeri ABC Bukittinggi yang didirikan di Birugo pada tahun 1856 bertepatan pada masa-masa awal Kebangkitan Nasional yang pada masa itu pendidikan adalah hal yang sangat dibutuhkan oleh masyarakat. Sekolah ini berdiri atas prakarsa dr. A. Roesma.Pada saat Agresi Militer Belanda II, sekitar tahun 1949, SMA Negeri ABC Bukittinggi terpaksa dibubarkan, sebab pada saat itu sebagian guru dan siswanya terpaksa mengungsi ke daerah pedalaman. Meskipun begitu, pemerintah kolonial tetap membenarkan pendirian sekolah menengah secara terbatas yang pada saat itu dipimpin oleh Jaka Dt. Sati dan dibantu beberapa orang guru yang pada saat itu tidak ikut mengungsi.",
                "0812-3456-7890",
                -0.6350321,
                100.254524),
            ModelSekolah("SMA Negeri 1 Batang Anai",R.drawable.batanganai,"batang anai","Berdasarkan hasil pengamatan pendeta Bundingh, pemerintahan Belanda dapat mengetahui bahwa pendidikan anak negeri di Hindia Nederland masih rendah. Begitu pula kepandaian guru-guru Melayu di Gouvernement Pesisir Barat pulau Perca (Sumatra) tidaklah mencukupi. Oleh sebab itu, tahun 1855 Pemerintah Belanda merencanakan untuk mendirikan Sekolah Raja (bahasa Belanda: Kweekschool) untuk mendidik anak negeri melalui Surat keputusan pendirian Sekolah Raja untuk mendidik anak negeri yang dikeluarkan pada tanggal 1 April 1856.",
                "0812-3456-7890",
                -0.7401758,
                100.3112955),
            ModelSekolah("SMA Negeri 1 Nan Sabaris",R.drawable.nansabaris,"nansabaris","Cikal bakal berdirinya SMA Negeri 3 Bukittinggi berasal dari nama Sekolah Guru (Kweek School) yaitu pada tahun 1873. Pada tanggal 1 Maret 1873 sekolah guru diubah nama menjadi KWEEK SCHOOL. Guru kepala D. Gerth diubah menjadi Van Wijk. Guru Belanda yang menjadi guru kedua yaitu Weide. Murid-muridnya diasramakan dekat sekolah. Murid-muridnya ini diawasi oleh guru Melayu yang bernama Raja Medan.",
                "0812-3456-7890",
                -0.6450576,
                100.202127),
            ModelSekolah("SMA Negeri 1 Ulakan Tapakis", R.drawable.tapakis,"Ulakan tapakis","Pada kesempatan ini Kepala SMAN 4 Bukittinggi, Dra. Eli Noverma, M.Si melantik wakil kepala sekolah terpilih untuk 3 tahun kedepan yaitu Nur Islam, S.Pd, M.Si sebagai Wakil Kepala Sekolah Bidang Kurikulum, Erik Hadi Putra, S.Pd, Gr sebagai Wakil Kepala Sekolah Bidang Kesiswaan, Benny Fitraza Chaidir, S.Pd sebagai Wakil Kepala Sekolah Bidang Sarana dan Prasarana dan Paulina Virgianti, S.Pd terpilih kembali sebagai Wakil Kepala Sekolah Bidang Humas.",
                "0812-3456-7890",
                -0.6832848,
                100.1716652),
            ModelSekolah("SMA Negeri 1 Pariaman",R.drawable.smapariaman ,"pariaman"," Palang Merah Indonesia (PMI) Bukittinggi mengadakan sosialisasi mengenai peran dan kontribusi PMI di SMA Negeri 5 Bukittinggi yang diikuti oleh para siswa dan guru,Jumat, (25/10)Acara ini bertujuan untuk meningkatkan kesadaran sosial di kalangan pelajar dan memperkenalkan peran PMI di masyarakat.Pada kesempatan itu, Ketua PMI Bukittinggi, Chairunas, menjelaskan, bahwa dalam sosialisasi ini, PMI mengenalkan dua unit layanan utamanya.Kedua unit tersebut ialah, Unit Donor Darah (UDD) yang bertugas menyediakan pasokan darah bagi masyarakat, dan Unit Markas, yang bergerak dalam penanggulangan bencana serta menyediakan layanan ambulans dan mobil jenazah gratis untuk keperluan darurat masyarakat.",
                "0812-3456-7890",
                -0.6300914,
                100.1260253),
            ModelSekolah("MAN Lubuk Alung",R.drawable.man,"Lubuk Alung","SMA Negeri 1 Padang adalah salah satu sekolah menengah atas (SMA) berstatus negeri yang terletak di Kelurahan Lolong Belanti, Kecamatan Padang Utara, Kota Padang, Sumatera Barat. Sekolah ini beralamat di Jalan Belanti Raya No. 11, beberapa puluh meter ke arah barat dari Jalan Khatib Sulaiman, Padang. Sebelumnya, sekolah ini beralamat di Jalan Sudirman No. 1, tetapi kemudian direlokasi ke lokasi sekarang karena bangunan sekolah yang lama rusak berat akibat gempa bumi pada tahun 2009. Gedung sekolah yang baru dibangun di atas lahan seluas 1,6 hektare pada 10 November 2009 dan selesai pada 7 Agustus 2010.",
                "0812-3456-7890",
                -0.6575734,
                100.2814705),
            ModelSekolah("SMAN 1 PAdang",R.drawable.sma1padang,"padang","Semenjak bulan Mei 1958, Kota Padang telah menjadi ibu kota Provinsi Sumatera Barat, sedangkan sebelumnya, ibu kota Provinsi Sumatra Tengah adalah kota Bukittinggi. Sehubungan dengan itu, untuk mengantisipasi bertambahnya penduduk usia sekolah, sedangkan kota Padang pada waktu itu hanya memiliki satu SMA negeri saja, yaitu yang terletak di Jalan Jenderal Sudirman (di gedung lama SMA Negeri 1 Padang sekarang ini.",
                "0812-3456-7890",
                -0.9196179,
                100.3511485),
            ModelSekolah("SMAN 2 Padang Panjang",R.drawable.smapadangpanjang,"Padang Panjang","Pada akhir Tahun Ajaran 1976, hanya ada 2 buah SMA berstatus negeri yang menampung seluruh tamatan peserta didik SMP Negeri dan Swasta di Kota Padang. Kuota yang disediakan oleh kedua sekolah tersebut sangat sedikit dibandingkan dengan jumlah seluruh peserta didik tamatan SMP negeri dan swasta di Kota Padang pada masa itu. Dengan demikian, setiap tahun timbul rasa kecemasan dan kegelisahan dari para orang tua yang berkeinginan melanjutkan pendidikan putra dan putri mereka ke SMA negeri yang tersedia. Pemerintah melalui Proyek Pelita Nasional Tahun 1976/1977, mencanangkan berdirinya SMA ketiga di Kota Padang dengan tujuan untuk mencukupi kuota lulusan peserta didik agar dapat tertampung.",
                "0812-3456-7890",
                -0.4613779,
                100.4004187)
        )
        val adapterSekolah =AdapterSekolah(listSekolah)
        //recycle view
        val rvSekolah : RecyclerView = findViewById(R.id.rvSekolah)
        rvSekolah.adapter = adapterSekolah
        //set layout
        rvSekolah.apply {
            layoutManager = LinearLayoutManager(this@ListSekolahActivity)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}