import java.util.Scanner;
class DS_Stack {
    int size;
    int arr[];
    int peek;
    int capacity;
    char continueLoop = 'Y';
    Scanner scanner = new Scanner(System.in);

    DS_Stack(int size){
        this.size = size;
        arr = new int[size];
        capacity = size;
        peek = -1;
    }

    boolean isFull () {
        if((peek+1)==size)
        return true;
        else
        return false;
    }

    boolean isEmpty () {
        if(peek==-1)
        return true;
        else
        return false;
    }

    void push () {
        if( isFull() ) {
            System.out.println("stack is overflowed");
            System.exit(1);
        }
        System.out.print("Please enter new value to push: ");
        int pushValue = scanner.nextInt();
        arr[++peek]=pushValue;

        showStackValue();
    }

    void pull () {
        if ( isEmpty() ) {
            System.out.println("Error: Stack is empty");
            System.exit(1);
        }

        int peekValue = arr[peek--];

        System.out.println("poped value is "+peekValue);

        showStackValue();
    } 

    void showStackValue () {
        System.out.println(' ');
        for ( int item = 0; item < (peek+1); ++item) { 
            System.out.print(arr[item]+" ,");
        }
    }
    
    void looping () {
        
        while(continueLoop == 'Y' || continueLoop == 'y') { 
            System.out.println("Please select any option from of these \n 1 for push \n 2 for pop ");
            int selectOption = scanner.nextInt();
            switch (selectOption) {
                case 1:
                    push();
                    break;
                
                case 2:
                    pull();
                    break;
                default:
                    System.out.println("ERROR: please select correct");
                    break;
            }

            System.out.print("\nif you want you continue please Enter y:");
            continueLoop = scanner.next().charAt(0);
        }
    }

    public static void main(String args[]) {
        DS_Stack obj = new DS_Stack(5);
        obj.looping();
    }

}