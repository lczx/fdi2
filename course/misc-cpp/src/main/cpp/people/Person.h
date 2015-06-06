#pragma once
#include <string>
#include "../Date.h"

class Person
{

public:
	Person(std::string name, std::string surname, utils::Date date);

	std::string getName() const {
		return name;
	}

	void setName(std::string name) {
		this->name = name;
	}

	std::string getSurname() const {
		return surname;
	}

	void setSurname(const std::string &surname) {
		this->surname = surname;
	}

	const utils::Date &getDate() const {
		return date;
	}

	void setDate(utils::Date date) {
		this->date = date;
	}

	std::string toString() const;

private:
	std::string name, surname;
	utils::Date date;

};
