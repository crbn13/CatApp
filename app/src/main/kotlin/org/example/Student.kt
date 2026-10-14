package org.example

class Student(val id: String, val name: String, var course: String, var mark: Double) {

    public fun getGrade(): String {
        return when (mark) {
            in 70.0..100.0 -> "First"
            in 60.0..70.0 -> "2/1"
            in 50.0..60.0 -> "2/2"
            in 40.0..50.0 -> "Third"
            in 0.0..40.0 -> "Fail"
            else -> "🤨"
        }
    }

    public fun didPass(): Boolean {
        return mark >= 40.0
    }

    override fun toString(): String {
        return "ID: $id, Name: $name, Course: $course, Mark $mark"
    }
}
