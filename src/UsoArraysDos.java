public class UsoArraysDos {
    public static void main(String[] args) {
        int array_aleatorios[] = new int[150];

        for(int i=0; i<array_aleatorios.length; i++){
            array_aleatorios[i]=(int)Math.round(Math.random()*100);
        }

        for(int numeros:array_aleatorios){
            System.out.print(numeros+ ", ");
        }
    }
}
