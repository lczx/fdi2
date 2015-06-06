#include "Person.h"

#include <sstream>

Person::Person(std::string name, std::string surname, utils::Date date)
	: name(name), surname(surname), date(date) { }

std::string Person::toString() const
{
	std::ostringstream out;
	out << name << ' ' << surname << ' ' << date;
	return out.str();
}
