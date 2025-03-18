class TopIplBatsMan {
   static String batsmen[] = {
        "MS Dhoni", "Shubman Gill", "David Warner", "Ruturaj Gaikwad", "Prithvi Shaw", "Shreyas Iyer", "KL Rahul", "Jos Buttler", "Hardik Pandya", "Suryakumar Yadav","Faf du Plessis", "Rahul Tewatia", "Shivam Dube", "Sanju Samson", "Glenn Maxwell",
        "Abhishek Sharma", "Devdutt Padikkal", "Manish Pandey", "Ishan Kishan", "Shane Watson", "Ambati Rayudu", "Dinesh Karthik", "Jonny Bairstow", "Prithvi Raj", "Riyan Parag","Deepak Hooda", "Tim David", "Rashid Khan", "Andre Russell", "Nitish Rana",
        "Jason Roy", "Liam Livingstone", "Mohammad Shami", "Tymal Mills", "Moeen Ali","Rashid Khan", "Sam Curran", "Rinku Singh", "Venkatesh Iyer", "Kuldeep Yadav", "Shahbaz Ahmed"};

    public static void main(String[] args) {
        System.out.println("main started ");
       
        getTopIplBatsmen();
        System.out.println("main ended");
    }

    public static void getTopIplBatsmen()
{
    System.out.println(" getTopIplBatsmen function started ");
    System.out.println("The top IPL batsmen of 2024 are:");

    for(String ref : batsmen)
        {
            System.out.println(ref);
        }
        System.out.println(" getTopIplBatsmen function ended ");

}
}
