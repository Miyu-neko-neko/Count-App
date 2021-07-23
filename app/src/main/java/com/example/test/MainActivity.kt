package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    //メソッド定義
    var calc: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//ボタン処理の実装
        clearButton.setOnClickListener(this)
        tasu1button.setOnClickListener(this)
        tasu10button.setOnClickListener(this)
        tasu20button.setOnClickListener(this)
        hiku1button.setOnClickListener(this)
        hiku10button.setOnClickListener(this)
        hiku20button.setOnClickListener(this)
    }

    override  fun onClick(v: View?){
        //textをString型に変換してからInt型に変換
        calc = textView.text.toString().toInt()

        when(v?.id){
            R.id.tasu1button
            -> calc += 1
            R.id.tasu10button
            -> calc += 10
            R.id.tasu20button
            -> calc += 20
            R.id.hiku1button
            -> calc -= 1
            R.id.hiku10button
            -> calc -= 10
            R.id.hiku20button
            -> calc -= 20
            R.id.clearButton
            -> calc = 0

        }
//0より小さかったら0になる
        if (calc < 0){
            calc = 0
        }
        textView.text = calc.toString()

    }
}