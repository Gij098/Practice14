package com.example.pr14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var namebox: EditText = findViewById(R.id.editTextText)
        var agebox: EditText = findViewById(R.id.editTextNumber)
        var emailbox: EditText = findViewById(R.id.editTextTextEmailAddress)


        var arguments: Bundle? = intent.extras
        if (arguments != null) {
            var name: String = arguments.getString("name").toString()
            var age: Int = arguments.getInt("age")
            var email: String = arguments.getString("email").toString()

            namebox.setText("$name")
            agebox.setText("$age")
            emailbox.setText("$email")

            val text : TextView = findViewById(R.id.textView)
            val text2 : TextView = findViewById(R.id.textView2)
            val text3 : TextView = findViewById(R.id.textView3)

            text.setText("*")
            text2.setText("*")
            text3.setText("*")

        }
    }


    fun ButtonOnClick(veiw: View) {

        var namebox: EditText = findViewById(R.id.editTextText)
        var agebox: EditText = findViewById(R.id.editTextNumber)
        var emailbox: EditText = findViewById(R.id.editTextTextEmailAddress)

        var name: String = namebox.text.toString()
        var age: Int = agebox.text.toString().toInt()
        var email: String = emailbox.text.toString()

        val intent: Intent = Intent(this@MainActivity, SecondActivity::class.java)

        intent.putExtra("name", name)
        intent.putExtra("age", age)
        intent.putExtra("email", email)
     

        startActivity(intent)
    }
}


