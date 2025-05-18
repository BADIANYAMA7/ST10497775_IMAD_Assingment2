package za.co.varsitycollege.st10497775.flashmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.convertTo
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays
//Arrays Used for the Quiz Question,Answer and UsersChoice where their appropriate elements will be stored
val Question=arrayOf("The Great Wall of China was built to keep out Mongol invaders.","Christopher Columbus discovered America in 1776.","The Roman Empire fell in 476 AD.","The pyramids in Egypt were built during the Roman Empire.","World War I began in 2020")
val Answer=arrayOf("True","False","True","False","False")
val UsersChoice=arrayListOf<String>("")


class Quizz : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quizz)
        //Declarations
        var counter = 0
        var index1 = 1
        var ReviewMessage=""
        var MyTotalScore = findViewById<TextView>(R.id.Score1)
        var feedback1 = findViewById<TextView>(R.id.Feedback1)
        var Question1 = findViewById<TextView>(R.id.Question1)
        var TrueButton1 = findViewById<Button>(R.id.Truebutton1)
        var FalseButton1 = findViewById<Button>(R.id.FalseButton1)
        var StartButton1 = findViewById<Button>(R.id.Start1)
        var Result1=findViewById<Button>(R.id.Result1)
        var BacktoMenu=findViewById<Button>(R.id.BackToMenu1)
        var QuestionButton1 = findViewById<Button>(R.id.QuestionButton1)
        var Answer1=findViewById<TextView>(R.id.Answer1)
        //Assigning The Counter
        MyTotalScore.text = "Score:$counter/5"
        //Start Button To Start The Game
        StartButton1.setOnClickListener {
            Question1.visibility = View.VISIBLE
            TrueButton1.visibility = View.VISIBLE
            FalseButton1.visibility = View.VISIBLE
            StartButton1.visibility = View.GONE
            QuestionButton1.visibility = View.VISIBLE


        }
        //Assigning The Feedback Textview to contain the user's choice
        feedback1.text=UsersChoice.toString()
        //Assigning the Question's textview to the first question when you click the start button
        Question1.text = Question[0]
        //Next Button To Move on the next question when your done
        QuestionButton1.setOnClickListener {
            Question1.text = Question[index1]
            index1 = index1 + 1
            if (index1 == 5) {
                Result1.visibility= View.VISIBLE
                QuestionButton1.visibility = View.GONE
                //When it reaches the last question it will make the results button appear
            }
        }
        TrueButton1.setOnClickListener {
            /*True button when the user clicks on it, its stores True it in UsersChoice and
            whenever the user clicks the button on a certain question it increments
            the counter
             */
            if (Question1.text.toString() == "${Question[0]}") {
                UsersChoice.listIterator().add("True")
                feedback1.text=UsersChoice.toString()
                counter++
                MyTotalScore.text="Score:${counter.toString()}/5"

            }
                else if( Question1.text.toString() == "${Question[2]}"){
                UsersChoice.listIterator().add("True")
                feedback1.text=UsersChoice.toString()
                counter++
                MyTotalScore.text="Score:${counter.toString()}/5"}
                else{
                UsersChoice.listIterator().add("True")
                feedback1.text=UsersChoice.toString()
                }
            }
            FalseButton1.setOnClickListener {
                /*False button when the user clicks on it, its stores False in UsersChoice and
                  whenever the user clicks the button on a certain question it increments
                  the counter
                    */
                if (Question1.text.toString() == "${Question[1]}"){
                    UsersChoice.listIterator().add("False")
                    feedback1.text=UsersChoice.toString()
                    counter++
                    MyTotalScore.text="Score:${counter.toString()}/5"


                } else if (Question1.text.toString() == "${Question[3]}"){
                    UsersChoice.listIterator().add("False")
                    feedback1.text=UsersChoice.toString()
                    counter++
                    MyTotalScore.text="Score:${counter.toString()}/5"}
                else if (Question1.text.toString() == "${Question[4]}"){
                    UsersChoice.listIterator().add("False")
                    feedback1.text=UsersChoice.toString()
                    counter++
                    MyTotalScore.text="Score:${counter.toString()}/5"}
                else{
                    UsersChoice.listIterator().add("False")
                    feedback1.text=UsersChoice.toString()
                }
                }
        Result1.setOnClickListener {
            /*
            Results Button when the user clicks on it displays the Correct answers for every
            questions, but shortly before that it check if you have gotten 3 or above if yes
            it will print great job otherwise keep practicing
             */
        if (counter>=3){

            ReviewMessage="Great Job"
        } else {

            ReviewMessage="Keep Practicing"
        }
            Question1.text=
                "CORRECT ANSWERS\n"+
                "$ReviewMessage\n"+
                "Q1 Answer=${Answer[0]}\n"+
                "Q2 Answer=${Answer[1]}\n"+
                "Q3 Answer=${Answer[2]}\n"+
                "Q4 Answer=${Answer[3]}\n"+
                "Q5 Answer=${Answer[4]}\n"
            BacktoMenu.visibility= View.VISIBLE
            feedback1.visibility= View.GONE
            TrueButton1.visibility= View.GONE
            FalseButton1.visibility= View.GONE
            Result1.visibility= View.GONE
            feedback1.visibility= View.VISIBLE
            MyTotalScore.visibility= View.VISIBLE
            Answer1.visibility= View.VISIBLE
            /*
            Back to menu button appears giving you an option to go to other categories
            and your feedback/user's input comes and your total scores also appears on top
             */
            }

            //Back To menu Button leading to the main menu
        BacktoMenu.setOnClickListener {
            val Intent= Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

            }



        }




