class Logic
{
    void checkSign(int num)
    {
        if (num > 0)
            System.out.println(num + " positive");
        else if (num < 0)
            System.out.println(num + " negative");
        else
            System.out.println(" zero");
    }
}

class program18_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}
