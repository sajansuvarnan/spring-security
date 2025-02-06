public class objectarray {

    public static void main(String[] args) {
        
        employee emp1 = new employee();  //object declaration
        emp1.employeeid = 41431;
        emp1.name = "sajan";
        emp1.domain = "JAVA";

        employee emp2 = new employee();
        emp2.employeeid = 3141;
        emp2.name = "jega";
        emp2.domain = "PYTHON";

        employee emp3 = new employee();
        emp3.employeeid = 75634;
        emp3.name = "deepan";
        emp3.domain = "JAVA";

        employee employees[] = new employee[3]; //oject array declaration
        employees[0] =emp1;
        employees[1] =emp2;
        employees[2] =emp3;

        for(int i =0; i<employees.length;i++)
        {
            System.out.println("Name: "+employees[i].name +"  ID:" + employees[i].employeeid+"  Domain:"+employees[i].domain);

        }

        //enhanced for loop

        for(employee e : employees )
        {
            System.out.println(e.name +" "+e.employeeid);
        }


    }


}


class employee 
{
    int employeeid;
    String name;
    String domain;


}