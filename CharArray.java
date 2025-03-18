class CharArray
{
   static  char chars[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    public static void main(String[] args)
    {
        System.out.println("main started ");
        getCharacters();
        System.out.println("main ended");
    }
    public static void getCharacters()
    {
        System.out.println(" getchar function started ");
        System.out.println("The list of characters are:");
        for(char ref: chars)
        {
            System.out.println(ref);
        }
        System.out.println(" getchar function ended ");


    }
}

