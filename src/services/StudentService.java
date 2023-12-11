package services;

import model.Students;

public interface StudentService {
    void AddnewStudent(String namegroup);
    void UpdateStudentName();
    void  FindStudentName( );
    void deletestudentbyEmail(String email);
}
