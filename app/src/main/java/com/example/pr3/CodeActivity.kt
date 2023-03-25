package com.example.pr3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class CodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var constraintLayout = ConstraintLayout(this)

        val margin80dp =  TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 80F, resources.displayMetrics).toInt()

        var layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT)
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.setMargins(0,margin80dp,0,0)

        var textView = TextView(this)
        textView.text = "Hello my friend!"
        textView.textSize = 26F
        textView.layoutParams = layoutParams
        constraintLayout.addView(textView)

        setContentView(constraintLayout)
    }
}