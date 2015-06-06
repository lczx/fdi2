#include "IntegerStack.h"

IntegerStack::IntegerStack(int size)
	: values(new int[size]), values_length(size) { }

IntegerStack::~IntegerStack()
{
	delete[] values;
}

bool IntegerStack::push(int value)
{
	if (counter < values_length) {
		this->values[counter++] = value; // Counter is used, then incremented
		return true; // Success
	}
	return false; // Fail
}

int IntegerStack::pop()
{
	if (counter > 0)
		return this->values[--counter];

	return 0;
}
