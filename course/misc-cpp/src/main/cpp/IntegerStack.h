#pragma once

class IntegerStack {

public:
	IntegerStack(int size);
	~IntegerStack();

	bool push(int value);
	int pop();

private:
	int counter = 0;
	int *values;
	size_t values_length;

};
