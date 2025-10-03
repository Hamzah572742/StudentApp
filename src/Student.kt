abstract class Student(val id: String, val name: String, val course: String) {

    var mark: Double = 0.0
        set(newmark) {
            if (newmark in 0.0..100.0) field = newmark
            else println("Error: mark must be 0–100")
        }

    abstract fun getGrade(): String

    fun didPass(): Boolean {
        return mark >= 40.0
    }

    override fun toString(): String {
        return "ID: $id, Name: $name, Course: $course, Mark: $mark"
    }
}

class Undergraduate(id: String, name: String, course: String) : Student(id, name, course) {

    override fun getGrade(): String {
        val grade = when (mark) {
            in 70.0..100.0 -> "First"
            in 60.0..69.9 -> "2/1"
            in 50.0..59.9 -> "2/2"
            in 40.0..49.9 -> "Third"
            else -> "Fail"
        }
        return grade
    }
}

class Masters(id: String, name: String, course: String) : Student(id, name, course) {

    override fun getGrade(): String {
        val grade = when (mark) {
            in 70.0..100.0 -> "Distinction"
            in 60.0..69.9 -> "Merit"
            in 40.0..59.9 -> "Pass"
            else -> "Fail"
        }
        return grade
    }
}