#include <iostream>
using namespace std;

class Employee {
public:
	string Name;
	string Company;
	int Age;

	void IntroduceYourSelf() {
		std::cout << "Name: " << Name << endl;
		std::cout << "Company: " << Company << endl;
		std::cout << "Age: " << Age << endl;
	}
	Employee(string name, string company, int age) {
		Name = name;
		Company = company;
		Age = age;
	}

};
int main()
{
	Employee employee1 = Employee("sathita", "Black Spacex", 25);
	employee1.IntroduceYourSelf();

	Employee employee2 = Employee("Pramudith", "BAI", 25);
	employee2.IntroduceYourSelf();
}
