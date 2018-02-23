package swoosh.dev.adrianharitsyah.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league_screen.*
import swoosh.dev.adrianharitsyah.swoosh.R
import swoosh.dev.adrianharitsyah.swoosh.Utilities.LEAGUE_EXTRAS

class LeagueScreen : BaseActivity() {

    var league=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_screen)

        mensToggleButton.setOnClickListener {
            womensToggleButton.isChecked= false
            coEdToggleButton.isChecked=false
            league="mens"
        }

        womensToggleButton.setOnClickListener {
            mensToggleButton.isChecked=false
            coEdToggleButton.isChecked=false
            league="women"
        }

        coEdToggleButton.setOnClickListener {
            mensToggleButton.isChecked=false
            womensToggleButton.isChecked=false
            league="coed"
        }

    }

    fun goToSkill(view:View){
        if(league=="")
            Toast.makeText(this,"League must me choosen",Toast.LENGTH_SHORT).show()
        else {
            val skillIntent = Intent(this, SkillScreen::class.java)
            skillIntent.putExtra(LEAGUE_EXTRAS, league)
            startActivity(skillIntent)
        }
    }


}
