package services;

import model.Group;
import model.Students;

import java.util.LinkedList;

public interface LessonService {
    void getallstLesson(LinkedList<Group>groups);
    void addlessonbygroupname(String groupname,String lesson,String discription);
    void getalllessonbyname(String lessoname);
    void getalllessonbygroupname(String groupname);
    void deletelessonbyid(long id);
}
