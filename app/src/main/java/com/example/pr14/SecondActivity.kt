package com.example.pr14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var namebox: EditText = findViewById(R.id.editTextText2)
        var agebox: EditText = findViewById(R.id.editTextNumber2)
        var emailbox: EditText = findViewById(R.id.editTextTextEmailAddress2)


        var arguments: Bundle? = intent.extras

        if (arguments != null) {
            var name: String = arguments.getString("name").toString()
            var age: Int = arguments.getInt("age")
            var email: String = arguments.getString("email").toString()

            namebox.setText("$name")
            agebox.setText("$age")
            emailbox.setText("$email")


        }
    }

    fun ButtonOnClick2(view: View) {
        var namebox: EditText = findViewById(R.id.editTextText2)
        var agebox: EditText = findViewById(R.id.editTextNumber2)
        var emailbox: EditText = findViewById(R.id.editTextTextEmailAddress2)

        var name: String = namebox.text.toString()
        var age: Int = agebox.text.toString().toInt()
        var email: String = emailbox.text.toString()

        val intent: Intent = Intent(this@SecondActivity, MainActivity::class.java)
        intent.putExtra("name", name)
        intent.putExtra("age", age)
        intent.putExtra("email", email)
        startActivity(intent)
    }

}