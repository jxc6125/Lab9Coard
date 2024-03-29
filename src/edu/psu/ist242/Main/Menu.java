package edu.psu.ist242.Main;

import java.util.ArrayList;

public class Menu {

    //Class Level Variables - Protect the data
    private int menuId;
    private String menuItem;
    private double itemPrice;
    private int quantity;

    //Constructor Method
    public Menu(int _menuId, String _menuItem,double _itemPrice) {
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.itemPrice = _itemPrice;
        this.quantity = 0;
    }

    //Setters and Getters
    public int getmenuId() {
        return menuId;
    }

    public void setmenuId(int _menuId) {
        this.menuId = _menuId;
    }

    public String getmenuItem() {
        return menuItem;
    }

    public void setmenuItem(String _menuItem) {
        this.menuItem = _menuItem;
    }

    public double getitemPrice(){
        return itemPrice;
    }

    public void setitemPrice(double _itemPrice){
        this.itemPrice = _itemPrice;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int _quantity){
        this.quantity = _quantity;
    }

    public static void listMenu(ArrayList<Menu> mList) {
        for (Menu menu : mList) {
            System.out.print(menu.getmenuItem());
            System.out.print(" ");
            System.out.println(menu.getitemPrice());
        }
    }
}