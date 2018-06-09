package com.company;

public class Main {


    public static void main(String[] args) {

        /* Формирование списка дисциплин, по номерам автоматом получаем соотношение ID-Subject */
        Subject sb = new Subject();
        SubName[] sn = SubName.values();
        Subject[] sub = new Subject[4];

        for (int i=0; i<4;i++) {
            sb.setName(sn[i]);
            sub[i]=sb;
            System.out.println(sub[i] + " ID - " + i);
        }
        int[] VasiliyGrop = {0,1,3};  /*допустим, по предмету с индексом 0 - математика - при вводе оценки не целые*/
        Object[] VasiliyMark = {4.4,4,5};

        int[] GenaGrop = {0,3};
        Object[] GenaMark = {4.8,5};

        int[] JohnGrop = {0,1,2};
        Object[] JohnMark = {4.9,4,5};

        int[] IgorGrop = {0,1,3};
        Object[] IgorMark1 = {5.0,4,4};

        int[] KateGrop = {0,1,2};
        Object[] KateMark = {4.2,4,4};


        /* Формирование списка студентов */
        Student[] students = new Student[5];
        students[0] = new Student("Vasiliy", VasiliyGrop, VasiliyMark);
        students[1] = new Student("Gena", GenaGrop, GenaMark);
        students[2] = new Student("John", JohnGrop, JohnMark);
        students[3] = new Student("Igor", IgorGrop, IgorMark1);
        students[4] = new Student("Kate", KateGrop, KateMark);
        for (int i=0; i<5;i++) {
            System.out.println(students[i]);
        }

        /* Вывод студента X */
        int searchstud = 0;  /* Индекс, кторы может приходить из сканера*/
        System.out.println(students[searchstud]);

        /* Формирование групп */
        Student[] groupMath = new Student[5];
        for (int i=0; i<5; i++) {
            for (int j=0; j<students[i].getGroupID().length;j++) {
                if (students[i].getGroupID() [j]== 0) {
                    groupMath[i] = students[i];
                    break;
                }
            }
            if (groupMath[i]==null) System.out.println("Свободное место в группе Math"); else
            System.out.println("groupMath student - " + groupMath[i]);
        }


        Student[] groupGEO = new Student[5];
        for (int i=0; i<5; i++) {
            for (int j=0; j<students[i].getGroupID().length;j++) {
                if (students[i].getGroupID() [j]== 1) {
                    groupGEO[i] = students[i];
                    break;
                }
            }
            if (groupGEO[i]==null) System.out.println("Свободное место в группе GEO"); else
                System.out.println("groupGEO student - " + groupGEO[i]);
        }

        Student[] groupHist = new Student[5];
        for (int i=0; i<5; i++) {
            for (int j=0; j<students[i].getGroupID().length;j++) {
                if (students[i].getGroupID() [j]== 2) {
                    groupHist[i] = students[i];
                    break;
                }
            }
            if (groupHist[i]==null) System.out.println("Свободное место в группе History"); else
            System.out.println("groupHistory student - " + groupHist[i]);
        }

        Student[] groupProg = new Student[5];
        for (int i=0; i<5; i++) {
            for (int j=0; j<students[i].getGroupID().length;j++) {
                if (students[i].getGroupID() [j]== 3) {
                    groupProg[i] = students[i];
                    break;
                }
            }
            if (groupProg[i]==null) System.out.println("Свободное место в группе Programming"); else
            System.out.println("groupProgramming student - " + groupProg[i]);
        }







    }
}
