package za.co.varsitycollege.st10497775.flashmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //declarations
        var ClickMeButton = findViewById<Button>(R.id.ClickmeButton)
        var InsertName= findViewById<EditText>(R.id.InsertName)
        var WelcomeText=findViewById<TextView>(R.id.WelcomeText)
        var NextButton=findViewById<Button>(R.id.NextButton)
        var Sport=findViewById<Button>(R.id.SportButton)
        var IT=findViewById<Button>(R.id.ITbutton)
        var Message=findViewById<TextView>(R.id.Message)
        var Message2=findViewById<TextView>(R.id.Message2)
        // Click Button That will display all categories and a welcome message
        ClickMeButton.setOnClickListener {
            WelcomeText.text=("Hello,${InsertName.text}")
            Message.visibility=View.VISIBLE
            NextButton.visibility=View.VISIBLE
            WelcomeText.visibility=View.VISIBLE
            Message2.visibility= View.VISIBLE
            Sport.visibility=View.VISIBLE
            IT.visibility= View.VISIBLE

        }

        //Button That will lead you to another where you can do a quiz
        NextButton.setOnClickListener {
           val intent = Intent(this, Quizz::class.java)
            startActivity(intent)

        }
        //Button That will lead you to another where you can do a quiz
        Sport.setOnClickListener {
            val intent=Intent(this, Quizz2::class.java)
            startActivity(intent)
        }
        //Button That will lead you to another where you can do a quiz

        IT.setOnClickListener {
            val intent= Intent(this, Quizz3::class.java)
            startActivity(intent)
        }


    }
    }
