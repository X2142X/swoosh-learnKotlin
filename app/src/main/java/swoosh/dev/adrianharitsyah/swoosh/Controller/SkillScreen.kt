package swoosh.dev.adrianharitsyah.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill_screen.*
import swoosh.dev.adrianharitsyah.swoosh.Model.Player
import swoosh.dev.adrianharitsyah.swoosh.R
import swoosh.dev.adrianharitsyah.swoosh.Utilities.EXTRA_PLAYER

class SkillScreen : AppCompatActivity() {

    lateinit var player:Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_screen)
        player=intent.getParcelableExtra(EXTRA_PLAYER)

        beginnerToggleButton.setOnClickListener {
            ballerToggleButton.isChecked=false
            player.skill="Beginner"
        }

        ballerToggleButton.setOnClickListener {
            beginnerToggleButton.isChecked=false
            player.skill="Baller"
        }

        finishButton.setOnClickListener {
            if(player.skill==""){
                Toast.makeText(this,"Skill must be choosen",Toast.LENGTH_SHORT).show()
            }else{
                val finishIntent=Intent(this,SearchingScreen::class.java)
                finishIntent.putExtra(EXTRA_PLAYER,player)
                startActivity(finishIntent)
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState!=null)
            player=savedInstanceState.getParcelable(EXTRA_PLAYER)
    }
}
