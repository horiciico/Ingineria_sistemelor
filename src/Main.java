void main()
{
   Student s=new Student(7123, "Miklovenescu", "Miklovan", "TCM 22/1");
   Student maria=new Student(112, "Maria", "Popa", "TI21/1");

   List<Student> listaStudenti=new ArrayList<>();

   listaStudenti.add(new Student(590, "Pop", "Horia", "ISM 21/2"));
   listaStudenti.add(new Student(5123, "Manzu", "Gigi", "ISM 21/1"));
   listaStudenti.add(new Student(7123, "Miklovenescu", "Miklovan", "TCM 22/1"));
   listaStudenti.add(new Student(9990, "Gianny", "Gianny", "C_21/4"));
   listaStudenti.add(new Student(112, "Maria", "Popa", "TI21/1"));

   //for(Student i:listaStudenti)
      //System.out.println(i);

   if(maria.cautaStudent(listaStudenti)) System.out.println("exista");
   else System.out.println("nu exista");

}

