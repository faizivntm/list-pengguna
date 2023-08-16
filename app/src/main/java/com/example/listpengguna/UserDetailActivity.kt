package com.example.listpengguna

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)

        val user = intent.getParcelableExtra<User>("user")

        val userName: TextView = findViewById(R.id.userNameDetail)
        val userEmail: TextView = findViewById(R.id.userEmailDetail)
        val userMajor: TextView = findViewById(R.id.userMajorDetail)
        val userSemester: TextView = findViewById(R.id.userSemesterDetail)

        userName.text = user?.name
        userEmail.text = user?.email
        userMajor.text = user?.major
        userSemester.text = user?.semester
    }
}
