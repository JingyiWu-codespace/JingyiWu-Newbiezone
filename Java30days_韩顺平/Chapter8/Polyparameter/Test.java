package Java30days_韩顺平.Chapter8.Polyparameter;

public class Test {
    //不能在main函数中定义方法
    public static void main(String[] args) {
        Employee worker = new Worker("JINGYI",10000);
        Employee manager = new Manager("Yixue",30000,200000);
        "wujingyi".equals("Yixue");
        Test test = new Test();
        //test.showEmpAnnual(worker);
        //test.showEmpAnnual(manager);
        test.testWork(manager);
//        Employee[]employees = new Employee[2];
//        employees[0] = worker;
//        employees[1] = manager;
//
//        for (int i = 0 ;i<employees.length;i++){
//            System.out.println(employees[i].getAnnual());
//            if (employees[i] instanceof Worker){
//                System.out.println(((Worker)employees[i]).work());
//            } else if (employees[i] instanceof Manager) {
//                System.out.println(((Manager)employees[i]).manage());
//            }
//        }
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e){
        if (e instanceof Worker){
            System.out.println(((Worker)e).work());//向下转型
        } else if (e instanceof Manager) {
            System.out.println(((Manager)e).manage());//向下转型
        }

    }
}
