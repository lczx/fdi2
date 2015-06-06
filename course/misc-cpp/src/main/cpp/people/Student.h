#pragma once
#include "Person.h"

class Student : public Person
{

public:
	Student(std::string name, std::string surname, utils::Date date, int studentId);

private:
	int studentId;

};
