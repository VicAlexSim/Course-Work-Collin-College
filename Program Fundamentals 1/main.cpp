//DailySupplementCost.cpp: This program calculates the cost of feeding my horse daily with the 3 rates given
//Name: Victor Sim
//Class Section: Online COSC 1436 (Programming Fundamentals 1)
//Date: 9/18/21
#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>
#include <cstdlib>
#include <ctime>
using namespace std;

int main()
{
// Declare / define / initialize variables
        double Original_Price_Per_Pound = 0;
        double rate1_in_ounces = 0, rate2_in_ounces = 0, rate3_in_ounces = 0;
        const double Lb_to_Oz = 16;
        double BO1 = 0, BO2 = 0, BO3 = 0;
	
// Prompt user to input rate per pound of horse supplement	
        cout << "Enter the price per lb: $";
        cin >> Original_Price_Per_Pound;

// Option 1 Calculation

        rate1_in_ounces = Original_Price_Per_Pound / Lb_to_Oz;
        

// Option 2 Calculation

		rate2_in_ounces = (Original_Price_Per_Pound - (0.1 * Original_Price_Per_Pound)) / Lb_to_Oz;
		

// Option 3 Calculation

        rate3_in_ounces = (Original_Price_Per_Pound - (0.15 * Original_Price_Per_Pound)) / Lb_to_Oz;
			

//Display output or cost rate to the console
    cout << "Buying option" << setw(16) << "1 lb" << setw(6) << "10 lb" << setw(6) << "20 lb" << endl;
    cout << "Cost per day ($)" << setw(13)<< setprecision(2) << fixed << rate1_in_ounces << setw(6) << rate2_in_ounces << setw(6) << rate3_in_ounces << endl;
    
    return 0;
}


