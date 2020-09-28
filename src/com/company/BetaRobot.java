package com.company;

public class BetaRobot {
    String name;
    String model;
  int   row_current_index =1;
      int  column_curent_index=2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BetaRobot(String name, String model) {
        this.name = name;
        this.model = model;

    }
    public void moveDownRight(int row_current_index,int column_curent_index){
        column_curent_index ++;
        row_current_index ++;
        System.out.println("MoveDownRight"+column_curent_index +row_current_index);



    }
    public void moveDownLight(int row_current_index,int column_curent_index){
        column_curent_index =+2;
        row_current_index=+2;
        System.out.println("moveDownLight"+column_curent_index+row_current_index);



    }
    public void moveDownTop(int row_current_index,int column_curent_index){
        row_current_index=+3;
        column_curent_index=+3;
        System.out.println("moveDownTope"+row_current_index+column_curent_index);

    }
    public void moveDown(int row_current_index,int column_curent_index){
        row_current_index=+4;
        column_curent_index=+4;
        System.out.println("MoveDown"+row_current_index+column_curent_index);

    }


}
