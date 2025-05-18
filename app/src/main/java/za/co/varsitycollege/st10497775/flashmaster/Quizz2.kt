package za.co.varsitycollege.st10497775.flashmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
var Question2=arrayOf("Real Madrid Won the 2013 UCL (Champions League)","Cristiano Ronaldo is the highest goalscore in Football History","Raphinha Played for Stade rennais FC before in his Career","Messi Has the most Ballon D'or in Football History ","Sweden won Euro 2004")
var Answers2=arrayOf("False","True","True","True","False")
var UserChoice2=arrayListOf<String>("")
class Quizz2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quizz2)
        var Myscore=findViewById<TextView>(R.id.Score2)
        var value=0
        var index2 = 1
        var ReviewMessage2=""
        var feedback2 = findViewById<TextView>(R.id.Feedback2)
        var Question2 = findViewById<TextView>(R.id.Question2)
        var TrueButton2 = findViewById<Button>(R.id.TrueButton2)
        var FalseButton2 = findViewById<Button>(R.id.FalseButton2)
        var StartButton2 = findViewById<Button>(R.id.Start2)
        var Result2=findViewById<Button>(R.id.Result2)
        var BacktoMenu2=findViewById<Button>(R.id.BackToMenu2)
        var QuestionButton2= findViewById<Button>(R.id.QuestionButton2)
        var Answer2=findViewById<TextView>(R.id.Answer2)
        //Assigning The Counter
        Myscore.text = "Score:$value/5"
        //Start Button To Start The Game
        StartButton2.setOnClickListener {
            Question2.visibility = View.VISIBLE
            TrueButton2.visibility = View.VISIBLE
            FalseButton2.visibility = View.VISIBLE
            StartButton2.visibility = View.GONE
            QuestionButton2.visibility = View.VISIBLE


        }
        //Assigning The Feedback Textview to contain the user's choice
        feedback2.text=UsersChoice.toString()
        //Assigning the Question's textview to the first question when you click the start button
        Question2.text = za.co.varsitycollege.st10497775.flashmaster.Question2[0]
        //Next Button To Move on the next question when your done
        QuestionButton2.setOnClickListener {
            Question2.text = za.co.varsitycollege.st10497775.flashmaster.Question2[index2]
            index2 = index2 + 1
            if (index2 == 5) {
                Result2.visibility= View.VISIBLE
                QuestionButton2.visibility = View.GONE
                //When it reaches the last question it will make the results button appear
            }
        }
        TrueButton2.setOnClickListener {
            /*True button when the user clicks on it, its stores True it in UsersChoice and
            whenever the user clicks the button on a certain question it increments
            the counter
             */
            if (Question2.text.toString() == "${za.co.varsitycollege.st10497775.flashmaster.Question2[1]}") {
                UserChoice2.listIterator().add("True")
                feedback2.text=UserChoice2.toString()
                value++
                Myscore.text="Score:${value.toString()}/5"

            }
            else if( Question2.text.toString() == "${za.co.varsitycollege.st10497775.flashmaster.Question2[2]}"){
                UserChoice2.listIterator().add("True")
                feedback2.text=UserChoice2.toString()
                value++
                Myscore.text="Score:${value.toString()}/5"}
            else if( Question2.text.toString() == "${za.co.varsitycollege.st10497775.flashmaster.Question2[3]}"){
                UserChoice2.listIterator().add("True")
                feedback2.text=UserChoice2.toString()
                value++
                Myscore.text="Score:${value.toString()}/5"}

            else{
                UserChoice2.listIterator().add("True")
                feedback2.text=UserChoice2.toString()
            }
        }
        FalseButton2.setOnClickListener {
            /*False button when the user clicks on it, its stores False in UsersChoice and
              whenever the user clicks the button on a certain question it increments
              the counter
                */
            if (Question2.text.toString() == "${za.co.varsitycollege.st10497775.flashmaster.Question2[0]}"){
                UserChoice2.listIterator().add("False")
                feedback2.text=UserChoice2.toString()
                value++
                Myscore.text="Score:${value.toString()}/5"}

            else if (Question2.text.toString() == "${za.co.varsitycollege.st10497775.flashmaster.Question2[4]}"){
                UserChoice2.listIterator().add("False")
                feedback2.text=UserChoice2.toString()
                value++
                Myscore.text="Score:${value.toString()}/5"}
            else{
                UserChoice2.listIterator().add("Flase")
                feedback2.text=UserChoice2.toString()
            }
        }
        Result2.setOnClickListener {
            /*
            Results Button when the user clicks on it displays the Correct answers for every
            questions, but shortly before that it check if you have gotten 3 or above if yes
            it will print great job otherwise keep practicing
             */
            if (value>=3){

                ReviewMessage2="Great Job"
            } else {

                ReviewMessage2="Keep Practicing"
            }
            Question2.text=
                "CORRECT ANSWERS\n"+
                        "$ReviewMessage2\n"+
                        "Q1 Answer=${Answers2[0]}\n"+
                        "Q2 Answer=${Answers2[1]}\n"+
                        "Q3 Answer=${Answers2[2]}\n"+
                        "Q4 Answer=${Answers2[3]}\n"+
                        "Q5 Answer=${Answers2[4]}\n"
            BacktoMenu2.visibility= View.VISIBLE
            feedback2.visibility= View.GONE
            TrueButton2.visibility= View.GONE
            FalseButton2.visibility= View.GONE
            Result2.visibility= View.GONE
            feedback2.visibility= View.VISIBLE
            Myscore.visibility= View.VISIBLE
            Answer2.visibility= View.VISIBLE
            /*
            Back to menu button appears giving you an option to go to other categories
            and your feedback/user's input comes and your total scores also appears on top
             */
        }

        //Back To menu Button leading to the main menu
        BacktoMenu2.setOnClickListener {
            val Intent= Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

    }





}


