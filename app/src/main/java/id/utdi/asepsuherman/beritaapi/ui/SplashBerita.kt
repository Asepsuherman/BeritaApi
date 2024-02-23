package id.utdi.asepsuherman.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import id.utdi.asepsuherman.beritaapi.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashBerita : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        lifecycleScope.launch {
            delay(3000)
            navigateToNewsActivity()
        }
    }

    private fun navigateToNewsActivity() {
        val intent = Intent(this, NewsActivity::class.java)
        startActivity(intent)
        finish()
    }
}