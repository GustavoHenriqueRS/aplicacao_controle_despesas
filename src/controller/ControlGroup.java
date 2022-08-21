package controller;

import java.util.ArrayList;

import data.Database;
import model.Group;

public class ControlGroup {

    private Database database;

    public void createGroup(String name, String lider) {
        if (name == null || lider == null) {
            System.out.println("Preencha todos os campos");
        } else {
            Group group = new Group(null, name, lider, null);
            database.addGroup(group);
            System.out.println("Grupo cadastrado com sucesso");
        }
    }

    public void deleteGroup(Group group) {
        database.getGroups().remove(group);
    }

    public void editingGroup() {

    }

}