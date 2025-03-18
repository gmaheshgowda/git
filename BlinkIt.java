package week4;
public class BlinkIt {

    public static double searchItem(String item) {
        double price = 0.0;
        if (item == "Gulab Jamun") 
        {
            price = 250.0;
            return price;
        } 
        else if (item == "Rasgulla") 
        {
            price = 230.0;
            return price;
        } 
        else if (item == "Jalebi") 
        {
            price = 180.0;
            return price;
        } 
        else if (item == "Rasgulla") 
        {
            price = 90.0;
            return price;
        } 
        else if (item == "Ladoo") 
        {
            price = 150.0;
            return price;
        } 
        else if (item == "Barfi") 
        {
            price = 220.0;
            return price;
        } 
        else if (item == "Aloo Gobhi") 
        {
            price = 150.0;
            return price;
        } 
        else if (item == "Kaju Katli") 
        {
            price = 450.0;
            return price;
        } 
        else if (item == "Peda") 
        {
            price = 200.0;
            return price;
        } 
        else if (item == "Mysore Pak") 
        {
            price = 260.0;
            return price;
        } 
        else if (item == "Sandesh") 
        {
            price = 270.0;
            return price;
        } 
        else if (item == "Balushahi") 
        {
            price = 190.0;
            return price;
        } 
        else if (item == "Cham Cham") 
        {
            price = 240.0;
            return price;
        } 
        else if (item == "Malpua") 
        {
            price = 220.0;
            return price;
        } 
        else if (item == "Misti Doi") 
        {
            price = 180.0;
            return price;
        } 
        else if (item == "Patishapta") 
        {
            price = 200.0;
            return price;
        } 
        else if (item == "Shondesh") 
        {
            price = 230.0;
            return price;
        } 
        else if (item == "Soan Papdi") 
        {
            price = 160.0;
            return price;
        } 
        else if (item == "Besan Ladoo") 
        {
            price = 250.0;
            return price;
        } 
        else if (item == "Coconut Barfi") 
        {
            price = 270.0;
            return price;
        } 
        else if (item == "Til Laddu") 
        {
            price = 140.0;
            return price;
        } 
        else if (item == "Modak") 
        {
            price = 290.0;
            return price;
        } 
        else if (item == "Gujiya") 
        {
            price = 260.0;
            return price;
        } 
        else if (item == "Puran Poli") 
        {
            price = 300.0;
            return price;
        } 
        else if (item == "Ariselu") 
        {
            price = 210.0;
            return price;
        } 

        else if (item == "Chocolate Fudge") 
        {
            price = 350.0;
            return price;
        } 
        else if (item == "Fruit Halwa") 
        {
            price = 320.0;
            return price;
        } 
        else if (item == "Gajar Ka Halwa") 
        {
            price = 280.0;
            return price;
        } 
        else if (item == "Moong Dal Halwa") 
        {
            price = 290.0;
            return price;
        } 
        else if (item == "Milk Cake") 
        {
            price = 310.0;
            return price;
        } 
        else if (item == "Kharwas") 
        {
            price = 270.0;
            return price;
        } 
        else if (item == "Rabri") 
        {
            price = 330.0;
            return price;
        } 
        else if (item == "Kalakand") 
        {
            price = 340.0;
            return price;
        } 
        else if (item == "Mango Shrikhand") 
        {
            price = 320.0;
            return price;
        } 
        else if (item == "Kesari Bath") 
        {
            price = 180.0;
            return price;
        } 
        else if (item == "Sweet Pongal") 
        {
            price = 210.0;
            return price;
        } 
        else 
        {
            System.out.println("Item not found in BlinkIt sweets inventory.");
            return -1; 
        }
    }

    public static double searchItem(String item, int quantity) {
        double price = 0.0;
        
        if (item == "Gulab Jamun") 
        {
            price = 250.0;
            return price * quantity;
        } 
        else if (item == "Rasgulla") 
        {
            price = 230.0;
            return price * quantity;
        } 
        else if (item == "Jalebi") 
        {
            price = 180.0;
            return price * quantity;
        } 
        else if (item == "Ladoo") 
        {
            price = 150.0;
            return price * quantity;
        } 
        else if (item == "Barfi") 
        {
            price = 220.0;
            return price * quantity;
        } 
        else if (item == "Aloo Gobhi") 
        {
            price = 150.0;
            return price * quantity;
        } 
        else if (item == "Kaju Katli") 
        {
            price = 450.0;
            return price * quantity;
        } 
        else if (item == "Peda") 
        {
            price = 200.0;
            return price * quantity;
        } 
        else if (item == "Mysore Pak") 
        {
            price = 260.0;
            return price * quantity;
        } 
        else if (item == "Sandesh") 
        {
            price = 270.0;
            return price * quantity;
        } 
        else if (item == "Balushahi") 
        {
            price = 190.0;
            return price * quantity;
        } 
        else if (item == "Cham Cham") 
        {
            price = 240.0;
            return price * quantity;
        } 
        else if (item == "Malpua") 
        {
            price = 220.0;
            return price * quantity;
        } 
        else if (item == "Misti Doi") 
        {
            price = 180.0;
            return price * quantity;
        } 
        else if (item == "Patishapta") 
        {
            price = 200.0;
            return price * quantity;
        } 
        else if (item == "Shondesh") 
        {
            price = 230.0;
            return price * quantity;
        } 
        else if (item == "Soan Papdi") 
        {
            price = 160.0;
            return price * quantity;
        } 
        else if (item == "Besan Ladoo") 
        {
            price = 250.0;
            return price * quantity;
        } 
        else if (item == "Coconut Barfi") 
        {
            price = 270.0;
            return price * quantity;
        } 
        else if (item == "Til Laddu") 
        {
            price = 140.0;
            return price * quantity;
        } 
        else if (item == "Modak") 
        {
            price = 290.0;
            return price * quantity;
        } 
        else if (item == "Gujiya") 
        {
            price = 260.0;
            return price * quantity;
        } 
        else if (item == "Puran Poli") 
        {
            price = 300.0;
            return price * quantity;
        } 
        else if (item == "Ariselu") 
        {
            price = 210.0;
            return price * quantity;
        } 
        else if (item == "Chocolate Fudge") 
        {
            price = 350.0;
            return price * quantity;
        } 
        else if (item == "Fruit Halwa") 
        {
            price = 320.0;
            return price * quantity;
        } 
        else if (item == "Gajar Ka Halwa") 
        {
            price = 280.0;
            return price * quantity;
        } 
        else if (item == "Moong Dal Halwa") 
        {
            price = 290.0;
            return price * quantity;
        } 
        else if (item == "Milk Cake") 
        {
            price = 310.0;
            return price * quantity;
        } 
        else if (item == "Kharwas") 
        {
            price = 270.0;
            return price * quantity;
        } 
        else if (item == "Rabri") 
        {
            price = 330.0;
            return price * quantity;
        } 
        else if (item == "Kalakand") 
        {
            price = 340.0;
            return price * quantity;
        } 
        else if (item == "Mango Shrikhand") 
        {
            price = 320.0;
            return price * quantity;
        } 
        else if (item == "Kesari Bath") 
        {
            price = 180.0;
            return price * quantity;
        } 
        else if (item == "Sweet Pongal") 
        {
            price = 210.0;
            return price * quantity;
        } 
        else 
        {
            System.out.println("Item not found in BlinkIt sweets inventory.");
            return -1; 
        }
    }
}    