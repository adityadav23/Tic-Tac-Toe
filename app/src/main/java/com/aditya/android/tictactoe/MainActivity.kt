package com.aditya.android.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.aditya.android.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

        var player = "PLAYER1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            onButtonClick(it as Button)
        }
        binding.button2.setOnClickListener {
            onButtonClick(it as Button)

        }
        binding.button3.setOnClickListener {
            onButtonClick(it as Button)

        }
        binding.button4.setOnClickListener {
            onButtonClick(it as Button)

        }
        binding.button5.setOnClickListener {
            onButtonClick(it as Button)

        }
        binding.button6.setOnClickListener {
            onButtonClick(it as Button)

        }
        binding.button7.setOnClickListener {
            onButtonClick(it as Button)

        }
        binding.button8.setOnClickListener {
            onButtonClick(it as Button)

        }
        binding.button9.setOnClickListener {
            onButtonClick(it as Button)

        }

        binding.buttonReset.setOnClickListener {
            player ="PLAYER1"
            reset()
            disableButton(true)
        }
    }


    fun onButtonClick(btn: Button){
       if(btn.text == "") {
           if (player == "PLAYER1") {
               player = "PLAYER2"
               btn.text = "X"
           }
           else{
               player = "PLAYER1"
               btn.text = "0"
           }
       }
        win()
    }

    fun win(){
        if(binding.button1.text == "X" && binding.button2.text =="X" && binding.button3.text =="X"){
            toast("PLAYER 1")
            disableButton(false)
        }
        if(binding.button4.text == "X" && binding.button5.text =="X" && binding.button6.text =="X"){
            toast("PLAYER 1")
            disableButton(false)

        }
        if(binding.button7.text == "X" && binding.button8.text =="X" && binding.button9.text =="X"){
            toast("PLAYER 1")
            disableButton(false)

        }
        if(binding.button1.text == "0" && binding.button2.text =="0" && binding.button3.text =="0"){
            toast("PLAYER 2")
            disableButton(false)

        }
        if(binding.button4.text == "0" && binding.button5.text =="0" && binding.button6.text =="0"){
            toast("PLAYER 2")
            disableButton(false)


        }
        if(binding.button7.text == "0" && binding.button8.text =="0" && binding.button9.text =="0"){
            toast("PLAYER 2")
            disableButton(false)


        }
        if(binding.button1.text == "X" && binding.button5.text =="X" && binding.button9.text =="X"){
            toast("PLAYER 1")
            disableButton(false)

        }
        if(binding.button1.text == "0" && binding.button5.text =="0" && binding.button9.text =="0"){
            toast("PLAYER 2")
            disableButton(false)


        }
        if(binding.button3.text == "X" && binding.button5.text =="X" && binding.button7.text =="X"){
            toast("PLAYER 1")
            disableButton(false)


        }
        if(binding.button3.text == "0" && binding.button5.text =="0" && binding.button7.text =="0"){
            toast("PLAYER 2")
            disableButton(false)


        }
        if(binding.button1.text == "X" && binding.button4.text =="X" && binding.button7.text =="X"){
            toast("PLAYER 1")
            disableButton(false)


        }
        if(binding.button2.text == "X" && binding.button5.text =="X" && binding.button8.text =="X"){
            toast("PLAYER 1")
            disableButton(false)


        }
        if(binding.button3.text == "X" && binding.button6.text =="X" && binding.button9.text =="X"){
            toast("PLAYER 1")
            disableButton(false)


        }
        if(binding.button1.text == "0" && binding.button4.text =="0" && binding.button7.text =="0"){
            toast("PLAYER 2")
            disableButton(false)


        }
        if(binding.button2.text == "0" && binding.button5.text =="0" && binding.button8.text =="0"){
            toast("PLAYER 2")
            disableButton(false)


        }
        if(binding.button3.text == "0" && binding.button6.text =="0" && binding.button9.text =="0"){
            toast("PLAYER 2")
            disableButton(false)
        }
    }
    fun reset(){
        binding.button1.text = ""
        binding.button2.text = ""
        binding.button3.text = ""
        binding.button4.text = ""
        binding.button5.text = ""
        binding.button6.text = ""
        binding.button7.text = ""
        binding.button8.text = ""
        binding.button9.text = ""
    }
    fun toast(winner:String){
        Toast.makeText(this,"Winner is $winner", Toast.LENGTH_SHORT).show()
    }

    fun disableButton(isEnabled: Boolean){
        binding.button1.isEnabled = isEnabled
        binding.button2.isEnabled = isEnabled
        binding.button3.isEnabled = isEnabled
        binding.button4.isEnabled = isEnabled
        binding.button5.isEnabled = isEnabled
        binding.button6.isEnabled = isEnabled
        binding.button7.isEnabled = isEnabled
        binding.button8.isEnabled = isEnabled
        binding.button9.isEnabled = isEnabled

    }
}