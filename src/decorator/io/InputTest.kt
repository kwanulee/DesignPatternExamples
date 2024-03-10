package decorator.io

import java.io.BufferedInputStream
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream


fun main(args: Array<String>) {
    var c: Int

    try {
        val `in`: InputStream =
            LowerCaseInputStream(
                BufferedInputStream(
                    FileInputStream("files/test.txt")
                )
            )

        while ((`in`.read().also{c = it }) >= 0) {
       // while ((c = `in`.read())>=0)
            print(c.toChar())
        }

        `in`.close()
    } catch (e: IOException) {
        e.printStackTrace()
    }
}

