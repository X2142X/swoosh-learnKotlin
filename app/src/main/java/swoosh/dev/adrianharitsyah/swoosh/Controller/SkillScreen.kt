package swoosh.dev.adrianharitsyah.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill_screen.*
import swoosh.dev.adrianharitsyah.swoosh.R
import swoosh.dev.adrianharitsyah.swoosh.Utilities.LEAGUE_EXTRAS
import swoosh.dev.adrianharitsyah.swoosh.Utilities.SKILL_EXTRAS

class SkillScreen : AppCompatActivity() {

    var skill=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_screen)

        beginnerToggleButton.setOnClickListener {
            ballerToggleButton.isChecked=false
            skill="Beginner"
        }

        ballerToggleButton.setOnClickListener {
            beginnerToggleButton.isChecked=false
            skill="Baller"
        }

        finishButton.setOnClickListener {
            if(skill==""){
                Toast.makeText(this,"Skill must be choosen",Toast.LENGTH_SHORT).show()
            }else{
                val finishIntent=Intent(this,SearchingScreen::class.java)
                finishIntent.putExtra(LEAGUE_EXTRAS,intent.getStringExtra(LEAGUE_EXTRAS))
                finishIntent.putExtra(SKILL_EXTRAS,skill)
                startActivity(finishIntent)
            }
        }
    }
}
