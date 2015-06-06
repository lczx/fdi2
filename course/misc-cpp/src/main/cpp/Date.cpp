#include "Date.h"

#include <sstream>

using namespace utils;

Date::Date(int day, int month, int year)
{
	setDay(day);
	setMonth(month);
	setYear(year);
}

std::string Date::toString() const
{
	std::ostringstream out;
	out << '(' << day_ << ',' << month_ << ',' << year_ << ')';
	return out.str();
}

int Date::getMaxDays(int month)
{
	int maxDays = 31;

	switch (month) {
	case 4: case 6: case 9: case 11:
		maxDays = 30;
		break;
	case 2:
		maxDays = 28; // February always 28?? Nah
		break;
	}
	return maxDays;
}
