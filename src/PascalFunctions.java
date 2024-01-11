public class PascalFunctions
{
    private final static String SPACE = " ";
    private final static int ZERO = 0;
    private final static int ONE_ELEM = 0;
    private final static int INC = 1;
    private final static int DEC = 1;
    private final static int GET_HALF = 2;
    private final static int FIRST_PASCAL_VAL = 1;
    private final static int FIRST_IDX = 0;
    private final static int SECOND_IDX = 1;
    private final static int THIRD_IDX = 2;

    public static<T> void println(T info)
    {
        System.out.println(info);
    }
        
    public static<T> void print(T info)
    {
        System.out.print(info);
    }

    public static int[] getPascalArray(int pascalTriangleHeight)
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

        final int ARR_LENGTH = (int)((pascalTriangleHeight * (pascalTriangleHeight + INC)) / GET_HALF);
        int i = 3;
        int progress = 0;
        int level = 3;

        if(ARR_LENGTH <= ZERO)
        {
            return null;
        }

        int[] arr = new int[ARR_LENGTH];
        arr[FIRST_IDX] = FIRST_PASCAL_VAL;

        if(ONE_ELEM == ARR_LENGTH)
        {
            return arr;
        }

        arr[SECOND_IDX] = FIRST_PASCAL_VAL;
        arr[THIRD_IDX] = FIRST_PASCAL_VAL;

        for(; i < arr.length; i++)
        {
            if(ZERO == progress || level - DEC == progress)
            {
                arr[i] = FIRST_PASCAL_VAL;
            }
            else
            {
                arr[i] = arr[i - level] + arr[i - level + INC];
            }

            progress++;
            if(ZERO == progress % level)
            {
                level++;
                progress = 0;
            }
        }
        
        return arr;
    }

    public static void modPascalArray(int[] pascalArr, int mod)
    {
        int i = 0;

        for(i = 0; i < pascalArr.length; i++)
        {
            pascalArr[i] %= mod;
        }
    }

    public static void printPascalArray(int[] pascalArr)
    {
        int i = 0;
        int progress = 0;
        int level = 1;

        for(i = 0; i < pascalArr.length; i++)
        {
            print(pascalArr[i] + SPACE);
            
            progress++;
            if(ZERO == progress % level)
            {
                println(SPACE);
                level++;
                progress = 0;
            }
        }
    }
}
