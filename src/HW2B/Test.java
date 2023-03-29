package HW2B;

import java.util.ArrayList;

public class Test {

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

    public static void main(String[] args) {
        School schoolA = new School(901,"Godoro Üniversitesi");
        schoolA.setClassroomList(new ArrayList<Classroom>());

        Classroom classroomA = new Classroom(701,"Mühendislik");
        classroomA.setStudentList(new ArrayList<Student>());
        schoolA.getClassroomList().add(classroomA);

        Classroom classroomB = new Classroom(702,"Ekonomi");
        classroomB.setStudentList(new ArrayList<Student>());
        schoolA.getClassroomList().add(classroomB);






        Student student1 = new Student(301,"Neşet Ertaş",45.2);
        student1.setClassroom(classroomA);
        classroomA.getStudentList().add(student1);

        Student student2 = new Student(303,"Mahsuni Şerif",36.5);
        student2.setClassroom(classroomA);
        classroomA.getStudentList().add(student2);

        Student student3 = new Student(304,"Celal Güzelses",61.2);
        student3.setClassroom(classroomA);
        classroomA.getStudentList().add(student3);



        Student student4 = new Student(302,"Erkan Ocaklı",36.5);
        student4.setClassroom(classroomB);
        classroomB.getStudentList().add(student4);

        Student student5 = new Student(305,"Muatafa Topaloğlu",61.2);
        student5.setClassroom(classroomB);
        classroomB.getStudentList().add(student5);












        System.out.println(schoolA.getSchoolId() + " " + schoolA.getSchoolName());

            System.out.println("\t" + classroomA.getClassroomId() + " " + classroomA.getClassroomName());
            for (Student student :classroomA.getStudentList() ) {
                System.out.println("\t" + "\t" + student.getStudentId() + " "
                        + student.getStudentName() + " "
                        + student.getAvarageScore() + " ");

            }


            System.out.println("\t" + classroomB.getClassroomId() + " " + classroomB.getClassroomName());
            for (Student student :classroomB.getStudentList() ) {
                System.out.println("\t" + "\t" +student.getStudentId() + " "
                        + student.getStudentName() + " "
                        + student.getAvarageScore() + " ");

            }









    }

}
