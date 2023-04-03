class StudentList {
    private val students: MutableList<String> = ArrayList()
    fun remove(name: String) {
        students.remove(name)
    }

    fun add(name: String) {
        students.add(name)
    }

    fun removeAll() {
        students.clear()
    }

    fun sizeOfStudent(): Int {
        return students.size
    }
}