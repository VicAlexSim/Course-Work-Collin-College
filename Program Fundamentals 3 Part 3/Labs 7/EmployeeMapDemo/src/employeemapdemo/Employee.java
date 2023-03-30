/**
 * Victor Sim
 * 7/28/22
 * JDK 17.0.2
 * Employee/Core Class
 */
//Package statement
package employeemapdemo;

//Class Header & Definition
class Employee {

    //Fields/Members
    private int idNumber;
    private String name;

    //Constructor
    public Employee(int IdNum, String employeeName) {
        super();
        idNumber = IdNum;
        name = employeeName;
    }

    //Getters & Setters
    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public void setIdNumber(int IdNum) {
        idNumber = IdNum;
    }

    public void setName(String employeeName) {
        name = employeeName;
    }

    //Custom Hashcode method (overrided)
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idNumber;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    //Custom Equals method (overrided)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Employee other = (Employee) obj;
        if (idNumber != other.idNumber) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    //Custom ToString Method (overrided)
    @Override
    public String toString() {
        return "Employee: \nIdNumber = " + idNumber + "\nName = " + name;
    }

}
