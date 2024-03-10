package templateMethod.barista

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*


class CoffeeWithHook : CaffeineBeverageWithHook() {
    public override fun brew() {
        println("Dripping Coffee through filter")
    }

    public override fun addCondiments() {
        println("Adding Sugar and Milk")
    }

    public override fun customerWantsCondiments(): Boolean {
        val answer = userInput

        return if (answer.lowercase(Locale.getDefault()).startsWith("y")) {
            true
        } else {
            false
        }
    }

    private val userInput: String
        get() {
            var answer: String? = null

            print("Would you like milk and sugar with your coffee (y/n)? ")

            val `in` = BufferedReader(InputStreamReader(System.`in`))
            try {
                answer = `in`.readLine()
            } catch (ioe: IOException) {
                System.err.println("IO error trying to read your answer")
            }
            if (answer == null) {
                return "no"
            }
            return answer
        }
}
