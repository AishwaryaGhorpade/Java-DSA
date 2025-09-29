public class LinearSeachInString {
    static boolean Search(String str,char target)
    {
        if(str.length()==0)
        {
            return false;
        }
        //using for loop
        // for(int i=0;i<str.length();i++)
        // {
        //     if(target==str.charAt(i))
        //     {
        //         return true;
        //     }
        // }

        //using for each loop
        for(char ch:str.toCharArray())
        {
            if (ch==target) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String str="Aishwarya";
        System.out.println(Search(str,'y'));
        System.out.println(Search(str,'c'));
    }
    
}
