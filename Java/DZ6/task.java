package DZ6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map.Entry;

public class task {
     public static void main(String[] args) {
        notebook lap1=new notebook("G911",12,"HP");
        lap1.setHDD(700);
        lap1.setOS("Windows");
        lap1.setRAM(8);
        
        notebook lap2=new notebook("SVT13",13,"Sony");
        lap2.setHDD(1000);
        lap2.setOS("Windows");
        lap2.setRAM(8);

        notebook lap3=new notebook("AA19",14,"Acer");
        lap3.setHDD(900);
        lap3.setOS("Windows");
        lap3.setRAM(16);

        notebook lap4=new notebook("Inspiron3511",15,"Dell");
        lap4.setHDD(700);
        lap4.setOS("Linux");
        lap4.setRAM(8);

        notebook lap5=new notebook("MAC Pro16",16,"Apple");
        lap5.setHDD(1000);
        lap5.setOS("macOS");
        lap5.setRAM(8);

        HashSet <notebook> notebooks = new HashSet<>(Arrays.asList(lap1,lap2,lap3,lap4,lap5));
        HashSet <notebook> res = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n или 4, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=4){
        if(n==1){
            System.out.println("Введите минимальную оперативную память");
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("RAM", temp);
        }
        if(n==2){
            System.out.println("Введите минимальный объем ЖД" );
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("HDD", temp);
        }
        if(n==3){
            System.out.println("Введите ОС");
            String temp = sc.nextLine();
            filters.put("OS", temp);
        }
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n или 4, чтобы осуществить поиск\n");
        n = sc.nextInt();
        sc.nextLine();
    }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator it = notebooks.iterator();
                while(it.hasNext()){
                    notebook lap = (notebook) it.next();
                    if(lap.getRAM()>=(Integer)entry.getValue()){
                        res.add(lap);
                    }
                }
                }
             if(entry.getKey().equals("HDD")){
                Iterator it = notebooks.iterator();
                while(it.hasNext()){
                    notebook lap = (notebook)it.next();
                    if(lap.getHDD()>=(Integer)entry.getValue()){
                        res.add(lap);
                        }
                    }
                    }
            if(entry.getKey().equals("OS")){
                Iterator it = notebooks.iterator();
                while(it.hasNext()){
                    notebook lap = (notebook)it.next();
                        if(lap.getOS().equals(entry.getValue())){
                            res.add(lap);
                            }
                        }
                        }
            // if(entry.getKey().equals("color")){
            //     Iterator it = notebooks.iterator();
            //     while(it.hasNext()){
            //         notebook lap = (notebook)it.next();
            //             if(lap.getColor().equals(entry.getValue())){
            //                 res.add(lap);
            //                         }
            //                     }
            //                     }
            }
        
            Iterator it = res.iterator();
            while(it.hasNext()){
                notebook lap = (notebook)it.next();
            System.out.println(lap.toString());
            System.out.println();
        }
}
}