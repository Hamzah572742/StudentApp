fun main() {
    while (true) {
        println("Do you want an undergraduate or master (or type quit to exit)")
        val type = readLine()

        if (type == "quit") {
            break

        }

        println("Enter your name: (or type quit to exit)")
        val name = readLine() ?: ""

        if (name == "quit") {
            break

        }
        println("Enter your id")
        val id = readln()


        println("Enter your course")
        val course = readln()

        println("Enter your mark")
        val mark = readln().toDoubleOrNull() ?: 0.0

        val student:Student= if (type== "undergraduate"){
            Undergraduate(id,name,course)
        }
        else{
            Masters(id,name,course)
        }

        student.mark = mark

        println(student)
        println(student.getGrade())
    }
    println("Program finished")
}