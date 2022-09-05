package BasicJavaPrograms;

public class SubtractingValuesFromTwoArrays {
    public static void main(String[] args)
    {
        int[] list1 = {4,2,1};
        int[] list2 = {2,2,4};
        int[] list3 = new int[list1.length];

        //Looping the list
        for(int i =0; i< list1.length; i++)
        {
            list3[i] = list1[i] - list2[i];
        }

        //Print Statement
        for(int j =0; j< list3.length; j++)
        {
            System.out.println(list3[j]);
        }
    }
}
