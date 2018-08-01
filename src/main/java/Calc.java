class Calc {
    int sum;
    Calc(int a,int b,String operation){
        if(operation.startsWith("+")){
            sum=a+b;
        }else if (operation.startsWith("-"))
        {
            sum=a-b;
        }
        else if(operation.startsWith("*"))
        {sum=a*b;
        }
        else if(operation.startsWith("/")){
            sum=a/b;
        }
    }
}
