package com.example.listpengguna
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {

    private val dummyUsers = listOf(
        User("Fatullah Hadiwinata", "Fatul@gmail.com", "Informatika", "Semester 3"),
        User("Faiz Ivan Tama", "faiz@gmail.com", "Informatika", "Semester 4"),
        User("Putri Natasha", "nata@gmail.com", "Manajemen", "Semester 2"),
        User("Apple pie", "pie@gmail.com", "Hukum", "Semester 5"),
        User("Americano", "americano@gmail.com", "Sistem Informasi", "Semester 6")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRecyclerView: RecyclerView = findViewById(R.id.userRecyclerView)
        val userAdapter = UserAdapter(dummyUsers) { clickedUser ->
            val intent = Intent(this, UserDetailActivity::class.java)
            intent.putExtra("user", clickedUser)
            startActivity(intent)
        }

        userRecyclerView.adapter = userAdapter

        // Menampilkan tampilan utama (RecyclerView) setelah splash screen
        val splashImage: ImageView = findViewById(R.id.splashImage)

        splashImage.postDelayed({
            splashImage.visibility = View.GONE
            userRecyclerView.visibility = View.VISIBLE
        }, 2000) // Ubah angka ini untuk menyesuaikan waktu splash screen (dalam milidetik)
    }
}
