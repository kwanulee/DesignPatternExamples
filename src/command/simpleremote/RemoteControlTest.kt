package command.simpleremote


fun main(args: Array<String>) {
    val remote = SimpleRemoteControl()
    val light = Light()
    val garageDoor = GarageDoor()
    val lightOn = LightOnCommand(light)
    val garageOpen =
        GarageDoorOpenCommand(garageDoor)

    remote.setCommand(lightOn)
    remote.buttonWasPressed()
    remote.setCommand(garageOpen)
    remote.buttonWasPressed()
}
