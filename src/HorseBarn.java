public class HorseBarn {
    private Horse[] spaces;
    public HorseBarn(Horse[] spaces)
    {
        this.spaces = spaces;
    }
    public int findHorseSpace(String name)
    {
        int i = 0;
        for(Horse h : spaces)
        {
            if(h != (null) && h.getName().equalsIgnoreCase(name))
            {
                return i;
            }
            i++;
        }
        return -1;
    }
    public void consolidate()
    {
        for(int i = 0; i < spaces.length; i++)
        {
            if(spaces[i] == null)
            {
                int b = i;
                while (b < spaces.length && spaces[b] == null)
                {
                    b++;
                }
                if(b < spaces.length && spaces[b] != null)
                {
                    spaces[i] = spaces[b];
                    spaces[b] = null;
                }
            }
        }
    }
}
