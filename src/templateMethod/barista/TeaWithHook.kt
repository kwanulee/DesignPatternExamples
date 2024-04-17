package templateMethod.barista

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*


class TeaWithHook : CaffeineBeverageWithHook() {
     override fun brew() {
        println("Steeping the tea")
    }

     override fun addCondiments() {
        println("Adding Lemon")
    }

     override fun customerWantsCondiments(): Boolean {
        val answer = getUserInput()

        return answer.lowercase(Locale.getDefault()).startsWith("y")
    }

    private fun getUserInput() : String{
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
