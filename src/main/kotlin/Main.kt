fun main(args: Array<String>) {

    var Entry_Num: Int = 1
    var Room1 = "Standard Room & non-smoking"
    var Room2 = "Standard Room & smoking"
    var Room3 = "Suite & non-smoking"
    var Room4 = "Suite & smoking"
    var Room5 = "Handicapped Accessible"
    var Room_Unk = "Invalid Selection"
    var User_Select = "X"

    do {
        println("Hotel room type options:")
        println("   1. $Room1")
        println("   2. $Room2")
        println("   3. $Room3")
        println("   4. $Room4")
        println("   5. $Room5")
        println("   6. Exit")
        print("Select your hotel room preference: ")
        Entry_Num = readLine()!!.toInt();

        // I know this can be done much nicer, but for still learning Kotlin, I will go with this
        when (Entry_Num) {
            1 -> User_Select = Room1
            2 -> User_Select = Room2
            3 -> User_Select = Room3
            4 -> User_Select = Room4
            5 -> User_Select = Room5
            6 -> User_Select = "Exit"
            else -> User_Select = Room_Unk
        }
        if (Entry_Num != 6) {
            println("You have selected $User_Select")
            println()
        }
    } while (Entry_Num != 6)

    println("Program arguments: ${args.joinToString()}")
}