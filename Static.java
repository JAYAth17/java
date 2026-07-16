class Football
{
    static String sport = "Football";
    String team;

    Football(String t)
    {
        team = t;
    }

    void display()
    {
        System.out.println("Sport: " + sport);
        System.out.println("Team: " + team);
    }

    public static void main(String[] args)
    {
        Football f1 = new Football("Brazil");
        Football f2 = new Football("Argentina");

        f1.display();
        f2.display();
    }
}
