#include <iostream>

#include "Date.h"

int main(int argc, char *argv[])
{
	utils::Date date(20, 34, 12);
	std::cout << date.getMonth() << '\n';

	date.setMonth(-4);
	std::cout << date.getMonth() << '\n';

	for (auto m = 1; m < 13; ++m) {
		date.setMonth(m);
		date.setDay(50);
		std::cout << date << '\n';
	}

    std::cin.ignore();
    return 0;
}
