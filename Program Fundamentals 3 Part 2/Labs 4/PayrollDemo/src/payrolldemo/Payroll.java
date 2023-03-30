/**
 * Victor Sim
 * 7/6/22
 * JDK 17.0.2
 * 2nd Class
 */
//Package statement
package payrolldemo;

//Class Definition
public class Payroll {

    //Field/Member Declarations
    String name;
    int Id;
    double hourly_payrate;
    double hours_worked;
    
    //Empty Constructor
    Payroll(){}
    
    /*Parametrized Constructor - 
     *Catches the Throw Statements
     *from the method calls (try's are like if statements for exceptions)
     */
    Payroll(String Name, int id) {
        try {
            setName(Name);
        } catch (InvalidNameException exp) {
            System.out.println(exp);
        }
        try {
            setId(id);
        } catch (InvalidIDException exp) {
            System.out.println(exp);
        }
    }

    //Setters & Getters - Has throw statements for catches
    void setName(String Name) throws InvalidNameException {
        if (Name.length() == 0) {
            throw new InvalidNameException("Name Input is Invalid");
        } else {
            this.name = Name;
        }
    }

    String getName() {
        return this.name;
    }

    void setId(int id)
            throws InvalidIDException {
        if (id <= 0) {
            throw new InvalidIDException("Id Input is Invalid");
        } else {
            this.Id = id;
        }
    }

    int getId() {
        return this.Id;
    }

    void sethours_worked(double Hours_worked) throws InvalidHoursException {
        if (Hours_worked < 0 || Hours_worked > 84) {
            throw new InvalidHoursException("Input is Invalid");
        } else {
            this.hours_worked = Hours_worked;
        }
    }

    double gethours_worked() {
        return this.hours_worked;
    }

    void sethourly_payrate(double Hourly_payrate)
            throws InvalidHourlyRateException {
        if (Hourly_payrate < 0 || Hourly_payrate > 25) {
            throw new InvalidHourlyRateException("Input is Invalid");
        } else {
            this.hourly_payrate = Hourly_payrate;
        }
    }

    double gethourly_payrate() {
        return this.hourly_payrate;
    }

    double getgrosspay() {
        return (this.hours_worked * this.hourly_payrate);
    }
}
