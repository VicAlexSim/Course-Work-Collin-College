#include <iostream>
#include <fstream>
#include <iomanip>
#include <string>
#include <cstdlib>
#include <string>

using namespace std;

//Constants defined
const int MAX_ATHLETES = 10;
const int MAX_SCORES = 10;
const int MAX_SCORE_RANGE = 10;
const int MIN_SCORE_RANGE = 0;
const int END_PROGRAM = 0;
const int SUBSCRIPT_ADJUSTMENT = 1;
const int HUNDREDTHS_PLACE = 2;
const int EXIT_SUCCESSFUL = 0;
const int EXIT_UNSUCCESSFUL = 1;
const string errorFlag = "Error";


//Arrays Declared for Reference
string athleteNames[MAX_ATHLETES];
double athleteScores[MAX_ATHLETES][MAX_SCORES];
string error[MAX_ATHLETES];

//Function prototypes declared
int readFile(string fileName, string athleteNames[], double athleteScores[][MAX_SCORES], string error[], int MAX_ATHLETES);
void processor(string athleteNames[], double athleteScores[][MAX_SCORES],  int MAX_ATHLETES);

int main()
{

string fileName = "";

cout << "Please enter the scorecard name: ";
cin >> fileName;
cout << endl;


readFile(fileName, athleteNames, athleteScores, error, MAX_ATHLETES);
processor(athleteNames, athleteScores, MAX_ATHLETES);

return END_PROGRAM;
}

int readFile(string fileName, string athleteNames[], double athleteScores[][MAX_SCORES], string error[], int MAX_ATHLETES) {

    //Variables
    int index = 0;
    string emptyString = "";

    ifstream inputFile;

    inputFile.open(fileName);

    if(!inputFile){
        cout << "ERROR: the scorecard " << fileName << " could not be opened";
        exit(EXIT_SUCCESSFUL);
    }

    if(inputFile) {
        for(;index < MAX_ATHLETES; index++) {
            if(!getline(inputFile, athleteNames[index])) {
                break;
            }
                for(int index2 = 0; index2 < MAX_SCORES && (inputFile >> athleteScores[index][index2]); index2++) {
                    if(athleteScores[index][index2] >= MIN_SCORE_RANGE && athleteScores[index][index2] <= MAX_SCORE_RANGE){
                        error[index] = emptyString;
                    }

                    else {
                        error[index] = errorFlag; 
                        return index;
                        break;
                    }
                    
                    
                }
            inputFile.ignore();
        }
    inputFile.close();
    }
return index;
}


void processor(string athleteNames[], double athleteScores[][MAX_SCORES], int MAX_ATHLETES) {

    const double AVERAGE_DIVISOR = 8.00;
    const int maxNumbersExcluded = 2;
    double total[MAX_ATHLETES];
    double average[MAX_ATHLETES];
    double lowest[MAX_ATHLETES];
    double highest[MAX_ATHLETES];

    for(int index = 0; index < MAX_ATHLETES; index++) {

        for(int index2 = 0; index2 < MAX_SCORES; index2++) {
            int lowestIndexComparitor = 0;
            if(athleteScores[index][index2] < athleteScores[index][lowestIndexComparitor]){
                lowestIndexComparitor = index2;    
                lowest[index] = athleteScores[index][index2];
                continue;
            }
            else{
                continue;
            }
        }
    }

    for(int index = 0; index < MAX_ATHLETES; index++) {

        for(int index2 = 0; index2 < MAX_SCORES; index2++) {
            int highestIndexComparitor = 0;
            if(athleteScores[index][index2] > athleteScores[index][highestIndexComparitor]){
                highestIndexComparitor = index2;
                highest[index] = athleteScores[index][index2];
                continue;
            }
            else{
                continue;
            }
            
        }
    }

    for(int index = 0; index < MAX_ATHLETES; index++) {

        for(int index2 = 0; index2 < MAX_SCORES; index2++){
            int numbersExcluded = 0;

            if(athleteScores[index][index2] != highest[index] && athleteScores[index][index2] != lowest[index]){
                total[index] += athleteScores[index][index2];
                continue;
            }

            else if(numbersExcluded < maxNumbersExcluded){
                if(athleteScores[index][index2] == highest[index] || athleteScores[index][index2] == lowest[index]) {
                numbersExcluded++;
                continue;
                }
            }

            else {
                total[index] += athleteScores[index][index2];
                continue;
            }
            
        }
        
    }

    for(int index = 0; index < MAX_ATHLETES; index++){
        double mean = 0.00;
        mean = total[index]/AVERAGE_DIVISOR;
        average[index] = mean;
    }

    for(int index = 0; index < MAX_ATHLETES; index++) {
        int lineOneCounter = 0;
        for(int index2 = 0; index2 < MAX_SCORES; index2++){
            if(error[index] == "Error"){
                break;
            }
            else if(error[index] == ""){
                
                if(lineOneCounter < 1){
                    cout << athleteNames[index-SUBSCRIPT_ADJUSTMENT] << "'s results:" << endl;
                    lineOneCounter++;
                }
                    cout << setprecision(HUNDREDTHS_PLACE) << athleteScores[index-SUBSCRIPT_ADJUSTMENT][index2-SUBSCRIPT_ADJUSTMENT] << ", ";
                    continue;
                }

        }
        if(error[index] == "Error"){
            cout << "Invalid scores \n" << athleteNames[index-SUBSCRIPT_ADJUSTMENT] << "is disqualified" << endl;
            continue;
        }
        else if(error[index] == "") {
            cout << setprecision(HUNDREDTHS_PLACE) << endl << "The highest score of " << highest[index-SUBSCRIPT_ADJUSTMENT] << " and the lowest score of " << lowest[index-SUBSCRIPT_ADJUSTMENT] << "were dropped " << endl;
            cout << setprecision(HUNDREDTHS_PLACE) << "The average score is" << average[index-SUBSCRIPT_ADJUSTMENT] << endl << "\n";    
        }
    }
}
    

