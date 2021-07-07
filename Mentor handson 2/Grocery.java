package com.handsons;

public class Grocery {
private String itemname;
private String category;
private Integer quantity;



 public Grocery() {
	  super();
  }
 public Grocery(String itemname, String category, Integer quantity) {
	  super();
	   this.itemname = itemname;
	   this.category = category;
	   this.quantity = quantity;
  }
 public String getItemname() {
	   return itemname;
  }
  public void setItemname(String itemname) {
	   this.itemname = itemname;
  }
 public String getCategory() {
	   return category;
  }
 public void setCategory(String category) {
	   this.category = category;
  }
public Integer getQuantity() {
	   return quantity;
 }
@Override
 public String toString() {
	   return "Grocery [itemname=" + itemname + ", category=" + category + ", quantity=" + quantity + "]";
  }
  public void setQuantity(Integer quantity) {
	   this.quantity = quantity;
  }




}
