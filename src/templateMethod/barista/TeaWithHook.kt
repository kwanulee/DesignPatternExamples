package templateMethod.barista

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*


class TeaWithHook : CaffeineBeverageWithHook() {
    public override fun brew() {
        println("Steeping the tea")
    }

    public override fun addCondiments() {
        println("Adding Lemon")
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
            // get the user's response
            var answer: String? = null

            print("Would you like lemon with your tea (y/n)? ")

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
