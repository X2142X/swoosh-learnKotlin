package swoosh.dev.adrianharitsyah.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome_screen.*
import swoosh.dev.adrianharitsyah.swoosh.R

class WelcomeScreen : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        getStartedButton.setOnClickListener {
            val leagueIntent=Intent(this, LeagueScreen::class.java)
            startActivity(leagueIntent)
        }
    }
}
