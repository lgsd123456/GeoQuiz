package cn.com.pax.lg.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener {
            view: View ->
            displayTip(R.string.correct_toast)
        }

        falseButton.setOnClickListener {
            view: View ->
            displayTip(R.string.incorrect_toast)
        }
    }

    private fun displayTip(id: Int) {
        val tost = Toast.makeText(this, id, Toast.LENGTH_SHORT)
        tost.setGravity(Gravity.TOP, 0, 0)
        tost.show()
    }
}
