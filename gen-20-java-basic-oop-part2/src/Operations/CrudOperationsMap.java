package Operations;

import ChildClass.CrudMap;
// ini adalah interface , semua method pada interface harus di implementasi
public interface CrudOperationsMap {
    void addElement(int id, String name);
    void deleteElement(int id);
    void displayElement();

    void displayAllElements();
    void updateElement(int id, String newName);


}
