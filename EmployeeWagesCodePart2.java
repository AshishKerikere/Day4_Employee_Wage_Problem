package EmployeeWageComputation;
public class employee_Hours {
    public static void main(String[] args){

        int days = 0;
        int wage = 0;
        int hrs = 0;

        while(hrs <= 100 && days <= 20){
            int rand = (int)Math.floor(Math.random()*3+1);
            hrs = hrs + hours(rand);
            days++;
        }
        wage = hrs*20;

        System.out.println("the wage recieved is " +wage);
    }

     static int hours(int a){
        int hr = 0;
        switch (a){
            case 1: hr = 0;
                    break;
            case 2: hr = 4;
                    break;
            case 3: hr = 8;
                    break;
        }
        return hr;
    }
}
