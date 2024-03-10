package decorator.io

import java.io.*

class LowerCaseInputStream(`in`: InputStream?) : FilterInputStream(`in`) {
    @Throws(IOException::class)
    override fun read(): Int {
        val c = `in`.read()
        return (if (c == -1) c else c.toChar().lowercaseChar().code)
    }

    @Throws(IOException::class)
    override fun read(b: ByteArray, offset: Int, len: Int): Int {
        val result = `in`.read(b, offset, len)
        for (i in offset until offset + result) {
            b[i] = Char(b[i].toUShort()).lowercaseChar().code.toByte()
        }
        return result
    }
}
