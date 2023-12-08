package com.example.project3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun piccity(view: View) {
        displayImageResource(R.drawable.city)
    }

    private fun displayImageResource(ResId: Int) {
        center.setImageResource(ResId)
    }

    fun piccastle(view: View) {
        displayImageResource(R.drawable.castle)
    }
    fun picspace(view: View) {
        displayImageResource(R.drawable.space)
    }
}
