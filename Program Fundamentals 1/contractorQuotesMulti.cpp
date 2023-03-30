// COSC 1436 Example
// Contractor quotes
// This program compares several contractor quotes for repairs in the house
// and finds the best option for each type of repair.

#include <iostream>
#include <iomanip>
#include <fstream>

using namespace std;

// Global Constants
const int NUM_ITEMS = 10; // number of repair items
const int NUM_CONTRACTORS = 5; // maximum number of contractors

// This function reads the contractor names and their quotes from the file.
// Note that the second dimension of the quotes array is the number of
// contractors, not the number of items. Yet each line in the file is
// from ONE contractor and ALL items. This means that as we are reading
// a line of numbers THE FIRST index will be changing with every 
// number that we read and the second one will stay the same. The second
// index will only change when we go to the next line of numbers.
// This is done on purpose because the resulting array (that will be
// returned to the main function) will be used to iterate over quotes 
// from all contractors for the same repair item. One way of thinking
// about it is that we are reading columns from the file (even though 
// in the file itself they look like lines) but once we return to the 
// main function we will be working with lines, not columns.
int readQuotes(string filename, string contractors[], 
    int quotes[][NUM_CONTRACTORS]) {

    // open the file with the quotes
    ifstream fin;
    fin.open(filename);
    
    // The return value is set to 0 initially. If no quotes are read
    // successfully it will remain 0. So this serves as a "pessimistic"
    // defalut return value.
    int ret = 0;
    
    // Check is both files opened successfully
    if (!fin) {
        cout << "error opening " << filename << " for input" << endl;
    } else {
        // Read the quotes
        
        // The loop counter is defined outside the loop scope on purpose
        // because its value gets returned from the function after the
        // loop terminates. This value is how many contractor quotes has
        // been read successfully. 
        int j = 0;
        for (; j <  NUM_CONTRACTORS && fin; ++j) {
            // This breaks out of the loop if there's a problem
            // reading the contractor name or if an EOF is reached
            if (!getline(fin, contractors[j])) {
                break;
            }
            
            // This loop reads quotes for each repair item from 
            // a particular contractor (a line of numbers in the file). 
            // It terminates if there is a problem reading a quote 
            // or if an EOF is reached.
            // NOTE: this loop has no body (nor does it need one).
            for (int i = 0; i < NUM_ITEMS && (fin >> quotes[i][j]); ++i);
            
            // This consumes the endline character after a line of 
            // numbers is read so that the next getline() reads the
            // contractor name instead of just an empty line.
            fin.ignore();
        }
        // Close the file
        fin.close();
        
        // Set the return value to the last value of the loop counter.
        // If the loop ran to completion then it will be equal NUM_ITEMS,
        // and if an error or an EOF occurred before then, then it will
        // be the index of the first unsuccessful quote, which means that
        // quotes from 0 to j-1 were read successfully. The number of
        // quotes from 0 to j-1 is j.
        ret = j;
    }
    return ret;
}

// This function finds the index of the largest value of the array
int findMaxIdx(int arr[], int size) {
    int maxIdx = 0;
    for (int i = 1; i < size; ++i) {
        if (arr[i] > arr[maxIdx]) {
            maxIdx = i;
        }
    }
    return maxIdx;
}


// This function finds the index of the smallest value of the array
int findMinIdx(int arr[], int size) {
    int minIdx = 0;
    for (int i = 1; i < size; ++i) {
        if (arr[i] < arr[minIdx]) {
            minIdx = i;
        }
    }
    return minIdx;
}



int main() {
    // Constants
    const string QUOTES = "quotes.txt";

    // Formatting constants
    const int ITEM_WIDTH = 20;
    const int WIDTH = 15;
    const int DOLLAR_WIDTH = WIDTH - 1;
    
    // Create and initialize the array of repair items
    string items[NUM_ITEMS] {
        "carpet",
        "hardwood",
        "tile",
        "countertop",
        "shower",
        "sinks",
        "faucets",
        "windows",
        "stairs",
        "paint"
    };
    
    // Contractor names
    string contractors[NUM_CONTRACTORS];
    
    // The quotes array. Note that since we will be working with
    // quotes from different contractors for the same repair item
    // the first index will be the repair item and the second - 
    // for the contractor that quoted it.
    int quotes[NUM_ITEMS][NUM_CONTRACTORS];
    
    // After this function call the contractors and the quotes
    // arrays will be populated and the variable numQuotes will
    // be assigned the number of successfully read quotes.
    int numQuotes = readQuotes(QUOTES, contractors, quotes);

    // If an error was encountered (0 successfully read quotes)
    // skip any other processing
    if (numQuotes) {
        // Create an array to to hold the totals of all repair
        // items per contractor and a variable for the total
        // of the best quote
        int totals[NUM_CONTRACTORS];
        int bestTotal = 0;
        
        // Output the header line and set totals to zero
        cout << left;
        cout << setw(ITEM_WIDTH) << "Item";
        for (int j = 0; j < numQuotes; ++j) {
             cout << setw(WIDTH) << contractors[j];
             totals[j] = 0;
        }
        cout << setw(WIDTH) << "bestQuote"
             << setw(WIDTH) << "winner" << endl << endl;
             
        // Create arrays to hold the best quote per item and the name
        // of the contractor who quoted it (wins the bid for the item)
        int bestQuote[NUM_ITEMS];
        string winner[NUM_ITEMS];
        
        // This loop iterates over repair items
        for (int i = 0; i < NUM_ITEMS; ++i) {
            // Determine the cheapest quote per item and choose the winner
            
            // Note that the first argument passed to findMinIdx function
            // is a ONE-DIMENSIONAL array of quotes from all contractors
            // for the same repair item.
            int minIdx = findMinIdx(quotes[i], numQuotes);
            
            // Once we have the index of the best quote for the i-th
            // repair item we can access the actual best quote and the
            // name of the contractor through their respective arrays.
            bestQuote[i] = quotes[i][minIdx];
            winner[i] = contractors[minIdx];

            
            // Output all quotes for the i-th item and add them to 
            // their respective totals
            cout << setw(ITEM_WIDTH) << items[i];
            for (int j = 0; j < numQuotes; ++j) {
                cout << '$' << setw(DOLLAR_WIDTH) << quotes[i][j]; 
                totals[j] += quotes[i][j];
            }
            // output the best quote for the i-th item and add it to
            // the best quote total
            cout << '$' << setw(DOLLAR_WIDTH) << bestQuote[i]
                 << setw(WIDTH) << winner[i] << endl;
            bestTotal += bestQuote[i];
        }
        
        // Output the totals line
        cout << endl << setw(ITEM_WIDTH) << "total";
            for (int j = 0; j < numQuotes; ++j) {
                 cout << '$' << setw(DOLLAR_WIDTH) << totals[j]; 
            }
        cout << '$' << setw(DOLLAR_WIDTH) << bestTotal << endl << endl;
             
        // Find the index of the most expensive item among the
        // best quotes per item
        int maxIdx = findMaxIdx(bestQuote, NUM_ITEMS);
        
        // Use this index to access the name of the item and its
        // best quote and output them to the console
        cout << "The most expensive item: " << items[maxIdx] 
             << " $" << bestQuote[maxIdx] << endl;
        cout << "The best total without it: $" 
             << bestTotal - bestQuote[maxIdx] << endl;
    }
	return 0;
}