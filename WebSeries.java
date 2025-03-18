class WebSeries
{
    static String hindiSeries[] = { "Sacred Games", "Mirzapur", "The Family Man", "Kashmir Files", "Paatal Lok","Inside Edge", "Breathe", "Special Ops", "Asur", "Bard of Blood"};
    static String tamilMovies[] = { "Kabali", "Master", "Vikram", "Mersal", "Kaithi","Soorarai Pottru", "Visaranai", "Kaakka Muttai", "Ratsasan", "96"};
    static String teluguMovies[] = {"Baahubali: The Beginning", "Baahubali: The Conclusion", "Arjun Reddy", "Maharshi", "RRR", "Eega", "Kshana Kshanam", "Fidaa", "Geetha Govindam", "Pelli Sandadi"};
    static String englishSeries[] = { "Breaking Bad", "Game of Thrones", "Stranger Things", "The Crown", "Friends","Money Heist", "The Office", "Narcos", "Peaky Blinders", "The Mandalorian"};
    public static void main(String[] args)
    {
    
        System.out.println("main started ");
        getwebseries();
        System.out.println("main ended");
    }

    public static void getwebseries()
    {
        System.out.println("get web series function stared");
        System.out.println("the list of web series are ");
        System.out.println();
        System.out.println("the list of telugu movies are");
        for(String telugu : teluguMovies)
        {
             System.out.println(telugu);
        }
        System.out.println();

        System.out.println("the list of english movies are");

        for(String english:  englishSeries)
        {
            System.out.println(english);
        }     
        System.out.println();


        System.out.println("the list of tamil movies are");

        for(String tamil : tamilMovies)
        {
            System.out.println(tamil);
        }
        System.out.println();

         System.out.println("the list of hindi movies are");

        for(String hindi:  hindiSeries)
        {
            System.out.println(hindi);
        }
        System.out.println();

         System.out.println("get web series function ended");
    }
}
