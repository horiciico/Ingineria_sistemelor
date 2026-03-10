import java.util.List;

public class Student
{
    private int numarMatricol;
    private String nume;
    private String prenume;
    private String formatieDeStudiu;

    public Student(int nr_mat, String nume, String prenume, String formatieDeStudiu)
    {
        this.numarMatricol=nr_mat;
        this.nume=nume;
        this.prenume=prenume;
        this.formatieDeStudiu=formatieDeStudiu;
    }

    public String toString()
    {
       return
               "Nume: " + nume + "\n" +
                       "Prenume: " + prenume + "\n" +
                       "Numar matricol: " + numarMatricol + "\n" +
                       "Formatie de studiu: " + formatieDeStudiu + "\n";

    }

    public  boolean cautaStudent(List<Student> list)
    {
        for(Student i:list)
        {
            if (this.nume.equals(i.nume) && this.prenume.equals(i.prenume) && this.formatieDeStudiu.equals(i.formatieDeStudiu))
                return true;
        }
        return false;
    }
}
