class Main {

    private String name;
    private int age;
    private int salary;

    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}
    public void setSalary(int salary){this.salary=salary;}

    public void printDetails() {
        System.out.println(name + " : " + salary);
    }

    public static void main(String[] args) {

        Main e1 = new Main();
        e1.printDetails();
    }
}