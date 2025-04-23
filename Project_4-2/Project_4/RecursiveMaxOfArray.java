public class RecursiveMaxOfArray
{

    
    /**
     * Compute the maximum of a range of values in an array recursively.
     *
     * @param data   An array of integers.
     * @param from  The low index for searching for the maximum.
     * @param to    The high index for searching for the maximum.
     * 
     * preconditions: from LTE Zero to, from LTE 0, to LT length, length GT 0
     *                
     * @return     The maximum value in the array.
     */
    
    public  int max(int data[], int from, int to)
    {
        int result = 0;
        
        // ADD YOUR CODE HERE
//vvvvvvvvv ADDED CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv        

        if (data == null || data.length == 0 || from < 0 || to >= data.length || from > to) {
            throw new BadArgumentsForMaxException("Invalid input parameters.");
        }

        if (from == to) {
            result = data[from];
        } else {
            int middle = (from + to) / 2;
            int max1 = max(data, from, middle);
            int max2 = max(data, middle + 1, to);
            result = Math.max(max1, max2);
        }
        
        return result;
    }
    
    
}
