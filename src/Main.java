public class Main {
    public static void main(String[] args) {

        Griffindorf studentHarryPotter = new Griffindorf("Гарри Потер ", 10, 20, 25, 30, 35);
        Griffindorf studentGermionaGreindger  = new Griffindorf("Гермиона Грейнджер ", 5, 20, 20, 33, 39);
        Griffindorf studentRonUizly = new Griffindorf("Рон Уизли ", 7, 18, 23, 17, 29);


        Puffendui studentZahariyaSmitt = new Puffendui(" Захария Смит ", 7, 12, 25, 16, 37);
        Puffendui studentSedrikDiggori = new Puffendui(" Седрик Диггори ", 8, 13, 24, 17, 39);
        Puffendui studentDgastinFinchFletchli = new Puffendui(" Джастин Финч-Флетчли ", 9, 14, 20, 18, 40);


        Kogtevran studentsKChgouChang = new Kogtevran("Чжоу Чанг ", 13, 26, 72, 56, 13, 25);
        Kogtevran studentsPadmaPatil = new Kogtevran(" Падма Патил ", 13, 16, 12, 46, 73, 45);
        Kogtevran studentsMarkusBelbi = new Kogtevran(" Маркус Белби", 16, 36, 52, 66, 23, 15);

        Slizerin studentsDrakoMalfoi = new Slizerin("Драко Малфой ", 13, 2, 5, 78, 24, 34, 45);
        Slizerin studentsGrahamMontego = new Slizerin("Грэхэм Монтегю ", 43, 12, 65, 8, 14, 3, 5);
        Slizerin studentsGregoriKoil = new Slizerin(" Грегори Гойл ", 33, 21, 56, 38, 64, 4, 57);

PrintStudents printStudents = new PrintStudents();
printStudents.printStudents(studentsGregoriKoil);

CompareStudents compareStudentsGriffindorf = new CompareStudents();
compareStudentsGriffindorf.compareStudentsGriffindorf(studentGermionaGreindger, studentHarryPotter);

CompareStudents compareStudentsSlizerin  = new CompareStudents();
compareStudentsSlizerin.compareStudentsSlizerin(studentsDrakoMalfoi, studentsGrahamMontego);

        CompareStudents compareStudentsKogtevran = new CompareStudents();
        compareStudentsKogtevran.compareStudentsKogtevran(studentsKChgouChang, studentsMarkusBelbi);

        CompareStudents compareStudentsPuffendui = new CompareStudents();
        compareStudentsPuffendui.compareStudentsPuffendui(studentDgastinFinchFletchli, studentZahariyaSmitt);

        CompareStudents compareStudentsHogwartsPoMagii = new CompareStudents();
        compareStudentsHogwartsPoMagii.compareStudentsHogwartsPoMagii(studentDgastinFinchFletchli, studentZahariyaSmitt);

        CompareStudents compareStudentsHogwartsPoTransgressii = new CompareStudents();
        compareStudentsHogwartsPoTransgressii.compareStudentsHogwartsPoTransgressii (studentDgastinFinchFletchli, studentZahariyaSmitt);









    }


}

