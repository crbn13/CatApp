package org.example

class University {
    private var modules = mutableListOf<Module>()
    private var students = mutableListOf<Student>()

    fun findStudentById(id: String): Student? {
        for (i in students) {
            if (i.id == id)
                return i
        }
        return null
    }

    fun enrolStudent(student: Student) {}

    fun findStudentsByName(name: String): List<Student> {
        return listOf<Student>()
    }
}
