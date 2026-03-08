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

    public void AfisareStudenti()
    {
        System.out.println("Nume: " + this.nume);
        System.out.println("Prenume " + this.prenume);
        System.out.println("Numar matricol: " + this.numarMatricol);
        System.out.println("Grupa : " + this.formatieDeStudiu);
    }
}
