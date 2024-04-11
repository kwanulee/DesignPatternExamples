package facade.hometheater

class LGDvdPlayer(var description: String, var amplifier: Amplifier) {
    var currentTrack: Int = 0

    fun on() {
        println("$description on")
    }


    fun off() {
        println("$description off")
    }


    fun eject() {
        println("$description eject")
    }


    fun play() {
        println("$description playing track $currentTrack")
    }

    fun previous() {
        if (currentTrack > 0) --currentTrack
    }

    fun next() {
        if (currentTrack < MAXTRACK) ++currentTrack
    }


    fun stop() {
        currentTrack = 0
        println("$description stopped \"")
    }


    fun pause() {
        println("$description paused \"")
    }


    fun setTwoChannelAudio() {
        println("$description set two channel audio")
    }

    companion object {
        const val MAXTRACK: Int = 10
    }
}

