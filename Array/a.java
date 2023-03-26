import java.util.Random;

class a {
    // Declare and construct variables
    Random randomnum = new Random();
    int fnum, snum, answer;
    int mathnumber = randomnum.nextInt(20);
    int newnumber = randomnum.nextInt(20);

    // Declare the operator
    String[] Operators = { "+", "-", "/", "*" };
   

    for(
    int i = 0;i<operators.length;i++)
    {
        int randomIndex = randomnum.nextInt(4);
        
        if (Operators.equals("+"))
            answer = fnum + snum;
        else if (Operators.equals("-"))
            answer = fnum - snum;
        else if (Operators.equals("/"))
            answer = fnum / snum;
        else if (Operators.equals("*"))
            answer = fnum * snum;

    }

    // Declare and construct variables of math problem
    fnum=mathnumber;snum=newnumber;

    // Output of math problem
    System.out.print(fnum);
    System.out.print(Operators);
    System.out.println(snum);

}

