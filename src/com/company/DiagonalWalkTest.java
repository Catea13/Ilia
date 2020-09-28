package com.company;

public class DiagonalWalkTest {
    public static void main(String[] args) {
        CharlieRobot charlieRobot = new CharlieRobot("Chatile", "Robot");
        charlieRobot.moveDown(0, 0);//0+4
        if (charlieRobot.row_current_index == 4) ;
        System.out.println(true);



        charlieRobot.moveDownTop(0,0);//0+3
        if(charlieRobot.row_current_index==3);
        System.out.println(true);

charlieRobot.moveDownLight(0,0);//0+2
        if (charlieRobot.column_curent_index==2);
        System.out.println(true);

        charlieRobot.moveDownRight(0,0);//0+1
        if (charlieRobot.column_curent_index==2);
        System.out.println(true);
    }
}
