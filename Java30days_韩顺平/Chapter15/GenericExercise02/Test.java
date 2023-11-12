package Java30days_韩顺平.Chapter15.GenericExercise02;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("arie",34000,new MyDate(1,21,1993));
        Employee employee2 = new Employee("arie",74000,new MyDate(12,16,1991));
        Employee employee3 = new Employee("arie",24000,new MyDate(6,1,1996));
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println("========排序前=======");
        for(Employee e :employees){
            System.out.println(e);
        }
        //在 Comparator 接口的实现中，compare 方法用于比较两个对象的顺序。compare 方法返回一个整数值，表示两个对象之间的关系：
        //
        //如果 compare 返回负数，表示 o1 在排序中应该排在 o2 的前面。
        //如果 compare 返回正数，表示 o1 在排序中应该排在 o2 的后面。
        //如果 compare 返回零，表示 o1 和 o2 相等，它们的顺序不变。
        //所以，如果你的 compare 方法返回正数，那么在排序中 o1 会排在 o2 的后面，这通常被认为是升序排序。如果你希望降序排序，可以反过来返回负数和正数的条件，或者在比较时交换 o1 和 o2 的位置。
        //
        //如果你的 compare 方法返回正数表示升序，而返回负数表示降序，这是一个常见的约定，但实际上也可以根据需要选择不同的方式来定义。
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                if(!(o1 instanceof Employee && o2 instanceof Employee)){
                    System.out.println("输入类型不匹配");
                    return 0;
                }
                int nameCompare = o1.getName().compareTo(o2.getName());
                if (nameCompare !=0){
                    return nameCompare;
                }
                //下面是对birthday的比较，因此最好放在MyDate类
                //增加维护性和复用性
//                int yearMinus = o1.getBirthdaty().getYear()-o2.getBirthdaty().getYear();
//                if (yearMinus!=0){return yearMinus;}
//                int monthMinus = o1.getBirthdaty().getMonth()-o2.getBirthdaty().getMonth();
//                if (monthMinus!=0){return monthMinus;}
//                return o1.getBirthdaty().getDay()-o2.getBirthdaty().getDay();
                return o1.getBirthdaty().compareTo(o2.getBirthdaty());

            }
        });
        System.out.println("++++++++排序后++++++++");
//        Iterator<Employee> iterator = employees.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        for (Employee e :employees){
            System.out.println(e);
        }

    }
}
