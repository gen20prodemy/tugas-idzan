package Operations;

import Pojo.DataFile;

import java.io.FileNotFoundException;
/* ini adalah abstrac class , semua method abstract harus dimplementasi tapi method
   biasa boleh di gunakan atau tidak digunakan
*/
public abstract class CrudOperationsFile {

    public abstract void tambahRow(DataFile data);

    public abstract void updateRow(DataFile data);

    public abstract void deleteRow(int id);

    public void displayRow()  {

    }

    public  void displayAllRows()  {}


}
