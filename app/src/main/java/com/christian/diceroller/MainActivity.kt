package com.christian.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // atribuindo o objeto button a constante rollButton
        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDice() }//Click do botão

    }//fun onCreate

    class Dice(val numSides: Int) {
        /**
         * Função que "joga" o dado.
         * Fazendo cair em um número aleatório
         * que esteja no intervalo de 1 até a quantidade
         * de lados do dado (definido na constante numSides desta classe)
         */
        fun roll(): Int {
            return (1..numSides).random();
        }
    }//class Dice

    private fun rollDice() {
        /** Cria nova instância da classe Dice,
         * passando o numSides (número de lados do dado)
         */
        val dice = Dice(6)
        val diceRoll = dice.roll() //Chama a função que joga o dado

        /**
         * Atualiza o texto do textview a cada "jogada" do dado
         * mostrando o número aleatório
         */
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }//fun rollDice

}// class MainActivity