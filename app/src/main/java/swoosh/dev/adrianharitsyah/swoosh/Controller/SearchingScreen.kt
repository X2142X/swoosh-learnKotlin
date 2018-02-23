package swoosh.dev.adrianharitsyah.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_searching_screen.*
import swoosh.dev.adrianharitsyah.swoosh.R
import swoosh.dev.adrianharitsyah.swoosh.Utilities.LEAGUE_EXTRAS
import swoosh.dev.adrianharitsyah.swoosh.Utilities.SKILL_EXTRAS

class SearchingScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searching_screen)

        loadingText.setText("Looking for ${intent.getStringExtra(LEAGUE_EXTRAS)} ${intent.getStringExtra(SKILL_EXTRAS)} league near you")
    }
}
