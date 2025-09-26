class Student (idIn:String,nameIn:String,courseIn:String,markIn:Double){

    val id: String
    val name: String
    val course: String
    val mark: Double

    init {
        id= idIn
        name= nameIn
        course= courseIn
        mark= markIn
    }

    override fun toString(): String {
        return "id=$id,name=$name,course=$course,mark=$mark)"
    }
}
