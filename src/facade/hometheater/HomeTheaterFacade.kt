package facade.hometheater

class HomeTheaterFacade(
    var amp: Amplifier,
    var tuner: Tuner,
    var dvd: DvdPlayer,
    var cd: CdPlayer,
    var projector: Projector,
    var screen: Screen,
    var lights: TheaterLights,
    var popper: PopcornPopper
) {
    fun watchMovie(movie: String) {
        println("Get ready to watch a movie...")
        popper.on()
        popper.pop()
        lights.dim(10)
        screen.down()
        projector.on()
        projector.wideScreenMode()
        amp.on()
        amp.dvd = dvd
        amp.setSurroundSound()
        amp.setVolume(5)
        dvd.on()
        dvd.setSurroundAudio()
        dvd.play(movie)
    }


    fun endMovie() {
        println("Shutting movie theater down...")
        popper.off()
        lights.on()
        screen.up()
        projector.off()
        amp.off()
        dvd.stop()
        dvd.eject()
        dvd.off()
    }

    fun listenToCd(cdTitle: String) {
        println("Get ready for an audiopile experence...")
        lights.on()
        amp.on()
        amp.setVolume(5)
        amp.cd = cd
        amp.setStereoSound()
        cd.on()
        cd.play(cdTitle)
    }

    fun endCd() {
        println("Shutting down CD...")
        amp.off()
        amp.cd = cd
        cd.eject()
        cd.off()
    }

    fun listenToRadio(frequency: Double) {
        println("Tuning in the airwaves...")
        tuner.on()
        tuner.frequency = frequency
        amp.on()
        amp.setVolume(5)
        amp.tuner = tuner
    }

    fun endRadio() {
        println("Shutting down the tuner...")
        tuner.off()
        amp.off()
    }
}
