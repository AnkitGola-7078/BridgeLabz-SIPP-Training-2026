class Item{
    int itemCode;
    String itemName;
    double price;

    Item(int ic,String itemName,double p){
        this.itemCode=ic;
        this.itemName=itemName;
        this.price=p;
    }
    
     // Method to display details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    double totalcost(int quantity){
        return quantity*price;
    }
    
    public static void main(String[] args) {
        Item i=new Item(101,"Pen",10.5 );
        i.displayDetails();

        int quantity=5;
        System.out.println(i.totalcost(quantity));
    }

}