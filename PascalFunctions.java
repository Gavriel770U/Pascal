public class PascalFunctions
{
    int[] getPascalArray(int pascalTriangleHeight)
    {
        // the array length is actually the Nth element of the geometric series
        // 1+2+3+...+n
        // We will use the formula Sn = an² + bn + c
        // S0 = 0 = a*(0)² + b*(0) + c => c = 0
        // S1 = 1 = a*(1)² + b*(1) + 0 => a + b = 1
        // S2 = 3 = a*(2)² + b*(2) + 0 => 4*a + 2*b = 3
        // If we solve the equation's system we get a = 0.5 = b
        // Thus, we get the formula:
        // Sn = 0.5*n² + 0.5*n = (n * (n + 1)) / 2

        final int ARR_LENGTH = (int)((pascalTriangleHeight * (pascalTriangleHeight+1)) / 2);
        
        if(ARR_LENGTH <= 0)
        {
            return null;
        }

        int[] arr = new int[ARR_LENGTH];
        arr[0] = 1;

        if(1 == ARR_LENGTH)
        {
            return arr;
        }

        arr[1] = 1;
        arr[2] = 1;


        
        return null;
    }

    void modPascalArray(int[] pascalArr, int mod)
    {

    }
}