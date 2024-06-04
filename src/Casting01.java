public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint

        
        //Declare and initialize a short with a value of 128
        short valorShort = 128;
        //Create a print statement that casts this short to a byte
        byte valorByteDeShort = (byte) valorShort;
        System.out.println("O valor de short convertido para byte é: " + valorByteDeShort);
        

        
        
        //Declare and initialize a byte with a value of 127
        byte valorByte = 127;
        System.out.println("Valor inicial do byte: " + valorByte);
        
        //Add 1 to this variable and print it
        valorByte += 1;
        System.out.println("Valor do byte apos adicionar 1: " + valorByte);
        
        //Add 1 to this variable again and print it again
        valorByte+= 1;
        System.out.println("Valor do byte apos adicionar 1 novamente: " + valorByte);

        
        
        
    }    
}
