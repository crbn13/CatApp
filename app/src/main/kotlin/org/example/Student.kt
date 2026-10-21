package org.example

abstract class Student(val id: String, val name: String, var course: String, markIn: Double) {
    var mark: Double = 0.0
        set(newMark) {
            if (newMark in 1.0..100.0) {
                field = newMark
            }
        }

    init {
        mark = markIn
    }

    abstract public fun getGrade(): String

    public fun didPass(): Boolean {
        return mark >= 40.0
    }

    override fun toString(): String {
        return "ID: $id, Name: $name, Course: $course, Mark $mark"
    }
}
