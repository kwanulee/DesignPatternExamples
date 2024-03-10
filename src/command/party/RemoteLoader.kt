package command.party

import java.util.*


fun main(args: Array<String>) {
    val remoteControl = RemoteControl()

    val light = Light("Living Room")
    val tv = TV("Living Room")
    val stereo = Stereo("Living Room")
    val hottub = Hottub()

    val lightOn = LightOnCommand(light)
    val stereoOn = StereoOnCommand(stereo)
    val tvOn = TVOnCommand(tv)
    val hottubOn = HottubOnCommand(hottub)
    val lightOff = LightOffCommand(light)
    val stereoOff = StereoOffCommand(stereo)
    val tvOff = TVOffCommand(tv)
    val hottubOff = HottubOffCommand(hottub)

    val partyOn = arrayOf(lightOn, stereoOn, tvOn, hottubOn)
    val partyOff = arrayOf(lightOff, stereoOff, tvOff, hottubOff)

    val partyOnMacro = MacroCommand(partyOn)
    val partyOffMacro = MacroCommand(partyOff)

    remoteControl.setCommand(0, partyOnMacro, partyOffMacro)
    remoteControl.setCommand(1, lightOn, lightOff)
    remoteControl.setCommand(2, stereoOn, stereoOff)
    remoteControl.setCommand(3, tvOn, tvOff)
    remoteControl.setCommand(4, hottubOn, hottubOff)

    do {
        println(remoteControl)
        val scan = Scanner(System.`in`)
        print("괄호 안의 버튼 번호를 입력하시오:")
        val input = scan.next()
        when (input) {
            "0" -> {
                println("--- Pushing Macro On---")
                remoteControl.onButtonWasPushed(0)
            }

            "1" -> {
                println("--- Pushing Macro Off---")
                remoteControl.offButtonWasPushed(0)
            }

            "2" -> {
                println("--- Pushing Light On---")
                remoteControl.onButtonWasPushed(1)
            }

            "3" -> {
                println("--- Pushing Light Off---")
                remoteControl.offButtonWasPushed(1)
            }

            "4" -> {
                println("--- Pushing Stereo On---")
                remoteControl.onButtonWasPushed(2)
            }

            "5" -> {
                println("--- Pushing Stereo Off---")
                remoteControl.offButtonWasPushed(2)
            }

            "6" -> {
                println("--- Pushing TV On---")
                remoteControl.onButtonWasPushed(3)
            }

            "7" -> {
                println("--- Pushing TV Off---")
                remoteControl.offButtonWasPushed(3)
            }

            "8" -> {
                println("--- Pushing Hot Tub On---")
                remoteControl.onButtonWasPushed(4)
            }

            "9" -> {
                println("--- Pushing Hot Tub Off---")
                remoteControl.offButtonWasPushed(4)
            }

            "14" -> {
                println("--- Undo ---")
                remoteControl.undoButtonWasPushed()
            }
        }
    } while (true)
}

