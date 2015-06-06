#pragma once

#include <string>
#include <algorithm>

namespace utils {

	class Date {

	public:
		Date(int day, int month, int year);

		std::string toString() const;

		int getDay() const { return day_; }

		void setDay(int day)
		{
			this->day_ = std::max(1, std::min(getMaxDays(this->month_), day));
		}

		int getMonth() const { return month_; }

		void setMonth(int month)
		{
			this->getMonth = std::max(1, std::min(12, month));
			setDay(this->day_);
		}

		int getYear() const { return year_; }

		void setYear(int year)
		{
			this->year_ = std::max(0, year);
		}

	private:
		int day_, month_, year_;

		static int getMaxDays(int month);

		friend std::ostream &operator<<(std::ostream &, const Date &);

	};

	inline std::ostream &operator<<(std::ostream &strm, const Date &a) {
		return strm << a.toString();
	}

}
