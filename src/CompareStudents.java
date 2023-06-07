public class CompareStudents {
    public void compareStudentsGriffindorf(Griffindorf student1, Griffindorf student2) {
        int sumQualityStudent1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int sumQualityStudent2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (sumQualityStudent1 > sumQualityStudent2) {
            System.out.println(" В Гриффиндорфе " + student1.getName() + " cтудент лучше, чем " + student2.getName());
        } else if (sumQualityStudent2 > sumQualityStudent1) {
            System.out.println(" В Гриффиндорфе " + student2.getName() + " cтудент лучше, чем " + student1.getName());
        } else {
            System.out.println(" В Гриффиндорфе нет лучшего студента");
        }
        System.out.println("========================");

    }

    public void compareStudentsSlizerin(Slizerin student1, Slizerin student2) {
        int sumQualityStudent1 = student1.getQualityTrick() + student1.getQualityResoluteness() + student1.getQualityAmbition() + student1.getQualityResoluteness() + student1.getQualityResourceFulness();
        int sumQualityStudent2 = student2.getQualityTrick() + student2.getQualityResoluteness() + student2.getQualityAmbition() + student2.getQualityResoluteness() + student2.getQualityResourceFulness();
        if (sumQualityStudent1 > sumQualityStudent2) {
            System.out.println(" В  Слизерин " + student1.getName() + " cтудент лучше, чем " + student2.getName());
        } else if (sumQualityStudent2 > sumQualityStudent1) {
            System.out.println(" В  Слизерин " + student2.getName() + " cтудент лучше, чем " + student1.getName());
        } else {
            System.out.println(" В  Слизерин нет лучшего студента");
        }
        System.out.println("========================");

    }

    public void compareStudentsKogtevran(Kogtevran student1, Kogtevran student2) {
        int sumQualityStudent1 = student1.getQualityMind() + student1.getQualityWisdom() + student1.getQualityWit() + student1.getQualityCreation();
        int sumQualityStudent2 = student2.getQualityMind() + student2.getQualityWisdom() + student2.getQualityWit() + student2.getQualityCreation();
        if (sumQualityStudent1 > sumQualityStudent2) {
            System.out.println(" В Когтевран " + student1.getName() + " cтудент лучше, чем " + student2.getName());
        } else if (sumQualityStudent2 > sumQualityStudent1) {
            System.out.println(" В Когтевран " + student2.getName() + " cтудент лучше, чем " + student1.getName());
        } else {
            System.out.println(" В Когтевран нет лучшего студента");
        }
        System.out.println("========================");

    }

    public void compareStudentsPuffendui(Puffendui student1, Puffendui student2) {
        int sumQualityStudent1 = student1.getQualityTrudolybie() + student1.getQualityLoyalty() + student1.getQualityHonest();
        int sumQualityStudent2 = student2.getQualityTrudolybie() + student2.getQualityLoyalty() + student2.getQualityHonest();
        if (sumQualityStudent1 > sumQualityStudent2) {
            System.out.println(" В Пуффендуй " + student1.getName() + " cтудент лучше, чем " + student2.getName());
        } else if (sumQualityStudent2 > sumQualityStudent1) {
            System.out.println(" В Пуффендуй " + student2.getName() + " cтудент лучше, чем " + student1.getName());
        } else {
            System.out.println(" В Пуффендуй нет лучшего студента");
        }
        System.out.println("========================");

    }

    public void compareStudentsHogwartsPoMagii(Hogwarts student1, Hogwarts student2) {
        if (student1.getColdovat() > student2.getColdovat()) {
            System.out.println(student1.getName() + " лучше колдует, чем " + student2.getName());
        } else if (student2.getColdovat() > student1.getColdovat()) {
            System.out.println(student2.getName() + " лучше колдует, чем " + student1.getName());
        } else {
            System.out.println(" Оба студента Хогвардса колдуют одинаково");
        }
        System.out.println("========================");
    }

    public void compareStudentsHogwartsPoTransgressii(Hogwarts student1, Hogwarts student2) {
        if (student1.getTransgressirovat() > student2.getTransgressirovat()) {
            System.out.println(student1.getName() + " обладает лучшей трансгрессией, чем " + student2.getName());
        } else if (student2.getColdovat() > student1.getColdovat()) {
            System.out.println(student2.getName() + " обладает лучшей трансгрессией, чем  " + student1.getName());
        } else {
            System.out.println(" Оба студента Хогвардса трансгрессируют одинаково");
        }
        System.out.println("========================");

    }
}
