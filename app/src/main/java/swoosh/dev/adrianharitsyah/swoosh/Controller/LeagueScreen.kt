package swoosh.dev.adrianharitsyah.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league_screen.*
import swoosh.dev.adrianharitsyah.swoosh.Model.Player
import swoosh.dev.adrianharitsyah.swoosh.R
import swoosh.dev.adrianharitsyah.swoosh.Utilities.EXTRA_PLAYER

class LeagueScreen : BaseActivity() {

    var player=Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_screen)


        mensToggleButton.setOnClickListener {
            womensToggleButton.isChecked= false
            coEdToggleButton.isChecked=false
            player.league="mens"
        }

        womensToggleButton.setOnClickListener {
            mensToggleButton.isChecked=false
            coEdToggleButton.isChecked=false
            player.league="women"
        }

        coEdToggleButton.setOnClickListener {
            mensToggleButton.isChecked=false
            womensToggleButton.isChecked=false
            player.league="coed"
        }

    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null)
            player=savedInstanceState.getParcelable(EXTRA_PLAYER)
    }

    fun goToSkill(view:View){
        if(player.league=="")
            Toast.makeText(this,"League must me choosen",Toast.LENGTH_SHORT).show()
        else {
            val skillIntent = Intent(this, SkillScreen::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillIntent)
        }
    }


}
