
public class Month {

    //Class attribute
    private int monthNumber;

    //Month Constructor
    public Month(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        } else {
            this.monthNumber = monthNumber;
        }
    }

    //setMonthNumber method
    public void setMonthNumber(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        } else {
            this.monthNumber = monthNumber;
        }
    }

    //getMonthNumber method
    public int getMonthNumber() {
        return monthNumber;
    }

    //getMonthName method
    public String getMonthName() {
        String month;
        if (monthNumber == 1) {
            month = "January";
        } 
        else if (monthNumber == 2) {
            month = "February";
        } 
        else if (monthNumber == 3) {
            month = "March";
        } 
        else if (monthNumber == 4) {
            month = "April";
        } 
        else if (monthNumber == 5) {
            month = "May";
        } 
        else if (monthNumber == 6) {
            month = "June";
        } 
        else if (monthNumber == 7) {
            month = "July";
        } 
        else if (monthNumber == 8) {
            month = "August";
        } 
        else if (monthNumber == 9) {
            month = "September";
        } 
        else if (monthNumber == 10) {
            month = "October";
        } 
        else if (monthNumber == 11) {
            month = "November";
        } 
        else {
            month = "December";
        }
        return month;
    }

    /*getSeasonName method which returns the season's name 
     *from the month in the field/instance variable of the object
     */
    public String getSeason() {
        String month = getMonthName();
        String season;
        if (month.equals("December") || month.equals("January") || month.endsWith("February")) {
            season = "Winter";
        } else if (month.equals("March") || month.equals("April") || month.equals("May")) {
            season = "Spring";
        } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
            season = "Summer";
        } else {
            season = "Fall";
        }
        return season;
    }

    //toString() method for displaying info
    @Override
    public String toString() {
        return getMonthName();
    }

    //Greater than method that returns true if current month number is greater than argument's month number
    public boolean greaterThan(Month month2) {
        return monthNumber > month2.monthNumber;
    }

    //Equals method that returns true if current month number is equal to argument's month number
    public boolean equals(Month month2) {
        return monthNumber == month2.monthNumber;
    }
}
