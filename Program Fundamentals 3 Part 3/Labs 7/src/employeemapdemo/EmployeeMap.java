/**
 * Victor Sim
 * 7/28/22
 * JDK 17.0.2
 * Map/Collection Class
 */
//Package statement
package employeemapdemo;

//Import Statements
import java.util.HashMap;
import java.util.Map;

//Class Header & Definition
class EmployeeMap {

    //Map Field
    private Map<Integer, Employee> map;

    //Constructor
    public EmployeeMap() {
        map = new HashMap<>();
    }

    //Put Method
    public void put(Employee e) {
        map.put(e.getIdNumber(), e);
    }

    //Get Method (key method)
    public Employee get(int id) {
        return map.get(id);
    }
}
