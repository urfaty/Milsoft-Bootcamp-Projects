package composition;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Department departmentA = new Department(501,"Muhasebe");
        departmentA.setEmployeeList(new ArrayList<Employee>());

        Employee employee1 = new Employee(601,"Teoman Alpay",34840);
        employee1.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee1);

        Employee employee2 = new Employee(602,"Yusuf Nalkesen",65740);
        employee2.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee2);

        Employee employee3 = new Employee(603,"Yıldırım Gürses",34670);
        employee3.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee3);

        System.out.println(departmentA.getDepartmentId() + " " + departmentA.getDepartmentName());

        for (Employee employee :departmentA.getEmployeeList()) {
            System.out.println("\t" + employee.getEmployeeId() + " "
                    + employee.getEmployeeName() + " "
                    + employee.getMonthSalary() + " "
                    + employee.getDepartment().getDepartmentId() + " "
                    + employee.getDepartment().getDepartmentName());
        }
    }
}

// com.godoro.sports
// ödev aynısını yap
//          Team teamıd teamName
//          Player playerId playerName averageScore
//          Test
//              901 Godoro Spor
//                  301 "Neşet Ertaş" 45.2
//                  302 "Mahsuni Şerif" 36.5
//                  303 "Erkan Ocaklı" 71.3


// School
// Classroom -> school için child student için parent
// Student -> averageMark, id ve name diğer üçü içinde var
//
//
//          Test
//              901 Godoro üniversitesi
//                  701 Mühendislik
//                      301 "Neşet Ertaş" 45.2
//                      303 "Mahsuni Şerif" 36.5
//                      304 "Celal Güzelses" 61.2
//                  702 Ekonomi
//                      302 "Erkan Ocaklı" 71.3
//                      305 "Mustafa Toplaoğlu" 42.2
