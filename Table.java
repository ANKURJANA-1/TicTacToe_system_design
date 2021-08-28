class Table{

    public static int[][] grid;
    public static  int size = 0;
    private static int count=0;

    public Table(int len){
        this.size=len;
        grid = new int [this.size][this.size];
        initGrid();
    }


    private void initGrid(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                grid[i][j]=-1;
            }
        }
    }


    public static void showTable(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(grid[i][j]+" | ");
            }
            System.out.println(" ");
        }
    }

    public static void inputRoute(int input,int user){
        switch(input){
            case 1:
                if(grid[0][0]==-1){
                    if(user==1){
                        grid[0][0]=0;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }else{
                        grid[0][0]=1;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }
                }else{
                    System.out.println("Already Filled");
                }
                break;
            case 2:
                if(grid[0][1]==-1){
                    if(user==1){
                        grid[0][1]=0;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }else{
                        grid[0][1]=1;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }
                }else{
                    System.out.println("Already Filled");
                }
                break; 
            case 3:
                if(grid[0][2]==-1){
                    if(user==1){
                        grid[0][2]=0;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }else{
                        grid[0][2]=1;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }
                }else{
                    System.out.println("Already Filled");
                }
                break; 
            case 4:
                if(grid[1][0]==-1){
                    if(user==1){
                        grid[1][0]=0;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }else{
                        grid[1][0]=1;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }
                }else{
                    System.out.println("Already Filled");
                }
                break; 
            case 5:
                if(grid[1][1]==-1){
                    if(user==1){
                        grid[1][1]=0;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }else{
                        grid[1][1]=1;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }
                }else{
                    System.out.println("Already Filled");
                }
                break;
            case 6:
                if(grid[1][2]==-1){
                    if(user==1){
                        grid[1][2]=0;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                        
                    }else{
                        grid[1][2]=1;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }
                }else{
                    System.out.println("Already Filled");
                }
                break;  
            case 7:
                if(grid[2][0]==-1){
                    if(user==1){
                        grid[2][0]=0;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }else{
                        grid[2][0]=1;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }
                }else{
                    System.out.println("Already Filled");
                }
                break;
            case 8:
                if(grid[2][1]==-1){
                    if(user==1){
                        grid[2][1]=0;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }else{
                        grid[2][1]=1;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }
                }else{
                    System.out.println("Already Filled");
                }
                break;
            case 9:
                if(grid[2][2]==-1){
                    if(user==1){
                        grid[2][2]=0;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }else{
                        grid[2][2]=1;
                        count++;
                        if(validateWin(user)){
                            System.out.println(user+" win");
                        }
                    }
                }else{
                    System.out.println("Already Filled");
                }
                break;                        
        }
    }

    private static boolean validateWin(int user){
        if(leftDiagonl(user)){
            return true;
        }else if(rightDigonl(user)){
            return true;
        }else if(zeroLevel(user)){
            return true;
        }else if(oneLevel(user)){
            return true;
        }else if(twoLevel(user)){
            return true;
        }
        return false;
    }

    private static boolean leftDiagonl(int user){
        boolean val=false;

        for(int i=0;i<size;i++){
            if(grid[i][i]==user){
                val =true;
            }
        }
        return val;
    }

    private static boolean rightDigonl(int user){
        boolean val=false;

       if(grid[0][2]==user && grid[1][1]==user && grid[2][0]==user){
        val=true;
       }
       return val;
    }

    private static boolean zeroLevel(int user){
        boolean val=false;

        for(int i=0;i<size;i++){
            if(grid[0][i]==user){
                val =true;
            }
        }
        return val;
    }

    private static boolean oneLevel(int user){
        boolean val=false;

        for(int i=0;i<size;i++){
            if(grid[1][i]==user){
                val =true;
            }
        }
        return val;
    }

    private static boolean twoLevel(int user){
        boolean val=false;

        for(int i=0;i<size;i++){
            if(grid[2][i]==user){
                val =true;
            }
        }
        return val;
    }
}