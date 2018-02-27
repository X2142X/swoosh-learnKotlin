package swoosh.dev.adrianharitsyah.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_searching_screen.*
import swoosh.dev.adrianharitsyah.swoosh.Model.Player
import swoosh.dev.adrianharitsyah.swoosh.R
import swoosh.dev.adrianharitsyah.swoosh.Utilities.EXTRA_PLAYER

class SearchingScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searching_screen)

        var player=intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        loadingText.setText("Looking for ${player.league} ${player.skill} league near you")
    }
}
