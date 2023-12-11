package services;

import database.Database;
import model.Group;

import java.util.LinkedList;

public interface GroupService {
    void Getallgroups();
    void  AddNewGroup(Group newgroup);
    void  getGroupByName(LinkedList<Group>groups);
    void UpdateGroupName(LinkedList<Group>groups);
    void GetallStByGrName(LinkedList<Group>groups);
}
