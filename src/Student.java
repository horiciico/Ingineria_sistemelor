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
}
