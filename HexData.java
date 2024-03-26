public class HexData {

    //turn a one digit 
public static String bitConverter(int a){

    //return a fourdigitnum
    String fourdigitnum = "";

    //divide the number by 8, 4, 2 and 1 respectively if the answer is greater then one return a 1, else return a 0, subtract number if divisible
    if(a/8 == 1){

        fourdigitnum += '1';
        a -= 8;

    }
    else{

        fourdigitnum += '0';
    }

    if(a/4 == 1){

        fourdigitnum += '1';
        a -= 4;

    }
    else{

        fourdigitnum += '0';
    }
    if(a/2 == 1){

        fourdigitnum += '1';
        a -= 2;

    }
    else{

        fourdigitnum += '0';
    }
    if(a/1 == 1){

        fourdigitnum += '1';
        a -= 1;

    }
    else{

        fourdigitnum += '0';
    }

    //return string
    return fourdigitnum;



} 

//convert binary to decimal 
public static int decimalConverter(String binary){

    int decimal = 0; //decimal to return
    int power = 7; //power of bit
    for(int x = 0; x < binary.length(); x++){
        //add 2^power of the bit to the decimal
        decimal += Character.getNumericValue(binary.charAt(x))*Math.pow(2,power);
        power--; //decrement the power
    }

    return decimal;
}

    
    public static void main(String[] args){

        //data section
        String[] hex = {"0x0000000A",
                        "0x00000006" ,
                        "0x0000002C" ,
                        "0x00000045" ,
                        "0x00000001" ,
                        "0x00000007" ,
                        "0x00000000" ,
                        "0x00000001" ,
                        "0x00000005" ,
                        "0x0000000A" ,
                        "0x00000055" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000" ,
                        "0x00000000",
                        "0x00000000",
                        "0x00000000",
                        "0x00000000"};

//store binary code
String[] binary = new String[hex.length];

//read each line then turn it into binary
for(int x = 0; x < hex.length; x++){

    //declare binary number to store 
    binary[x] = "";
    //only worry about last two digits
    for(int y = 8; y < hex[x].length(); y++){
        //convert hex digit to binary

        if(hex[x].charAt(y) == 'A'){

            binary[x] += bitConverter(10);

        }
        else if(hex[x].charAt(y) == 'B'){

            binary[x] += bitConverter(11);

        }
        else if(hex[x].charAt(y) == 'C'){

            binary[x] += bitConverter(12);

        }
        else if(hex[x].charAt(y) == 'D'){

            binary[x] += bitConverter(13);

        }
        else if(hex[x].charAt(y) == 'E'){

            binary[x] += bitConverter(14);

        }
        else if(hex[x].charAt(y) == 'F'){

            binary[x] += bitConverter(15);

        }
        else{
        binary[x] += bitConverter(Character.getNumericValue(hex[x].charAt(y)));
        }

    }
}

//print out binary numbers
System.out.println("binary");
for(int x = 0; x < binary.length; x++){
    System.out.println(binary[x]);
}

//print out decimals
System.out.println("decimal");
for(int x = 0; x < binary.length; x++){
    System.out.println(decimalConverter(binary[x]));
}
    }


}
