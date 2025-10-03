fun main() {
    while (true){
        println("Enter your name: (or type quit to exit)")
        val name= readLine() ?: ""

        if (name=="quit"){
            break

        }
        println("Enter your id")
        val id= readln()


        println("Enter your course")
        val course= readln()

        println("Enter your mark")
        val mark= readln().toDoubleOrNull() ?: 0.0

        val student=Student(id, name, course)

        println(student)
        println(student.getGrade())
        println(student.didPass())

    }
    println("Program finished")
}