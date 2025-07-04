#include<iostream>
#include<iomanip>
#include<string>
using namespace std;

struct car {

	string brand;
	int year;
	string colour;
	double price;

};

void input_data(car cars[], const int amount) {

	for (int i = 0; i < amount; i++) {

		cout << "brand: "; cin>> cars[i].brand;
		cout << "\nyear: "; cin >> cars[i].year;
		cout << "\ncolour: "; cin>>cars[i].colour;
		cout << "\nprice: "; cin >> cars[i].price;
		cout << "\n";
	}

}

void output_data(car cars[], const int amount) {

	cout << "\n\nbrand\tyear\tcolour\tprice\n";

	for (int i = 0; i < amount; i++) {

		cout<<left<<setw(5) << cars[i].brand<<"\t";
		cout<<left<<setw(5) << cars[i].year<<"\t ";
		cout<<left<<setw(5) << cars[i].colour<<"\t";
		cout<<left<<setw(5) << cars[i].price<<"\t ";
		cout << "\n";
	}
}


car buff;

void sorting_by_year(car cars[], const int amount, const char*S) {

	cout << S << "\n\n";

	for (int i = 0; i < amount; i++) {

		for (int j = 0; j < amount; j++) {

			if (cars[j-1].year>cars[j].year) {

				buff= cars[j - 1];
			    cars[j - 1]=cars[j] ;
				cars[j] = buff;

			}
		}
	}
}

int main() {

	car cars[30];

	int amount;
	cout << "Define the number of the cars: "; cin >> amount;

	input_data(cars, amount);
	sorting_by_year(cars, amount, "Sorted by year");
	output_data(cars, amount);

	return 0;
}
