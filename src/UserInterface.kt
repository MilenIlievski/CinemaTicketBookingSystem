class UserInterface {
    fun start() {
        while (true) {
            println("Welcome to cinema system")
            println()
            println("1. Login")
            println("2. Exit")
            val input = readln()
            if (!input.equals("1") && !input.equals("2")) {
                println("Please enter a valid number")
                continue
            }
            if (input.equals("1")){
                continue
            }
            if (input.equals("2")) {
                break
            }
            else{
                println(".....")
                continue
            }

        }
    }
}