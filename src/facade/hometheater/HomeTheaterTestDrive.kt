package facade.hometheater


fun main(args: Array<String>) {
    val amp = Amplifier("Top-O-Line Amplifier")
    val tuner = Tuner("Top-O-Line AM/FM Tuner", amp)
    val dvd = DvdPlayer("Top-O-Line DVD Player", amp)
    val cd = CdPlayer("Top-O-Line CD Player", amp)
    val projector = Projector("Top-O-Line Projector", dvd)
    val lights = TheaterLights("Theater Ceiling Lights")
    val screen = Screen("Theater Screen")
    val popper = PopcornPopper("Popcorn Popper")

    val homeTheater =
        HomeTheaterFacade(
            amp, tuner, dvd, cd,
            projector, screen, lights, popper
        )

    homeTheater.watchMovie("Raiders of the Lost Ark")
    homeTheater.endMovie()
}

