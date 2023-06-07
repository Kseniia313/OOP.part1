public class PrintStudents {
    public void printStudents(Griffindorf studentsGriffindorf) {
        System.out.println("Ученик школы Гриффиндорф " + studentsGriffindorf.getName() +
                " обладает навыком колдовства на " + studentsGriffindorf.getColdovat() +
                " баллов, умением трансгенерировать на " + studentsGriffindorf.getTransgressirovat() + " баллов, благородство оценивается на " +
                +studentsGriffindorf.getNobility() + ", честь и храбрость на " + studentsGriffindorf.getHonor() + " и " + studentsGriffindorf.getBravery() + " соответсвенно. ");

        System.out.println("========================");
    }

    public void printStudents(Slizerin studentsSlizerin) {
            System.out.println("Ученик школы Слизерин " + studentsSlizerin.getName() +
                    " обладает навыком колдовства на " + studentsSlizerin.getColdovat() +
                    " баллов, умением трансгенерировать на " + studentsSlizerin.getTransgressirovat() + " баллов, хитрость оценивается на " +
                    +studentsSlizerin.getQualityTrick() + ", решительность и амбициозность на " + studentsSlizerin.getQualityResoluteness() + " и " + studentsSlizerin.getQualityAmbition() + " соответсвенно. Также у "
                    + studentsSlizerin.getName() + " есть находчивость " + studentsSlizerin.getQualityResourceFulness() + " балла и жажда власти " + studentsSlizerin.getQualityLustForPower() + " балла. ");
        System.out.println("========================");

        }

    public void printStudents(Kogtevran studentsKogtevran) {

            System.out.println("Ученик школы Когтевран " + studentsKogtevran.getName() + " обладает навыком колдовства на "
                    + studentsKogtevran.getColdovat() + " баллов, умением трансгенерировать на " + studentsKogtevran.getTransgressirovat() +
                    ". Когтевранец " + studentsKogtevran.getName() + " умен на " + studentsKogtevran.getQualityMind() + ", мудр на " + studentsKogtevran.getQualityWisdom() + ", остроумен на " + studentsKogtevran.getQualityWit() +
                    " и полон творчества на " + studentsKogtevran.getQualityCreation());
        System.out.println("========================");
        }

    public void printStudents(Puffendui studentsPuffendui) {
            System.out.println("Ученик школы Пуффендуй " + studentsPuffendui.getName() + " обладает навыком колдовства на "
                    + studentsPuffendui.getColdovat() + " баллов, умением трансгенерировать на " + studentsPuffendui.getTransgressirovat() +
                    " . " + studentsPuffendui.getName() + " трудолюбив на " + studentsPuffendui.getQualityTrudolybie() +
                    ", верен на " + studentsPuffendui.getQualityLoyalty() + ", честен на " + studentsPuffendui.getQualityHonest());
        System.out.println("===========================");

        }

    }


