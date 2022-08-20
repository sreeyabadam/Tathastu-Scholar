class Transpose{
    public static void main(String []args){
        int matrix[][]={{1,3,2},{4,3,2},{4,2,7}};
        int transpose[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                transpose[i][j]=matrix[j][i] ;
            }
        }
        System.out.println("The matrix given is: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The transpose of the matrix given is: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
