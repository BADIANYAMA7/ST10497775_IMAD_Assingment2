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
var Questions3=arrayOf("JavaScript is primarily used for backend development.","A firewall is a software or hardware tool that helps protect a network by controlling incoming and outgoing traffic."," Phishing is a type of attack where an attacker tries to gain sensitive information by disguising themselves as a trustworthy entity."," In a computer network, an IP address is used to identify a specific device on the network."," SQL (Structured Query Language) is used to design the user interface of a website.")
var Answers3=arrayOf("False","True","True","True","False")
var Userchoice3=arrayListOf<String>("")
class Quizz3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quizz3)
        var MyTotal=findViewById<TextView>(R.id.Score3)
        var Score=0
        MyTotal.text="Score$Score/5"
        var index3 = 1
        var ReviewMessage3=""
        var feedback3 = findViewById<TextView>(R.id.feedback3)
        var Question3 = findViewById<TextView>(R.id.Question3)
        var TrueButton3= findViewById<Button>(R.id.TrueButton3)
        var FalseButton3 = findViewById<Button>(R.id.FalseButton3)
        var StartButton3 = findViewById<Button>(R.id.Start3)
        var Result3=findViewById<Button>(R.id.Result3)
        var BacktoMenu3=findViewById<Button>(R.id.BackToMenu3)
        var QuestionButton3= findViewById<Button>(R.id.QuestionButton3)
        var Answer3=findViewById<TextView>(R.id.Answer3)
        //Start Button To Start The Game
        StartButton3.setOnClickListener {
            Question3.visibility = View.VISIBLE
            TrueButton3.visibility = View.VISIBLE
            FalseButton3.visibility = View.VISIBLE
            StartButton3.visibility = View.GONE
            QuestionButton3.visibility = View.VISIBLE



        }
        //Assigning The Feedback Textview to contain the user's choice
        feedback3.text=Userchoice3.toString()
        //Assigning the Question's textview to the first question when you click the start button
        Question3.text = za.co.varsitycollege.st10497775.flashmaster.Questions3[0]
        //Next Button To Move on the next question when your done
        QuestionButton3.setOnClickListener {
            Question3.text = za.co.varsitycollege.st10497775.flashmaster.Questions3[index3]
            index3 = index3 + 1
            if (index3 == 5) {
                Result3.visibility= View.VISIBLE
                QuestionButton3.visibility = View.GONE
                //When it reaches the last question it will make the results button appear
            }
        }
        TrueButton3.setOnClickListener {
            /*True button when the user clicks on it, its stores True it in UsersChoice and
            whenever the user clicks the button on a certain question it increments
            the counter
             */
            if (Question3.text.toString() == "${za.co.varsitycollege.st10497775.flashmaster.Questions3[1]}") {
                Userchoice3.listIterator().add("True")
                feedback3.text=Userchoice3.toString()
                Score++
                MyTotal.text="Score:${Score.toString()}/5"

            }
            else if( Question3.text.toString() == "${za.co.varsitycollege.st10497775.flashmaster.Questions3[2]}"){
                Userchoice3.listIterator().add("True")
                feedback3.text=Userchoice3.toString()
                Score++
                MyTotal.text="Score:${Score.toString()}/5"}
            else if( Question3.text.toString() == "${za.co.varsitycollege.st10497775.flashmaster.Questions3[3]}"){
                Userchoice3.listIterator().add("True")
                feedback3.text=Userchoice3.toString()
                Score++
                MyTotal.text="Score:${Score.toString()}/5"}

            else{
                Userchoice3.listIterator().add("True")
                feedback3.text=Userchoice3.toString()
            }
        }
        FalseButton3.setOnClickListener {
            /*False button when the user clicks on it, its stores False in UsersChoice and
              whenever the user clicks the button on a certain question it increments
              the counter
                */
            if (Question3.text.toString() == "${za.co.varsitycollege.st10497775.flashmaster.Questions3[0]}"){
                Userchoice3.listIterator().add("False")
                feedback3.text=Userchoice3.toString()
                Score++
                MyTotal.text="Score:${Score.toString()}/5"}

            else if (Question3.text.toString() == "${za.co.varsitycollege.st10497775.flashmaster.Questions3[4]}"){
                Userchoice3.listIterator().add("False")
                feedback3.text=Userchoice3.toString()
                Score++
                MyTotal.text="Score:${Score.toString()}/5"}
            else{
                Userchoice3.listIterator().add("Flase")
                feedback3.text=Userchoice3.toString()
            }
        }
        Result3.setOnClickListener {
            /*
            Results Button when the user clicks on it displays the Correct answers for every
            questions, but shortly before that it check if you have gotten 3 or above if yes
            it will print great job otherwise keep practicing
             */
            if (Score>=3){

                ReviewMessage3="Great Job"
            } else {

                ReviewMessage3="Keep Practicing"
            }
            Question3.text=
                "CORRECT ANSWERS\n"+
                        "$ReviewMessage3\n"+
                        "Q1 Answer=${Answers3[0]}\n"+
                        "Q2 Answer=${Answers3[1]}\n"+
                        "Q3 Answer=${Answers3[2]}\n"+
                        "Q4 Answer=${Answers3[3]}\n"+
                        "Q5 Answer=${Answers3[4]}\n"
            BacktoMenu3.visibility= View.VISIBLE
            TrueButton3.visibility= View.GONE
            FalseButton3.visibility= View.GONE
            Result3.visibility= View.GONE
            MyTotal.visibility= View.VISIBLE
            Answer3.visibility= View.VISIBLE
            feedback3.visibility= View.VISIBLE

            /*
            Back to menu button appears giving you an option to go to other categories
            and your feedback/user's input comes and your total scores also appears on top
             */
        }

        //Back To menu Button leading to the main menu
        BacktoMenu3.setOnClickListener {
            val Intent= Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

    }



    }
