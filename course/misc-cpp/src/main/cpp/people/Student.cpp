#include "Student.h"

Student::Student(std::string name, std::string surname, utils::Date date, int studentId)
	: Person(name, surname, date), studentId(studentId) { }